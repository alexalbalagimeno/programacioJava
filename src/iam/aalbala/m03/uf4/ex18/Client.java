package iam.aalbala.m03.uf4.ex18;

public class Client extends Persona {

	String tipus;

	public Client(String nom, String cognom, String nif, int dia, int mes, int any, String adresa, String tipus) {
		super(nom, cognom, nif, dia, mes, any, adresa);
		this.tipus = tipus;
	}

	
	public String toString() {
		return super.toString() + "\nTIPUS CLIENT: " + tipus;
	}
}
