package it.univpm.objProject.services;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
//import java.net.URI;
import java.net.URL;
//import java.net.URLConnection;
//import java.nio.file.Files;
//import java.nio.file.Paths;
import java.util.ArrayList;

//import org.json.JSONArray;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.JSONValue;
import org.json.simple.parser.ParseException;

import it.univpm.objProject.exception.GenericExternalException;
import it.univpm.objProject.exception.GenericInternalException;
import it.univpm.objProject.model.Entry;
import it.univpm.objProject.model.Revision;

/**
 * La seguente classe scarica il json per cinque volte, tanti quanti sono i file presenti in dropbox.
 * Ogni volta che il json viene scaricato, viene inserito in un oggetto di tipo Revision.
 * Infine l'oggetto viene aggiunto all'arraylist di tipo Revision.
 * @author Lorenzo
 *
 */
public class Database {

	/**
	 * @return revisions , un arraylist contenente tutte le revisioni relativi ai file nel dropbox
	 * @see Revision
	 * @see Entry
	 * @throws GenericInternalException
	 * @throws GenericExternalException
	 */
	public ArrayList<Revision> CreateDatabase() throws GenericInternalException, GenericExternalException {

		String[] file_names = new String[5];
		file_names[0] = "testo 1.txt";
		file_names[1] = "testo 2.txt";
		file_names[2] = "testo 3.txt";
		file_names[3] = "testo 4.txt";
		file_names[4] = "testo 5.txt";
		String url = "https://api.dropboxapi.com/2/files/list_revisions";

		ArrayList<Revision> revisions = new ArrayList<Revision>();

		for (int i = 0; i < (file_names.length); i++) {

			JSONObject jobj = new JSONObject();

			try {

				HttpURLConnection openConnection = (HttpURLConnection) new URL(url).openConnection();
				openConnection.setRequestMethod("POST");
				openConnection.setRequestProperty("Authorization",
						"Bearer pr_T679WTlMAAAAAAAAAAdP3NUW2_8fnYxQtslZ8WM_UhjjiOVex7gaPlO2_Fy_d");
				openConnection.setRequestProperty("Content-Type", "application/json");
				openConnection.setRequestProperty("Accept", "application/json");
				openConnection.setDoOutput(true);

				String jsonBody = "{\r\n" + "    \"path\": \"/TxtDoc/" + file_names[i] + "\",\r\n"
						+ "    \"mode\": \"path\",\r\n" + "    \"limit\": 100\r\n" + "}";

				try (OutputStream os = openConnection.getOutputStream()) {
					byte[] input = jsonBody.getBytes("utf-8");
					os.write(input, 0, input.length);
				}

				InputStream in = openConnection.getInputStream();

				String data = "";
				String line = "";
				try {
					InputStreamReader inR = new InputStreamReader(in);
					BufferedReader buf = new BufferedReader(inR);

					while ((line = buf.readLine()) != null) {
						data += line;
						System.out.println(line);
					}
				} finally {
					in.close();
				}

				jobj = (JSONObject) JSONValue.parseWithException(data);
			} catch (IOException | ParseException e) {
				e.printStackTrace();
			} catch (Exception e) {
				e.printStackTrace();
			}
			try {
				Revision rv = new Revision();
				rv.setIs_deleted((boolean) jobj.get("is_deleted"));

				Entry ent;
				JSONArray enobj = (JSONArray) jobj.get("entries");

				for (int j = 0; j < enobj.size(); j++) {
					ent = new Entry();
					JSONObject jobj2 = (JSONObject) enobj.get(j);
					ent.setName((String) jobj2.get("name"));
					ent.setPath_lower((String) jobj2.get("path_lower"));
					ent.setPath_display((String) jobj2.get("path_display"));
					ent.setId((String) jobj2.get("id"));
					ent.setClient_modified((String) jobj2.get("client_modified"));
					ent.setServer_modified((String) jobj2.get("server_modified"));
					ent.setRev((String) jobj2.get("rev"));
					ent.setSize((long) jobj2.get("size"));
					ent.setIs_downloadable((Boolean) jobj2.get("is_downloadable"));
					ent.setContent_hash((String) jobj2.get("content_hash"));
					rv.setEntries(ent);
				}

				revisions.add(rv);
			} catch (Exception e) {
				throw new GenericExternalException("Errore nel settaggio del file json");
			}
		}
		return revisions;

	}
}
