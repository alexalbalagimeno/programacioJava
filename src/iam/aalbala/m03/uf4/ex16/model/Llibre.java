package iam.aalbala.m03.uf4.ex16.model;

public class Llibre extends Article {
	String titol;
	String autor;
	int numPagines;

	public Llibre(int codi, String descripcio, double preu, int stock, String titol, String autor, int numPagines) {
		super(codi, descripcio, preu, stock);
		this.titol = titol;
		this.autor = autor;
		this.numPagines = numPagines;
	}

	public String toString() {
		return "\nLlibre\nAutor: " + autor + "\nTitol:" + titol + "\nNum pagines:" + numPagines + "\n";
	}
}