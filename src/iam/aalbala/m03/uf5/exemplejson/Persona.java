package iam.aalbala.m03.uf5.exemplejson;

public class Persona {

	private String nom;
	private int edat;
	
	public Persona(String n, int e) {
		nom = n;
		edat = e;
	}
	
	public String toString() {
		return "Ola k ase " + nom + " con " + edat + " años";
	}
}
