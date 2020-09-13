package it.univpm.objProject.util;

import java.time.Instant;
import java.util.ArrayList;

import org.json.simple.JSONObject;

import it.univpm.objProject.model.Entry;
import it.univpm.objProject.model.FilteredRev;
import it.univpm.objProject.model.Revision;
import it.univpm.objProject.model.Stats;
import it.univpm.objProject.services.Database;

public class RevisionStats {
	
	public Stats create_stats(JSONObject jobj){

		FilteredRev frv = new FilteredRev();
		frv.setServer_modified((String)jobj.get("key"));
		
		//ArrayList<Stats> st_arr = new ArrayList<Stats>();
		Stats st = new Stats();
		Database re2 = new Database();
		ArrayList<Revision> re = re2.CreateDatabase(); 
		
		//String convert = jobj.toString();
		
		Instant convert_date = Instant.parse(frv.server_modified);
		long convert_seconds = convert_date.getEpochSecond();
		
		for(int i = 0; i < re.size(); i++) {
			ArrayList<Entry> ent = re.get(i).getEntries();
			for(int j = 0; j < ent.size(); j++) {
				Entry en = ent.get(j);
				long modify_sec = en.getServer_modified().getEpochSecond();
				if(modify_sec <= convert_seconds) {
					//st = new Stats();
					st.setRev_per_day(1);
					
				}
			}
		}
		 
		return st;
		
	}

}
