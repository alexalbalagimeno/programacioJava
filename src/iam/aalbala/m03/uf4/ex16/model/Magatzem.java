package iam.aalbala.m03.uf4.ex16.model;

import java.util.Arrays;

import iam.aalbala.m03.uf4.ex16.model.Dvd;
import iam.aalbala.m03.uf4.ex16.model.Llibre;
import iam.aalbala.m03.uf4.ex16.model.Cd;

public class Magatzem {
	Article[] articles;

	public Magatzem(Article[] articles) {
		this.articles = articles;
	}

	public boolean afegirArticle(Article nouArticle) {
		Article[] nouArrayArticles = new Article[articles.length + 1];
		int i;
		for (i = 0; i < articles.length; i++) {
			nouArrayArticles[i] = articles[i];
		}
		nouArrayArticles[i++] = nouArticle;
		articles = nouArrayArticles;
		return true;
	}

	public Article buscaProducte(int codiProd) {

		for (int i = 0; i < articles.length; i++) {
			if (codiProd == articles[i].getCodi()) {
				return articles[i];
			}
		}
		return null;
	}

	public Article[] llistaSenseStock() {

		boolean noExisteixStock = false;
		int cont = 0;
		for (int i = 0; i < articles.length; i++) {
			if (articles[i].getStock() <= 0) {
				noExisteixStock = true;
				cont++;
			}
		}
		Article[] articlesSenseStock = new Article[cont];
		cont = 0;
		if (noExisteixStock) {
			for (int i = 0; i < articles.length; i++) {
				if (articles[i].getStock() <= 0) {
					articlesSenseStock[cont] = articles[i];
					cont++;
				}
			}
			return articlesSenseStock;
		} else
			return null;
	}

	public String llistaTotsArticles() {

		String retorn = "";
		for (int i = 0; i < articles.length; i++) {
			if (articles[i] instanceof Cd) {
				Cd cd1 = (Cd) articles[i];
				for (int j = 0; j < cd1.cansons.length; j++) {
					retorn = retorn + "Nom canso: " + cd1.cansons[j].titol + "     Durada: " + cd1.cansons[j].durada
							+ "\n";

				}
				retorn = "\nCD\nCodi: " + cd1.codi + "\nDescripcio: " + cd1.descripcio + "\nPreu: " + cd1.preu
						+ "\nStock: " + cd1.stock + "\nTitol: " + cd1.titol + "\nNom Banda: " + cd1.nomBanda + "\n"
						+ retorn;
			}

			if (articles[i] instanceof Llibre) {
				Llibre Ll1 = (Llibre) articles[i];
				retorn = retorn + "\nLlibre\nCodi: " + Ll1.codi + "\nDescripcio: " + Ll1.descripcio + "\nPreu: "
						+ Ll1.preu + "\nStock: " + Ll1.stock + "\nAutor: " + Ll1.autor + "\nTitol:" + Ll1.titol
						+ "\nNum pagines:" + Ll1.numPagines + "\n";
			}

			if (articles[i] instanceof Dvd) {
				Dvd Dvd1 = (Dvd) articles[i];
				retorn = retorn + "\nDVD\nCodi: " + Dvd1.codi + "\nDescripcio: " + Dvd1.descripcio + "\nPreu: "
						+ Dvd1.preu + "\nStock: " + Dvd1.stock + "\nTitol: " + Dvd1.titol + "\nDirector: "
						+ Dvd1.director + "\nDuracio: " + Dvd1.duracio + "\nIdioma original: " + Dvd1.idiomaOriginal
						+ "\n";
			}
		}
		return retorn;
	}

	public String llistaCodisOrdenats() {

		String retorn = "";
		Arrays.sort(articles);

		retorn = llistaTotsArticles();
		return retorn;
	}

}
