package iam.aalbala.m03.uf4.ex15;

public class Llibre extends Article {
	private String titol;
	private String autor;
	private int numPagines;

	public Llibre(int codi, String descripcio, double preu, int stock, String titol, String autor, int numPagines) {
		super(codi, descripcio, preu, stock);
		this.titol = titol;
		this.autor = autor;
		this.numPagines = numPagines;
	}

	public String mostrarContingut() {
		return "Autor: " + autor + "\nTitol:" + titol + "\nNum pagines:" + numPagines;
	}
	
	public String getTitol() {
		return titol;
	}

	public String getAutor() {
		return autor;
	}

	public int getNumPagines() {
		return numPagines;
	}

	public String toString() {
		return super.toString() + "\nAutor: " + autor + "\nTitol:" + titol + "\nNum pagines:" + numPagines + "\n";
	}
}
