package it.univpm.objProject.services;

import java.util.ArrayList;

import it.univpm.objProject.model.Metadata;
import it.univpm.objProject.model.Revision;
import it.univpm.objProject.model.Stats;

import org.json.simple.JSONObject;
//import it.univpm.objProject.services.Database;
//import it.univpm.objProject.services.jParser;
import org.springframework.stereotype.Service;

import it.univpm.objProject.util.MetadataArray;
import it.univpm.objProject.util.RevisionStats;

@Service
public class RevisionServiceImpl implements RevisionService {

	@Override
	public ArrayList<Revision> RevisionVisual() {

		Database re2 = new Database();
		ArrayList<Revision> re = re2.CreateDatabase();
		return re;

	}

	@Override
	public ArrayList<Metadata> MetadataVisual() {
		MetadataArray ma = new MetadataArray();
		return ma.metadataArrCreat();
	}

	@Override
	public Stats StatsVisual(JSONObject jobj) {
		RevisionStats rv_st = new RevisionStats();
		Stats st = new Stats();
		st = rv_st.create_stats(jobj);
		return st;
	}

}
