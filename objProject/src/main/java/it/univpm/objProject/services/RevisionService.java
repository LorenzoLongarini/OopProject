package it.univpm.objProject.services;

import java.util.ArrayList;

import org.springframework.stereotype.Service;

import it.univpm.objProject.model.Metadata;
import it.univpm.objProject.model.Revision;
//import it.univpm.objProject.util.MetadataArray;

@Service
public interface RevisionService {
	
	public ArrayList<Metadata> MetadataVisual();
	public Revision RevisionVisual();
}
