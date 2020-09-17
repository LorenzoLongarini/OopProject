package it.univpm.objProject.exception;

/**
 * @author Lorenzo
 *
 */
public class GenericInternalException extends Exception {

	private static final long serialVersionUID = 1L;

	public GenericInternalException() {
		super();
	}

	/**
	 * @param warning
	 */
	public GenericInternalException(String warning) {
		super(warning);
	}

}
