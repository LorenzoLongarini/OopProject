package it.univpm.objProject.exception;

/**
 * Eccezione personalizzata per la gestione delle eccezioni esterne.
 * 
 * @author Lorenzo Longarini
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
