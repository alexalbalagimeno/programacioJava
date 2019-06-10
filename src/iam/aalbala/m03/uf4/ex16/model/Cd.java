package iam.aalbala.m03.uf4.ex16.model;

public class Cd extends Article {
	String titol;
	String nomBanda;
	int numCansons;
	Canso[] cansons;

	public Cd(int codi, String descripcio, double preu, int stock, String titol, String nomBanda, int numCansons,
			Canso[] cansons) {
		super(codi, descripcio, preu, stock);
		this.titol = titol;
		this.nomBanda = nomBanda;
		this.numCansons = numCansons;
		this.cansons = cansons;
	}

	public Canso[] getCansons() {
		return cansons;
	}

	public int getNumCansons() {
		return numCansons;
	}

	public String toString() {

		String retornar = "";

		for (int i = 0; i < cansons.length; i++) {
			retornar = retornar + "Titol: " + cansons[i].titol + "  Durada: " + cansons[i].durada + "\n";
		}
		return "\nCD\nTitol: " + titol + "\nNom Banda: " + nomBanda + "\nNum cansons: " + numCansons
				+ "\nLlista cansons\n" + retornar;
	}
}