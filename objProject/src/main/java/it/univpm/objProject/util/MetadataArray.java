package it.univpm.objProject.util;

import java.util.ArrayList;
import it.univpm.objProject.model.Metadata;

/**
 * @author Lorenzo
 *
 */
public class MetadataArray {

	private ArrayList<Metadata> metadataArr = new ArrayList<Metadata>();

	/**
	 * @return
	 */
	public ArrayList<Metadata> metadataArrCreat() {

		metadataArr.add(new Metadata("is_deleted",
				"If the file identified by the latest revision in the response is either deleted or moved.",
				"Boolean"));
		metadataArr.add(new Metadata("entries", "The revisions for the file.", "ArrayList"));
		metadataArr.add(new Metadata("name", "The last component of the path (including extension).", "String"));
		metadataArr.add(new Metadata("path_lower", "The lowercased full path in the user's Dropbox.", "String"));
		metadataArr.add(new Metadata("path_display", "The cased path to be used for display purposes only.", "String"));
		metadataArr.add(new Metadata("id", "A unique identifier for the file.", "String"));
		metadataArr.add(new Metadata("client_modified",
				"For files, this is the modification time set by the desktop client when the file was added to Dropbox.",
				"Date"));
		metadataArr.add(new Metadata("server_modified", "The last time the file was modified on Dropbox.", "Date"));
		metadataArr.add(new Metadata("rev", "A unique identifier for the current revision of a file.", "String"));
		metadataArr.add(new Metadata("size", "The file size in bytes.", "long"));
		metadataArr.add(new Metadata("is_downloadable",
				"If true, file can be downloaded directly; else the file must be exported.", "Boolean"));
		metadataArr.add(new Metadata("content_hash", "A hash of the file content.", "String"));

		return metadataArr;

	}

}
