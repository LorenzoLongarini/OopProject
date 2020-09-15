package it.univpm.objProject.services;

import java.util.ArrayList;

import org.json.simple.JSONObject;
import org.springframework.stereotype.Service;

import it.univpm.objProject.model.Metadata;
import it.univpm.objProject.model.Revision;
import it.univpm.objProject.model.Stats;

/**
 * @author Lorenzo
 *
 */
@Service
public interface RevisionService {

	public ArrayList<Metadata> MetadataVisual();

	public ArrayList<Revision> RevisionVisual();

	public Stats StatsVisual(JSONObject jobj);
}
