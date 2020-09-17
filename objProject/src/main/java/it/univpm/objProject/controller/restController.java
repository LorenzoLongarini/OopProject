package it.univpm.objProject.controller;

import org.springframework.web.bind.annotation.RestController;

import it.univpm.objProject.exception.GenericExternalException;
import it.univpm.objProject.exception.GenericInternalException;
import it.univpm.objProject.model.*;
import java.util.ArrayList;
import java.util.Map;

import it.univpm.objProject.services.RevisionServiceImpl;

import org.json.simple.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

/**
 * Controller per la gestione delle chiamate.
 * 
 * @author Lorenzo Longarini
 *
 */

@RestController

public class restController {

	/**
	 * Crea un'istanza del service (RevisionServiceImpl) questa verrà utilizzata per
	 * effettuare le varie funzioni del controller.
	 */
	@Autowired
	RevisionServiceImpl revision_service;

	/**
	 * Consiste in una chiamata Get con rotta /data.
	 * 
	 * @return un arraylist di revisions presenti in dropbox
	 * @throws GenericInternalException
	 * @throws GenericExternalException
	 * @see Revision
	 * @see Entry
	 * @see it.univpm.objProject.services.Database
	 */
	@GetMapping(value = "/data")
	public ArrayList<Revision> get_revision() throws GenericInternalException, GenericExternalException {
		return revision_service.RevisionVisual();
	}

	/**
	 * Consiste in una chiamata Get con rotta /metadata.
	 * 
	 * @return un arraylist contenente i metadati utili alla comprensione dei dati
	 *         presenti nel dataset
	 * @see Metadata
	 * @see it.univpm.objProject.util.MetadataArray
	 */
	@GetMapping(value = "/metadata")
	public ArrayList<Metadata> get_metadata() {
		return revision_service.MetadataVisual();
	}

	/**
	 * @param info
	 * @return stat, un oggetto di tipo Stats contenente le informazioni su numero
	 *         di revisioni giornaliere e settimanali e tempi medi tra le revisioni.
	 * @throws GenericInternalException
	 * @throws GenericExternalException
	 * @see Stats
	 * @see it.univpm.objProject.util.RevisionStats
	 */
	@PostMapping(value = "/stats")

	public Stats post_stats(@RequestBody Map<?, ?> info) throws GenericInternalException, GenericExternalException {
		JSONObject jobj = new JSONObject(info);
		return revision_service.StatsVisual(jobj);
	}

}
