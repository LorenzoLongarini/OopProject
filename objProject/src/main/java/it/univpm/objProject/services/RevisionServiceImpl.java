package it.univpm.objProject.services;

import java.util.ArrayList;

import it.univpm.objProject.exception.GenericExternalException;
import it.univpm.objProject.exception.GenericInternalException;
import it.univpm.objProject.model.Metadata;
import it.univpm.objProject.model.Revision;
import it.univpm.objProject.model.Stats;
//import it.univpm.objProject.exception.GenericInternalException;
import org.json.simple.JSONObject;
//import it.univpm.objProject.services.Database;
//import it.univpm.objProject.services.jParser;
import org.springframework.stereotype.Service;

import it.univpm.objProject.util.MetadataArray;
import it.univpm.objProject.util.RevisionStats;

/**
 * Implementazione della classe RevisionService, in cui le varie funzioni
 * dell'interfaccia vengono implementate.
 * 
 * @see RevisionService
 * @see it.univpm.objProject.controller.restController
 * @see Revision
 * @see Stats
 * @see MetadataArray
 * @see RevisionStats
 * @see Database
 * @author Lorenzo Longarini
 *
 */
@Service
public class RevisionServiceImpl implements RevisionService {

	/**
	 * @return re, un arraylist di revision contenente tutte le revisioni di ogni
	 *         file nel dropbox
	 */
	@Override
	public ArrayList<Revision> RevisionVisual() throws GenericInternalException, GenericExternalException {

		Database re2 = new Database();
		ArrayList<Revision> re = re2.CreateDatabase();
		return re;

	}

	/**
	 * @return ma, un arraylist contenente i metadati utili a conoscere i dati
	 *         scaricati con il json
	 */
	@Override
	public ArrayList<Metadata> MetadataVisual() {
		MetadataArray ma = new MetadataArray();
		return ma.metadataArrCreat();
	}

	/**
	 * @return st, un oggetto di tipo Stats contenente tutte le informazioni
	 *         riguardanti le statistiche
	 */
	@Override
	public Stats StatsVisual(JSONObject jobj) throws GenericInternalException, GenericExternalException {
		RevisionStats rv_st = new RevisionStats();
		Stats st = new Stats();
		st = rv_st.create_stats(jobj);
		return st;
	}

}
