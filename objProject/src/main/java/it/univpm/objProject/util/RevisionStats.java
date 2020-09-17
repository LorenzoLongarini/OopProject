package it.univpm.objProject.util;

import java.util.ArrayList;

import org.json.simple.JSONObject;

import it.univpm.objProject.model.Entry;
import it.univpm.objProject.model.Revision;
import it.univpm.objProject.model.Stats;
import it.univpm.objProject.services.Database;
import it.univpm.objProject.exception.GenericExternalException;
import it.univpm.objProject.exception.GenericInternalException;

/**
 * La seguente classe permette di effettuare statistiche sulle revisioni scaricate nel database.
 * In ingresso viene ricevuto l'oggetto inserito in Postman, il quale viene inserito in un oggetto di tipo Entry.
 * Una volta scaricato il json ed inserito nell'opportuno array: si scorre l'array e si effettuano dei controlli:
 * se i parametri rispettano le condizioni allora viene prima settato il nome dell'oggetto Stats che verrà
 * restituito e il numero di revisioni giornaliere e settimanali.
 * Per settare i tempi medi viene sfruttata un'altra classe di tipo Stats e poi i dati inseriti in due opportuni
 * arraylist: si scorrono questi ultimi così da ricavare il tempo medio tra una revisione e le precedenti. 
 * 
 * @see Revision
 * @see Entry
 * @see Stats
 * @see Database
 * @see RevisionService
 * @see RevisionServiceImpl
 * @see Controller
 * @author Lorenzo
 *
 */
public class RevisionStats {

	/**
	 * @param jobj
	 * @return st, un oggetto di tipo Stats che contiene le informazioni relative alle statistiche
	 * su numerosità e tempi medi per giorno e per settimana
	 * @throws GenericInternalException
	 * @throws GenericExternalException
	 */
	public Stats create_stats(JSONObject jobj) throws GenericInternalException, GenericExternalException {

		Entry en1 = new Entry();
		try {
			en1.setServer_modified((String) jobj.get("server_modified"));
			en1.setName((String) jobj.get("name"));
		} catch (Exception e) {
			throw new GenericExternalException(
					"chiavi inserite errate, "
					+ "inserire: 'server_modified' come prima chiave e 'name' come seconda chiave");
		}

		Database re2 = new Database();
		ArrayList<Revision> re = re2.CreateDatabase();
		ArrayList<Entry> ent_arr = new ArrayList<Entry>();

		Stats st = new Stats();
		Stats stat_appoggio;
		ArrayList<Stats> stat_arr1 = new ArrayList<Stats>();
		ArrayList<Stats> stat_arr2 = new ArrayList<Stats>();

		long convert_seconds = en1.getServer_modified().getEpochSecond();
		long p_day = convert_seconds - 86400;
		long p_week = convert_seconds - 604800;
		long tot_sec_d = 0;
		long tot_sec_w = 0;

		for (int i = 0; i < re.size(); i++) {
			ent_arr = re.get(i).getEntries();
			for (int j = 0; j < ent_arr.size(); j++) {
				if (ent_arr.get(j).getName().compareTo(en1.getName()) == 0) {
		
					st.setName(en1.getName());
					if (ent_arr.get(j).getServer_modified().getEpochSecond() >= p_day
							&& ent_arr.get(j).getServer_modified().getEpochSecond() <= convert_seconds) {

						st.setRev_prev_day(1);
						stat_appoggio = new Stats();
						stat_appoggio.setAv_time_prev_day(ent_arr.get(j).getServer_modified().getEpochSecond());
						stat_arr1.add(stat_appoggio);
					}
					if (ent_arr.get(j).getServer_modified().getEpochSecond() >= p_week
							&& ent_arr.get(j).getServer_modified().getEpochSecond() <= convert_seconds) {

						st.setRev_prev_week(1);
						stat_appoggio = new Stats();
						stat_appoggio.setAv_time_prev_week(ent_arr.get(j).getServer_modified().getEpochSecond());
						stat_arr2.add(stat_appoggio);
					}
				}
			}
		}

		if (stat_arr1.size() <= 1) {
			throw new GenericInternalException(
					"Numero di revisioni giornaliere inferiori ad uno, impossibile ricavare tempi medi");
		} else {
			for (int k = 0; k < (stat_arr1.size() - 1); k++) {

				tot_sec_d += (stat_arr1.get(k).getAv_time_prev_day()
						- stat_arr1.get(k + 1).getAv_time_prev_day());

			}
		}

		if (stat_arr2.size() <= 1) {
			throw new GenericInternalException(
					"Numero di revisioni settimanali inferiori ad uno, impossibile ricavare tempi medi");
		} else {
			for (int k = 0; k < stat_arr2.size() - 1; k++) {

				tot_sec_w += (stat_arr2.get(k).getAv_time_prev_week()
						- stat_arr2.get(k + 1).getAv_time_prev_week());

			}
		}

		if (st.getRev_prev_day() == 0) {
			throw new GenericInternalException(
					"Numero di revisioni giornaliere inferiori ad uno, impossibile ricavare tempi medi");
		} else {
			st.setAv_time_prev_day((tot_sec_d) / (st.getRev_prev_day()));
		}

		if (st.getRev_prev_week() == 0) {
			throw new GenericInternalException(
					"Numero di revisioni settimanali inferiori ad uno, impossibile ricavare tempi medi");
		} else {
			st.setAv_time_prev_week((tot_sec_w) / (st.getRev_prev_week()));
		}

		return st;

	}

}
