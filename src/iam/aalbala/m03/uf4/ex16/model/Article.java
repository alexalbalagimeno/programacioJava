package iam.aalbala.m03.uf4.ex16.model;

public abstract class Article implements Comparable<Article> {
	int codi;
	String descripcio;
	double preu;
	int stock;

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

	public int compareTo(Article a) {
		int diferencia = this.codi - a.codi;
		return diferencia;
	}

	public abstract String toString();
}