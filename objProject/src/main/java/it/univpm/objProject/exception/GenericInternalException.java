package it.univpm.objProject.exception;

/**
 * Eccezione personalizzata per la gestione delle eccezioni interne.
 * 
 * @author Lorenzo Longarini
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
