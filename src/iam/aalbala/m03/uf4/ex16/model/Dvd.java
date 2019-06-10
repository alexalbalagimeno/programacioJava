package iam.aalbala.m03.uf4.ex16.model;

public class Dvd extends Article {
	String titol;
	String director;
	int duracio;
	String idiomaOriginal;

	public Dvd(int codi, String descripcio, double preu, int stock, String titol, String director, int duracio,
			String idiomaOriginal) {
		super(codi, descripcio, preu, stock);
		this.titol = titol;
		this.director = director;
		this.duracio = duracio;
		this.idiomaOriginal = idiomaOriginal;
	}

	public String toString() {
		return "\nDVD\nTitol: " + titol + "\nDirector: " + director + "\nDuracio: " + duracio
				+ "\nIdioma original: " + idiomaOriginal + "\n";
	}

}
