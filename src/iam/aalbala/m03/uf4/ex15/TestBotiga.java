package iam.aalbala.m03.uf4.ex15;

import java.util.Arrays;

public class TestBotiga {

	public static void main(String[] args) {

		Article[] articles = new Article[6];
		Canso[] cansons1 = new Canso[3];
		Canso[] cansons2 = new Canso[4];
		cansons1[0] = new Canso("canso1 cd1", 3);
		cansons1[1] = new Canso("canso2 cd1", 2);
		cansons1[2] = new Canso("canso3 cd1", 4);
		cansons2[0] = new Canso("canso1 cd2", 3);
		cansons2[1] = new Canso("canso2 cd2", 2);
		cansons2[2] = new Canso("canso3 cd2", 4);
		cansons2[3] = new Canso("canso4 cd2", 1);
		articles[0] = new Cd(1, "cdcdcd", 22, 7, "titol cd1", "banda cd1", cansons1.length, cansons1);
		articles[1] = new Cd(2, "cdcdcd", 15, 8, "titol cd2", "banda cd2", cansons2.length, cansons2);
		articles[2] = new Dvd(3, "dvdvdv", 25, 5, "titol dvd1", "director 1", 90, "Catala ");
		articles[3] = new Dvd(4, "dvdvdv", 35, 9, "titol dvd2", "director 2", 95, "Angles");
		articles[4] = new Llibre(6, "llibrellibre", 18, 4, "titol llibre 1", "autor 1", 168);
		articles[5] = new Llibre(5, "llibrellibre", 19, 12, "titol llibre 2", "autor 2", 188);
		Magatzem m1 = new Magatzem("Botiga", articles);
		Canso[] cansons3 = new Canso[2];
		cansons3[0] = new Canso("canso1 cdnou", 3);
		cansons3[1] = new Canso("canso2 cdnou", 2);
		Cd cdnou = new Cd(7, "noucdcdcd", 10, 1, "titol noucd", "banda nou cd", 11, cansons3);
		System.out.println(m1.afegirArticle(cdnou));
		System.out.println(m1.llistaTotsArticles());
		/*System.out.println("Mostra article cdnou codi 7" + cdnou.mostraArticle(cdnou));
		System.out.println("Mostra article codi 6" + articles[4].mostraArticle(articles[4]));
		System.out.println("Llista de codis ordenats\n" + m1.llistaCodisOrdenats());
		System.out.println("Producte buscat de codi 5\n" + m1.buscaProducte(5));
		System.out.println("Article abans repostar\n" + articles[0]);
		articles[0].repostar(20);
		System.out.println("Article despres repostar 20 unitats\n" + articles[0]);
		System.out.println("Article abans vendre\n" + articles[1]);
		double totalVenta = articles[1].venta(8);
		System.out.println("Article despres vendre 8 unitats\n" + articles[1]);
		System.out.println("Total venta efectuada: " + totalVenta);
		System.out.println("Preu venta: " + articles[2].venta(5));
		System.out.println("String codis ordenats\n" + m1.llistaCodisOrdenats());
		Article[] senseStock = m1.llistaSenseStock();
		System.out.println("Array sense stock");
		//System.out.println(Arrays.toString(senseStock));
		for (int i = 0; i < senseStock.length; i++) {
			System.out.println(senseStock[i]);
		}
		System.out.println(cdnou.mostrarContingut());
		System.out.println(m1.mostraArticle(articles[3]));*/
	}

}
