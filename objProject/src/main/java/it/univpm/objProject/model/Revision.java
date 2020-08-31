package it.univpm.objProject.model;

import java.util.*;
import java.time.LocalDateTime;

public class Revision {
	
		/**
		 * Description of the property is_deleted.
		 */
		public Boolean is_deleted;

		/**
		 * Description of the property entries.
		 */
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
		public Boolean getIs_deleted() {
			return is_deleted;
		}

		/**
		 * @param is_deleted the is_deleted to set
		 */
		public void setIs_deleted(Boolean is_deleted) {
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
		public void setEntries(ArrayList<Entry> entries) {
			this.entries = entries;
		}

		

}
