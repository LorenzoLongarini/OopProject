package it.univpm.objProject.util;

//import java.time.Instant;
import java.util.ArrayList;

import org.json.simple.JSONObject;

import it.univpm.objProject.model.Entry;
import it.univpm.objProject.model.Revision;
import it.univpm.objProject.model.Stats;
import it.univpm.objProject.services.Database;

public class RevisionStats {

	public Stats create_stats(JSONObject jobj) {

		Entry en1 = new Entry();
		en1.setServer_modified((String) jobj.get("key"));
		en1.setName((String) jobj.get("name"));

		Stats st = new Stats();

		Database re2 = new Database();
		ArrayList<Revision> re = re2.CreateDatabase();
		ArrayList<Stats> entstat = new ArrayList<Stats>();
		//ArrayList<Stats> entstatw = new ArrayList<Stats>();
		
		long convert_seconds = en1.getServer_modified().getEpochSecond(); // modifica da public a private
		long convert_seconds_d = convert_seconds - 86400;
		long convert_seconds_w = convert_seconds - 604800;
		long tot_sec_d = 0;
		long tot_sec_w = 0;

		for (int i = 0; i < re.size(); i++) {
			ArrayList<Entry> ent = re.get(i).getEntries();
			for (int j = 0; j < ent.size(); j++) {
				Entry en = ent.get(j);
				Stats stat = new Stats();

				if (en.getName().compareTo(en1.getName()) == 0) {
					st.setName(en1.getName());
					long modify_sec = en.getServer_modified().getEpochSecond();
					if (modify_sec >= convert_seconds_d && modify_sec <= convert_seconds) {
						st.setRev_per_day(1);
						stat.setAv_time_per_day(modify_sec);
						entstat.add(stat);
						//tot_sec_d = st.add_Sec(modify_sec);
					}
					if (modify_sec >= convert_seconds_w && modify_sec <= convert_seconds) {
						st.setRev_per_week(1);
						stat.setAv_time_per_week(modify_sec);
						entstat.add(stat);
						//tot_sec_w = st.add_Sec(modify_sec);
					}
				}
			}
		}
		for(int k = 0; k < entstat.size() - 1 ; k++) {
			tot_sec_d += entstat.get(k).getAv_time_per_day() - entstat.get(k+1).getAv_time_per_day();
			tot_sec_w += entstat.get(k).getAv_time_per_week() - entstat.get(k+1).getAv_time_per_week();
		}
		
		st.setAv_time_per_day((tot_sec_d)/st.getRev_per_day());
		st.setAv_time_per_week((tot_sec_w)/st.getRev_per_week());

		return st;

	}

}
