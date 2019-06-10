package iam.aalbala.m03.uf4.ex15;

public class Article implements Comparable<Article> {
	private int codi;
	private String descripcio;
	private double preu;
	private int stock;

	public Article(int codi, String descripcio, double preu, int stock) {
		this.codi = codi;
		this.descripcio = descripcio;
		this.preu = preu;
		this.stock = stock;
	}

	public int getCodi() {
		return codi;
	}

	public void setCodi(int codi) {
		this.codi = codi;
	}

	public String getDescripcio() {
		return descripcio;
	}

	public void setDescripcio(String descripcio) {
		this.descripcio = descripcio;
	}

	public double getPreu() {
		return preu;
	}

	public void setPreu(double preu) {
		this.preu = preu;
	}

	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}

	public double venta(int numeroUnitats) {
		if (numeroUnitats <= stock) {
			stock = stock - numeroUnitats;
			return numeroUnitats * preu;
		} else
			return -1;
	}

	public void repostar(int numeroUnitats) {
		stock = stock + numeroUnitats;
	}

	@Override
	public int compareTo(Article a) {
		int diferencia = this.codi - a.codi;
		return diferencia;
	}

	public String mostraArticle(Article passat) {
		if (passat instanceof Cd) {
			Cd cd1 = (Cd) passat;
			String retorn = "";
			for (int j = 0; j < cd1.getCansons().length; j++) {
				retorn = retorn + "Nom canso: " + cd1.getCansons()[j].getTitol() + "     Durada: " + cd1.getCansons()[j].getDurada() + "\n";

			}
			return "Nom Banda: " + cd1.getNomBanda() + "\n" + retorn;
		}

		if (passat instanceof Llibre) {
			Llibre Ll1 = (Llibre) passat;
			return "Autor: " + Ll1.getAutor() + "\nTitol:" + Ll1.getTitol() + "\nNum pagines:" + Ll1.getNumPagines();
		}

		if (passat instanceof Dvd) {
			Dvd Dvd1 = (Dvd) passat;
			return "\nTitol: " + Dvd1.getTitol() + "\nDirector: " + Dvd1.getDirector() + "\nDuracio: " + Dvd1.getDuracio()
					+ "\nIdioma original: " + Dvd1.getIdiomaOriginal() + "\n";
		}
		return null;
	}

	public String toString() {

		return "\nCodi: " + codi + "\nDescripcio: " + descripcio + "\nPreu: " + preu + "\nStock: " + stock;
	}

}
