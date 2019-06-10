package iam.aalbala.m03.uf4.ex15;

public class Dvd extends Article {
	private String titol;
	private String director;
	private int duracio;
	private String idiomaOriginal;

	public Dvd(int codi, String descripcio, double preu, int stock, String titol, String director, int duracio,
			String idiomaOriginal) {
		super(codi, descripcio, preu, stock);
		this.titol = titol;
		this.director = director;
		this.duracio = duracio;
		this.idiomaOriginal = idiomaOriginal;
	}
	
	public String getTitol() {
		return titol;
	}

	public String getDirector() {
		return director;
	}

	public int getDuracio() {
		return duracio;
	}

	public String getIdiomaOriginal() {
		return idiomaOriginal;
	}
	public String toString() {
		return super.toString() + "\nTitol: " + titol + "\nDirector: " + director + "\nDuracio: " + duracio
				+ "\nIdioma original: " + idiomaOriginal + "\n";
	}

}
