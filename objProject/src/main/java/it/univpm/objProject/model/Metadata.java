package it.univpm.objProject.model;

/**
 * Classe per la modellazione del singolo metadato costituito dei tre campi
 * alias, sourceField e type.
 * 
 * @see it.univpm.objProject.util.MetadataArray
 * @author Lorenzo Longarini
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
	 * @return the alias
	 */
	public String getAlias() {
		return alias;
	}

	/**
	 * @param alias the alias to set
	 */
	public void setAlias(String alias) {
		this.alias = alias;
	}

	/**
	 * @return the sourceField
	 */
	public String getSourceField() {
		return sourceField;
	}

	/**
	 * @param sourceField the sourceField to set
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
