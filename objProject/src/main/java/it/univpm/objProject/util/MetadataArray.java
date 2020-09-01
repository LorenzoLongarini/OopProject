package it.univpm.objProject.util;
//import java.time.LocalDateTime;
import java.util.ArrayList;
import it.univpm.objProject.model.Metadata;

public class MetadataArray {

	private ArrayList<Metadata> metadataArr = new ArrayList<Metadata>();
	
	public ArrayList<Metadata> metadataArrCreat(){
		
		metadataArr.add(new Metadata("is deleted", "", "Boolean"));
		metadataArr.add(new Metadata("path_lower", "", "String"));
		metadataArr.add(new Metadata("path_display", "", "String"));
		metadataArr.add(new Metadata("id", "", "String"));
		metadataArr.add(new Metadata("client_modified", "", "LocalDateTime"));
		metadataArr.add(new Metadata("server_modified", "", "LocalDateTime"));
		metadataArr.add(new Metadata("rev", "", "String"));
		metadataArr.add(new Metadata("size", "", "long"));
		metadataArr.add(new Metadata("is_downloadable", "", "Boolean"));
		metadataArr.add(new Metadata("content_hash", "", "String"));
		
		return metadataArr;
		
	}

	
}

