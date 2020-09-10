package it.univpm.objProject.services;

import it.univpm.objProject.model.*;

//import java.time.LocalDateTime;
//import java.time.format.DateTimeFormatter;

//import java.time.LocalDateTime;

import org.json.simple.JSONArray;

import org.json.simple.JSONObject;

public class jParser {

	public Revision jParsing() {

		Revision revisions = new Revision();
		JSONObject jobj = Database.CreateDatabase();

		revisions.setIs_deleted((boolean) jobj.get("is_deleted"));

		Entry ent = new Entry();
		JSONArray enobj = (JSONArray) jobj.get("entries");

		for (int j = 0; j < enobj.size(); j++) {
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
			revisions.setEntries(ent);
		}

		return revisions;

	}
}
