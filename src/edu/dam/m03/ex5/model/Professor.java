package edu.dam.m03.ex5.model;

public class Professor {
	private String nom;
	private int codiProfe;
	private String nomMateria;

	public Professor(String nom, int codiProfe, String nomMateria) {
		this.nom = nom;
		this.codiProfe = codiProfe;
		this.nomMateria = nomMateria;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public int getCodiProfe() {
		return codiProfe;
	}

	public void setCodiProfe(int codiProfe) {
		this.codiProfe = codiProfe;
	}

	public String getNomMateria() {
		return nomMateria;
	}

	public void setNomMateria(String nomMateria) {
		this.nomMateria = nomMateria;
	}
	
	public String toString() {
		return "Hola, em dic: "+getNom()+" soc professor de "+ getNomMateria()+" anys i el meu codi de professor és "+getCodiProfe();
	}

}
