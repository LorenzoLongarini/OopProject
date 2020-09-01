package it.univpm.objProject.util;
import java.util.ArrayList;
import it.univpm.objProject.model.Metadata;

public class MetadataArray {

	private ArrayList<Metadata> metadataArr = new ArrayList<Metadata>();
	
	public ArrayList<Metadata> metadataArrCreat(){
		
		metadataArr.add(new Metadata("is deleted", "", "boolean"));
		metadataArr.add(new Metadata("is deleted", "", "boolean"));
		metadataArr.add(new Metadata("is deleted", "", "boolean"));
		metadataArr.add(new Metadata("is deleted", "", "boolean"));
		metadataArr.add(new Metadata("is deleted", "", "boolean"));
		metadataArr.add(new Metadata("is deleted", "", "boolean"));
		metadataArr.add(new Metadata("is deleted", "", "boolean"));
		metadataArr.add(new Metadata("is deleted", "", "boolean"));
		
		
		
		return metadataArr;
		
	}

	
}

