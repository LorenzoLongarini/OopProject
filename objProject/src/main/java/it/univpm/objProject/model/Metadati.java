package it.univpm.objProject.model;

public class Metadati {
	/**
	 * Description of the property key.
	 */
	public String key;

	/**
	 * Description of the property value.
	 */
	public String value;

	/**
	 * Description of the property type.
	 */
	public String type;

	// Start of user code (user defined attributes for Metadati)

	// End of user code

	/**
	 * The constructor.
	 */
	public Metadati() {
		// Start of user code constructor for Metadati)
		super();
		// End of user code
	}

	/**
	 * @return the key
	 */
	public String getKey() {
		return key;
	}

	/**
	 * @param key the key to set
	 */
	public void setKey(String key) {
		this.key = key;
	}

	/**
	 * @return the value
	 */
	public String getValue() {
		return value;
	}

	/**
	 * @param value the value to set
	 */
	public void setValue(String value) {
		this.value = value;
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
