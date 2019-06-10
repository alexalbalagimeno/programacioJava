package iam.aalbala.m03.uf4.ex16.controlador;

import iam.aalbala.m03.uf4.ex16.model.Article;
import iam.aalbala.m03.uf4.ex16.model.Magatzem;
import iam.aalbala.m03.uf4.ex16.vista.View;

public class Controller {

	View view = new View();
	Magatzem magatzem;
	Article[] articles;

	public void menuPrincipal() {
		boolean passaOpcio = false;
		int opcio = 0;
		while (opcio != 8) {
			opcio = view.menuPrincipal();
			switch (opcio) {
			case 1:
				menuCrearMagatzem();
				passaOpcio = true;
				opcio = tornaMenuOSurt();
				break;
			case 2:
				if (!passaOpcio) {
					view.missatgeCreaMagatzem();
					opcio = tornaMenuOSurt();
				} else {
					menuAfegirArticle();
					opcio = tornaMenuOSurt();
				}
				break;
			case 3:
				if (!passaOpcio) {
					view.missatgeCreaMagatzem();
					opcio = tornaMenuOSurt();
				} else {
					menuBuscaProducte();
					opcio = tornaMenuOSurt();
				}
				break;
			case 4:
				if (!passaOpcio) {
					view.missatgeCreaMagatzem();
					opcio = tornaMenuOSurt();
				} else {
					menuLlistaSenseStock();
					opcio = tornaMenuOSurt();
				}
				break;
			case 5:
				if (!passaOpcio) {
					view.missatgeCreaMagatzem();
					opcio = tornaMenuOSurt();
				} else {
					menuLlistaCodisOrdenats();
					opcio = tornaMenuOSurt();
				}
				break;
			case 6:
				if (!passaOpcio) {
					view.missatgeCreaMagatzem();
					opcio = tornaMenuOSurt();
				} else {
					articleVenta();
					opcio = tornaMenuOSurt();
				}
				break;
			case 7:
				if (!passaOpcio) {
					view.missatgeCreaMagatzem();
					opcio = tornaMenuOSurt();
				} else {
					articleRepostar();
					opcio = tornaMenuOSurt();
				}
				break;
			case 8:
				menuSortir();
				break;
			}
		}
	}

	public void menuCrearMagatzem() {
		articles = new Article[view.numArticles()];
		for (int i = 0; i < articles.length; i++) {
			articles[i] = view.creaArticle();
		}
		magatzem = new Magatzem(articles);
	}

	public void menuAfegirArticle() {
		Article aAfegit = view.creaArticle();
		magatzem.afegirArticle(aAfegit);
	}

	public void menuBuscaProducte() {
		int codiProd = view.codiProd();
		Article prodBuscat = magatzem.buscaProducte(codiProd);
		view.mostraProducteBuscat(prodBuscat);
	}

	public void menuLlistaSenseStock() {
		Article[] llistaSenseStock = magatzem.llistaSenseStock();
		view.mostraLlista(llistaSenseStock);
	}

	public void menuLlistaCodisOrdenats() {
		String llistaCodisOrdenats = magatzem.llistaCodisOrdenats();
		view.mostraLlistaString(llistaCodisOrdenats);
	}

	public void articleRepostar() {
		int codiProd = view.codiProd();
		Article prodBuscat = magatzem.buscaProducte(codiProd);
		int numeroUnitats = view.repostarProducte();
		prodBuscat.repostar(numeroUnitats);
		view.mostraUnitatsTotal(prodBuscat.getStock());
	}

	public void articleVenta() {
		int codiProd = view.codiProd();
		Article prodBuscat = magatzem.buscaProducte(codiProd);
		int numeroUnitats = view.unitatsVenta();
		double ventatotal = prodBuscat.venta(numeroUnitats);
		view.mostraVenta(ventatotal);
	}

	public void menuSortir() {
		view.sortir();
	}

	public void missatgeCreaMagatzem() {
		view.missatgeCreaMagatzem();
	}

	public int tornaMenuOSurt() {
		return view.tornaMenu();
	}
}