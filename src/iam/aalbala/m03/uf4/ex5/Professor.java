package iam.aalbala.m03.uf4.ex5;

public class Professor {
	
	String nom;
	String dni;
	
	public Professor(String nom, String dni) {
		this.nom = nom;
		this.dni = dni;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getDni() {
		return dni;
	}
	
	public String toString() {
		return "Professor\nNom: " +nom+ "\nDni: " +dni;
	}
}
