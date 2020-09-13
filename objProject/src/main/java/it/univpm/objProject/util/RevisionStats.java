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
		
		Entry en1 = new Entry();
		en1.setServer_modified((String)jobj.get("key"));
		
		Stats st = new Stats();
		Database re2 = new Database();
		ArrayList<Revision> re = re2.CreateDatabase(); 
		
		
		long convert_seconds1 = en1.server_modified.getEpochSecond();
		long convert_seconds2 = convert_seconds1 - 86400;
		
		for(int i = 0; i < re.size(); i++) {
			ArrayList<Entry> ent = re.get(i).getEntries();
			for(int j = 0; j < ent.size(); j++) {
				Entry en = ent.get(j);
				long modify_sec = en.getServer_modified().getEpochSecond();
				if(modify_sec >= convert_seconds2 && modify_sec <= convert_seconds1) {
					st.setRev_per_day(1);
					
				}
			}
		}
		 
		return st;
		
	}

}
