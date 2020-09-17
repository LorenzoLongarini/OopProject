package it.univpm.objProject.exception;

/**
 * @author Lorenzo
 *
 */
public class GenericExternalException extends Exception {

	private static final long serialVersionUID = 2L;

	public GenericExternalException() {
		super();
	}

	/**
	 * @param warning
	 */
	public GenericExternalException(String warning) {
		super(warning);
	}
}
