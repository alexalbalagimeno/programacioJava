package iam.aalbala.m03.uf4.ex5;

public class Estudiant {
	
	String nom;
	String dni;
	int nota;
	
	public Estudiant(String nom, String dni) {
		this.nom= nom;
		this.dni = dni;
		nota = 0;
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

	public int getNota() {
		return nota;
	}

	public void setNota(int nota) {
		this.nota = nota;
	}
	
	public String toString() {
		return "Estudiant\nNom: " +nom+ "\nDni: " +dni;
	}
}
