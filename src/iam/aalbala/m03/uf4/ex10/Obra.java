package iam.aalbala.m03.uf4.ex10;

public class Obra extends Item {
	String autor;
	int nrePags;
	static int numObres = 0;

	public Obra(String referencia, String titol, String autor, int nrePags) {
		super(referencia, titol);
		this.autor = autor;
		this.nrePags = nrePags;
		numObres++;
	}

	public static int getNumeroObres() {
		return numObres;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public int getNrePags() {
		return nrePags;
	}

	public void setNrePags(int nrePags) {
		this.nrePags = nrePags;
	}

	public String toString() {
		return super.toString() + "\nAutor: " + autor + "\nNúmero pàgines: " + nrePags;
	}
}
