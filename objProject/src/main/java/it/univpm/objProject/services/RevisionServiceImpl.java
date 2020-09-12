package it.univpm.objProject.services;

import java.util.ArrayList;

import it.univpm.objProject.model.Metadata;
import it.univpm.objProject.model.Revision;
//import it.univpm.objProject.services.Database;
//import it.univpm.objProject.services.jParser;
import org.springframework.stereotype.Service;

import it.univpm.objProject.util.MetadataArray;

@Service
public class RevisionServiceImpl implements RevisionService {

	//private MetadataArray ma = new MetadataArray();
	//private Revision re;

	/*public RevisionServiceImpl() {
		jParser re2 = new jParser();
		re = re2.jParsing();
		//ma = new MetadataArray();
	}*/

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

}
