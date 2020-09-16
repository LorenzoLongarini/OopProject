package it.univpm.objProject.exception;

public class GenericInternalException extends Exception{

	private static final long serialVersionUID = 1L;

	public GenericInternalException() {
		super();
	}
	
	public GenericInternalException(String warning) {
		super(warning);
	}
	
}
