package it.univpm.objProject.services;


import java.util.ArrayList;

import it.univpm.objProject.model.Metadata;


import org.springframework.stereotype.Service;

import it.univpm.objProject.util.MetadataArray;

@Service
public class RevisionServiceImpl implements RevisionService {

	
	private MetadataArray ma = new MetadataArray();
	
	@Override
	public ArrayList<Metadata> MetadataVisual(){
		return ma.metadataArrCreat();
	};
	
}
