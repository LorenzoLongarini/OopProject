package it.univpm.objProject.exception;

public class MyArithmeticException extends Exception{
	
	MyArithmeticException(){
		super();
	}
	
	public void Print_Error(){
		System.out.println("Il numero di revisioni è inferiore ad 1: impossibile ottenere tempi medi");
	}

}
