package it.univpm.objProject.model;

import java.util.*;

/**
 * Modello della singola revision costituita da un parametro booleano e un
 * arraylist di Entry.
 * 
 * @see Entry
 * @see it.univpm.objProject.util.RevisionStats
 * @see it.univpm.objProject.services.RevisionService
 * @see it.univpm.objProject.services.RevisionServiceImpl
 * @see it.univpm.objProject.controller.restController
 * @author Lorenzo Longarini
 *
 */
public class Revision {

	private boolean is_deleted;
	public ArrayList<Entry> entries = new ArrayList<Entry>();

	/**
	 * The constructor.
	 */
	public Revision() {
		// Start of user code constructor for Revision)
		super();
		// End of user code
	}

	/**
	 * @return the is_deleted
	 */
	public boolean getIs_deleted() {
		return is_deleted;
	}

	/**
	 * @param is_deleted the is_deleted to set
	 */
	public void setIs_deleted(boolean is_deleted) {
		this.is_deleted = is_deleted;
	}

	/**
	 * @return the entries
	 */
	public ArrayList<Entry> getEntries() {
		return entries;
	}

	/**
	 * @param entriesadd the entries to set
	 */
	public void setEntries(Entry entriesadd) {
		entries.add(entriesadd);
	}

}
