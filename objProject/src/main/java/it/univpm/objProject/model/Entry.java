package it.univpm.objProject.model;

import java.time.LocalDateTime;

public class Entry {

/**
 * Description of Entry.
 * 
 * @author Lorenzo
 */
	private String name;
	private String path_lower;
	private String path_display;
	private String id;
	private String client_modified; // LocalDateTime
	private String server_modified; // LocalDateTime
	private String rev;
	private long size;
	private Boolean is_downloadable;
	private String content_hash;

	
	public Entry() {
		// Start of user code constructor for Entry)
		super();
		// End of user code
	}


	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}


	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}


	/**
	 * @return the path_lower
	 */
	public String getPath_lower() {
		return path_lower;
	}


	/**
	 * @param path_lower the path_lower to set
	 */
	public void setPath_lower(String path_lower) {
		this.path_lower = path_lower;
	}


	/**
	 * @return the path_display
	 */
	public String getPath_display() {
		return path_display;
	}


	/**
	 * @param path_display the path_display to set
	 */
	public void setPath_display(String path_display) {
		this.path_display = path_display;
	}


	/**
	 * @return the id
	 */
	public String getId() {
		return id;
	}


	/**
	 * @param id the id to set
	 */
	public void setId(String id) {
		this.id = id;
	}


	/**
	 * @return the client_modified
	 */
	public String getClient_modified() {
		return client_modified;
	}


	/**
	 * @param client_modified the client_modified to set
	 */
	public void setClient_modified(String client_modified) {
		this.client_modified = client_modified;
	}


	/**
	 * @return the server_modified
	 */
	public String getServer_modified() {
		return server_modified;
	}


	/**
	 * @param server_modified the server_modified to set
	 */
	public void setServer_modified(String server_modified) {
		this.server_modified = server_modified;
	}


	/**
	 * @return the rev
	 */
	public String getRev() {
		return rev;
	}


	/**
	 * @param rev the rev to set
	 */
	public void setRev(String rev) {
		this.rev = rev;
	}


	/**
	 * @return the size
	 */
	public long getSize() {
		return size;
	}


	/**
	 * @param size the size to set
	 */
	public void setSize(long size) {
		this.size = size;
	}


	/**
	 * @return the is_downloadable
	 */
	public Boolean getIs_downloadable() {
		return is_downloadable;
	}


	/**
	 * @param is_downloadable the is_downloadable to set
	 */
	public void setIs_downloadable(Boolean is_downloadable) {
		this.is_downloadable = is_downloadable;
	}


	/**
	 * @return the content_hash
	 */
	public String getContent_hash() {
		return content_hash;
	}


	/**
	 * @param content_hash the content_hash to set
	 */
	public void setContent_hash(String content_hash) {
		this.content_hash = content_hash;
	}


}

