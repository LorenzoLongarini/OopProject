package it.univpm.objProject.util;

import java.util.ArrayList;

import org.json.simple.JSONObject;

import it.univpm.objProject.model.Entry;
import it.univpm.objProject.model.Revision;
import it.univpm.objProject.model.Stats;
import it.univpm.objProject.services.Database;

public class RevisionStats {

	public Stats create_stats(JSONObject jobj) {

		Entry en1 = new Entry();
		en1.setServer_modified((String) jobj.get("server_modified"));
		en1.setName((String) jobj.get("name"));

		Database re2 = new Database();
		ArrayList<Revision> re = re2.CreateDatabase();
		ArrayList<Entry> ent_arr = new ArrayList<Entry>();

		Stats st = new Stats();
		Stats stat_appoggio;
		ArrayList<Stats> stat_arr1 = new ArrayList<Stats>();
		ArrayList<Stats> stat_arr2 = new ArrayList<Stats>();

		long convert_seconds = en1.getServer_modified().getEpochSecond(); // modifica da public a private
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
		try {
			for (int k = 0; k <= (stat_arr1.size() - 2); k++) {

				tot_sec_d += (stat_arr1.get(k).getAv_time_prev_day() - stat_arr1.get(k + 1).getAv_time_prev_day());
				System.out.println(stat_arr1.get(k).getAv_time_prev_day());

			}
		} catch (Exception e) {
			System.out.println("Numero revisioni troppo basso");
		}

		for (int k = 0; k <= stat_arr2.size() - 2; k++) {

			tot_sec_w += (stat_arr2.get(k).getAv_time_prev_week() - stat_arr2.get(k + 1).getAv_time_prev_week());

		}
		for (int k = 0; k < stat_arr1.size(); k++) {

		}
		for (int k = 0; k < stat_arr2.size(); k++) {

		}

		try {
			st.setAv_time_prev_day((tot_sec_d) / (st.getRev_prev_day()));
		} catch (Exception e) {

		}

		try {
			st.setAv_time_prev_week((tot_sec_w) / (st.getRev_prev_week()));
		} catch (Exception e) {

		}
		return st;

	}

}
