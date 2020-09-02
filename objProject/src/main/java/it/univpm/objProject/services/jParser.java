package it.univpm.objProject.services;
import it.univpm.objProject.model.*;
import java.util.*;
import java.time.LocalDateTime;

//import java.net.URLConnection;
//import java.nio.file.Files;
//import java.nio.file.Paths;

//import org.json.simple.JSONArray;
import org.json.simple.JSONObject;


public class jParser {
	
	public ArrayList<Revision> jParsing(){
		
		ArrayList<Revision> revisions = new ArrayList<Revision>();
		JSONObject jobj = Database.CreateDatabase();
		for(int i = 0; i < jobj.size(); i++) {
			
			Revision revi = new Revision();
			JSONObject curobj = (JSONObject) jobj.get(i);
			
			revi.setIs_deleted((Boolean) curobj.get("is_deleted"));
			
			Entry ent = new Entry();
			JSONObject enobj = (JSONObject) jobj.get("entries");
			
			for(int j = 0; j < enobj.size(); j++) {
				
				ent.setName((String) enobj.get("name"));
				ent.setPath_lower((String) enobj.get("path_lower"));
				ent.setPath_display((String) enobj.get("path_display"));
				ent.setId((String) enobj.get("id"));
				ent.setClient_modified((LocalDateTime) enobj.get("client_modified"));
				ent.setServer_modified((LocalDateTime) enobj.get("server_modified"));
				ent.setRev((String) enobj.get("rev"));
				ent.setSize((long) enobj.get("size"));
				ent.setIs_downloadable((Boolean) enobj.get("is_downloadable"));
				ent.setContent_hash((String) enobj.get("content_hash"));
				}
			
			revi.setEntries(ent);
			revisions.add(revi);
			
			}
		
		return revisions;
		
	}
}
