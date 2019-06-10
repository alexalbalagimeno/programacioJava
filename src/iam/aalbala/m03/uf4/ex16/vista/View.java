package iam.aalbala.m03.uf4.ex16.vista;

import java.util.Arrays;
import java.util.Scanner;

import iam.aalbala.m03.uf4.ex16.model.Article;
import iam.aalbala.m03.uf4.ex16.model.Canso;
import iam.aalbala.m03.uf4.ex16.model.Cd;
import iam.aalbala.m03.uf4.ex16.model.Dvd;
import iam.aalbala.m03.uf4.ex16.model.Llibre;

public class View {

	Scanner input;

	public View() {
		input = new Scanner(System.in);
	}

	public int menuPrincipal() {

		int opcio = 0;
		System.out.println("***********MENU***********");
		System.out.println("1) Crear Magatzem");
		System.out.println("2) Afegir Articles");
		System.out.println("3) Busca Producte");
		System.out.println("4) Llista sense stock");
		System.out.println("5) Llista codis ordenats");
		System.out.println("6) Venta Producte");
		System.out.println("7) Reposta Producte");
		System.out.println("8) Sortir");
		System.out.print("Escull una opcio: ");
		opcio = input.nextInt();
		return opcio;
	}

	public int numArticles() {
		System.out.print("Quants articles vols posar: ");
		return input.nextInt();
	}

	public Article creaArticle() {
		int opcio = 0;
		do {
			System.out.println("1) Posa CD");
			System.out.println("2) Posa DVD");
			System.out.println("3) Posa LLIBRE");
			System.out.print("Escull article: ");
			opcio = input.nextInt();
			if (opcio > 3 || opcio < 1) {
				System.out.println("Opcio incorrecte");
			}
		} while (opcio > 3 || opcio < 1);
		if (opcio >= 1 && opcio <= 3) {
			System.out.print("Codi: ");
			int codi = input.nextInt();
			System.out.print("Descripcio: ");
			input.nextLine();
			String descripcio = input.nextLine();
			System.out.print("Preu: ");
			double preu = input.nextDouble();
			System.out.print("Stock: ");
			int stock = input.nextInt();
			System.out.print("Titol: ");
			input.nextLine();
			String titol = input.nextLine();
			if (opcio == 1) {
				System.out.print("nomBanda: ");
				String nomBanda = input.nextLine();
				System.out.print("numCansons: ");
				int numCansons = input.nextInt();
				Canso[] cansons = new Canso[numCansons];
				for (int j = 0; j < cansons.length; j++) {
					System.out.print("Titol canso " + (j + 1) + ": ");
					input.nextLine();
					String titolcanso = input.nextLine();
					System.out.print("Durada canso " + (j + 1) + ": ");
					int durada = input.nextInt();
					cansons[j] = new Canso(titolcanso, durada);
				}
				return new Cd(codi, descripcio, preu, stock, titol, nomBanda, numCansons, cansons);
			} else if (opcio == 2) {
				System.out.print("Director: ");
				String director = input.nextLine();
				System.out.print("Durada: ");
				int duracio = input.nextInt();
				System.out.print("Idioma original: ");
				input.nextLine();
				String idiomaOriginal = input.nextLine();
				return new Dvd(codi, descripcio, preu, stock, titol, director, duracio, idiomaOriginal);
			} else {
				System.out.print("Autor: ");
				String autor = input.nextLine();
				System.out.print("Num pagines: ");
				int numPagines = input.nextInt();
				return new Llibre(codi, descripcio, preu, stock, titol, autor, numPagines);
			}
		}
		return null;
	}

	public int codiProd() {
		System.out.print("Codi producte: ");
		return input.nextInt();
	}

	public void mostraProducteBuscat(Article producte) {
		System.out.println(producte);
	}

	public void mostraLlista(Article[] llista) {
		System.out.println(Arrays.toString(llista));
	}

	public void mostraLlistaString(String llista) {
		System.out.println(llista);
	}

	public void sortir() {
		System.out.println("Surts del programa");
	}

	public void missatgeCreaMagatzem() {
		System.out.println("Has de crear un magatzem abans");
	}

	public int unitatsVenta() {
		System.out.print("Unitats a vendre: ");
		return input.nextInt();
	}

	public void mostraVenta(double ventaTotal) {
		System.out.println("La venta total es de: " + ventaTotal);
	}

	public int repostarProducte() {
		System.out.print("Unitats a repostar: ");
		return input.nextInt();
	}

	public void mostraUnitatsTotal(int stockTotal) {
		System.out.println("Ara tens: " + stockTotal + " unitats");
	}

	public int tornaMenu() {
		int opcio;
		do {
			System.out.println("1)Tornar al Menu");
			System.out.println("2)Sortir del programa");
			opcio = input.nextInt();
		} while (opcio > 2 || opcio < 1);
		if (opcio == 2)
			return 8;
		return opcio;
	}
}
