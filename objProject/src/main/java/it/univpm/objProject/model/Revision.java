package it.univpm.objProject.model;

import java.util.*;

/**
 * Modello della singola revision costituita da un parametro booleano e un arraylist di entry
 * @see Entry
 * @see RevisionStats
 * @see RevisionService
 * @see RevisionServiceImpl
 * @see Controller
 * @author Lorenzo
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
	 * @param entries the entries to set
	 */
	public void setEntries(Entry entriesadd) {
		entries.add(entriesadd);
	}

}
