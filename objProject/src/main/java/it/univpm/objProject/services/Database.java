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

//import org.json.JSONArray;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.JSONValue;
import org.json.simple.parser.ParseException;

public class Database {

	public static JSONArray CreateDatabase() {
		
		String[] file_names = new String[5];
		file_names[0] = "testo 1.txt";
		file_names[1] = "testo 2.txt";
		file_names[2] = "testo 3.txt";
		file_names[3] = "testo 4.txt";
		file_names[4] = "testo 5.txt";
		String url = "https://api.dropboxapi.com/2/files/list_revisions";
		JSONArray jarray = new JSONArray();
		
		for(int i = 0; i < (file_names.length) ; i++) {
			
		JSONObject jobj = new JSONObject();

		try {

			HttpURLConnection openConnection = (HttpURLConnection) new URL(url).openConnection();
			openConnection.setRequestMethod("POST");
			openConnection.setRequestProperty("Authorization",
					"Bearer pr_T679WTlMAAAAAAAAAAdP3NUW2_8fnYxQtslZ8WM_UhjjiOVex7gaPlO2_Fy_d");
			openConnection.setRequestProperty("Content-Type", "application/json");
			openConnection.setRequestProperty("Accept", "application/json");
			openConnection.setDoOutput(true);
			
		
			String jsonBody = "{\r\n" + "    \"path\": \"/TxtDoc/" + file_names[i] + "\",\r\n" +
							  "    \"mode\": \"path\",\r\n"+
							  "    \"limit\": 100\r\n" + "}";

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
			 //System.out.println("OK");
		} catch (IOException | ParseException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
		jarray.add(i, jobj);
		}
		return jarray;
	}
}

