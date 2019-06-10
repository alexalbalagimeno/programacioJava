package iam.aalbala.m03.uf4.ex15;

public class Canso {
	private String titol;
	private int durada;
	private static int nrocansons = 0;

	public Canso(String titol, int durada) {
		this.titol = titol;
		this.durada = durada;
		nrocansons++;
	}

	public static int getNumeroCansons() {
		return nrocansons;
	}

	public String getTitol() {
		return titol;
	}

	public int getDurada() {
		return durada;
	}

	public String toString() {
		return "Titol: " + titol + "\nDurada: " + durada;
	}
}
