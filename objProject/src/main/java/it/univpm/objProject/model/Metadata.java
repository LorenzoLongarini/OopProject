package it.univpm.objProject.model;

public class Metadata {
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
	public Metadata(String key, String value, String type) {
		//constructor for Metadati)
		this.key = key;
		this.value = value;
		this.type = type;
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
