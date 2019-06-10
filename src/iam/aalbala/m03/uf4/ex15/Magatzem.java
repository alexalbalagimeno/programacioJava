package iam.aalbala.m03.uf4.ex15;

import java.util.Arrays;

import iam.aalbala.m03.uf4.ex12.Escultura;

public class Magatzem {
	Article[] articles;
	String nom;

	public Magatzem(String nom, Article[] articles) {
		this.articles = articles;
		this.nom = nom;
	}

	public boolean afegirArticle(Article nouArticle) {
		Article[] nouArrayArticles = new Article[articles.length + 1];
		int i;
		for (i = 0; i < articles.length; i++) {
			nouArrayArticles[i] = articles[i];
		}
		nouArrayArticles[i] = nouArticle;
		// nouArrayArticles = articles;
		// nouArrayArticles[nouArrayArticles.length-1] = nouArticle;
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

		int contaArticlesSenseStock = 0;
		boolean hiHaArticlesSenseStock = false;
		for (int i = 0; i < articles.length; i++) {
			if (articles[i].getStock() <= 0) {
				contaArticlesSenseStock++;
				hiHaArticlesSenseStock = true;
			}
		}
		if (hiHaArticlesSenseStock) {
			Article[] articlesSenseStock = new Article[contaArticlesSenseStock];
			int j = 0;
			for (int i = 0; i < articles.length; i++) {
				if (articles[i].getStock() <= 0) {
					articlesSenseStock[j] = articles[i];
					j++;
				}
			}
			return articlesSenseStock;
		} else
			return null;
	}

	public String llistaTotsArticles() {

		String retorn = "";
		for (int i = 0; i < articles.length; i++) {
			retorn = retorn + articles[i];
		}
		return retorn;
	}

	public String llistaCodisOrdenats() {

		String retornar = "";
		Arrays.sort(articles);

		for (int i = 0; i < articles.length; i++) {
			retornar = retornar + articles[i] + "\n";
		}
		return retornar;
	}

	public String mostraArticle(Article passat) {
		for (int i = 0; i < articles.length; i++) {
			if (passat instanceof Cd) {
				Cd cd1 = (Cd) passat;
				String retorn = "";
				for (int j = 0; j < cd1.getCansons().length; j++) {
					retorn = retorn + "Nom canso: " + cd1.getCansons()[j].getTitol() + "     Durada: " + cd1.getCansons()[j].getDurada()
							+ "\n";

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
		}
		return null;
	}
}
