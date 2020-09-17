package it.univpm.objProject.model;

/**
 * Classe per la modellazione del singolo metadato costituito dei tre campi alias, sourceField e type
 * @author Lorenzo
 *
 */
public class Metadata {

	private String alias;
	private String sourceField;
	private String type;

	/**
	 * The constructor.
	 */
	public Metadata(String alias, String sourceField, String type) {

		this.alias = alias;
		this.sourceField = sourceField;
		this.type = type;
	}

	/**
	 * @return the key
	 */
	public String getAlias() {
		return alias;
	}

	/**
	 * @param key the key to set
	 */
	public void setAlias(String alias) {
		this.alias = alias;
	}

	/**
	 * @return the value
	 */
	public String getSourceField() {
		return sourceField;
	}

	/**
	 * @param value the value to set
	 */
	public void setSourceField(String sourceField) {
		this.sourceField = sourceField;
	}

	/**
	 * @return the type
	 */
	public String getType() {
		return type;
	}

	/**
	 * @param type the type to set
	 */
	public void setType(String type) {
		this.type = type;
	}

}
