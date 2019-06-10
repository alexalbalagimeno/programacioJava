package iam.aalbala.m03.uf5.ex1;

public class NoArrelsRealsException extends Exception {

	String missatge;
	
	public NoArrelsRealsException() {
		
	}

	public NoArrelsRealsException(String missatge) {
		super(missatge);
	}
	
}
