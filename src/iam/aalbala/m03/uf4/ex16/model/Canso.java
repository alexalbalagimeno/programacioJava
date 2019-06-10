package iam.aalbala.m03.uf4.ex16.model;

public class Canso {
	String titol;
	int durada;
	private static int nrocansons = 0;

	public Canso(String titol, int durada) {
		this.titol = titol;
		this.durada = durada;
		nrocansons++;
	}

	public static int getNumeroCansons() {
		return nrocansons;
	}

	public String toString() {
		return "Titol: " + titol + "\nDurada: " + durada;
	}
}
