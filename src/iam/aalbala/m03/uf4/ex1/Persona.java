package iam.aalbala.m03.uf4.ex1;

public class Persona {
	String nom;
	String cognom;
	private String dni;
	private int edat;
	private boolean estatCivil;
	
	public Persona(String nom, String cognom, String dni, int edat, boolean estatCivil) {
		this.nom = nom;
		this.cognom = cognom;
		this.dni = dni;
		this.edat = edat;
		this.estatCivil = estatCivil;
	}

	public String getNom() {
		return nom;
	}

	public String mostraNomComplert() {
		return nom + " " +cognom;
	}

	public String mostraEstatCivil() {
		if (estatCivil)
			return "Casat";
		else
			return "Solter";
	}
	
	public void aniversari() {
		this.edat = edat + 1;
	}
	
	public String mostraPersona() {
			return "Nom: " + nom + "\nCognom: " + cognom + "\nDni: " + dni + "\nEdat: " + edat + "\nEstat Civil: " +mostraEstatCivil();	
	}
}
