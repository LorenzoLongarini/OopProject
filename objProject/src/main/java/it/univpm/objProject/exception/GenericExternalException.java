package it.univpm.objProject.exception;

public class GenericExternalException extends Exception{
	
	private static final long serialVersionUID = 2L;

	public GenericExternalException() {
		super();
	}
	
	public GenericExternalException(String warning) {
		super(warning);
	}
}
