package iam.aalbala.m03.uf4.ex15;

public class Cd extends Article {
	private String titol;
	private String nomBanda;
	private int numCansons;
	private Canso[] cansons;

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
	
	public String getTitol() {
		return titol;
	}

	public String getNomBanda() {
		return nomBanda;
	}

	public String mostrarContingut() {

		String retornar = "";

		for (int i = 0; i < cansons.length; i++) {
			retornar = retornar + "Nom canso: " + cansons[i].getTitol() + "Duracio: " + cansons[i].getDurada() + "\n";
		}
		return "Nom Banda: " + nomBanda + "\n" + retornar;
	}

	public String toString() {

		String retornar = "";

		for (int i = 0; i < cansons.length; i++) {
			retornar = retornar + "Titol: " + cansons[i].getTitol() + "  Durada: " + cansons[i].getDurada() + "\n";
		}
		return super.toString() + "\nTitol: " + titol + "\nNom Banda: " + nomBanda + "\nNum cansons: " + numCansons
				+ "\nLlista cansons\n" + retornar;
	}
}
