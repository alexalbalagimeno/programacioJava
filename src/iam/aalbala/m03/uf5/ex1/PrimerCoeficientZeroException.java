package iam.aalbala.m03.uf5.ex1;

public class PrimerCoeficientZeroException extends Exception {

	String missatge;
	
	public PrimerCoeficientZeroException() {
		
	}

	public PrimerCoeficientZeroException(String missatge) {
		super(missatge);
	}
}
