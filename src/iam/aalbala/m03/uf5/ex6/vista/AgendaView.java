package iam.aalbala.m03.uf5.ex6.vista;

import java.util.Scanner;

public class AgendaView {
	
	Scanner input;

	public AgendaView() {
		input = new Scanner(System.in);
	}

	public int menuPrincipal() {
		int opcio = 0;
		do {
			System.out.println("(1) Afegir nova persona a la agenda");
			System.out.println("(2) Esborrar persona de l'agenda");
			System.out.println("(3) Llistar agenda");
			System.out.println("(4) Sortir");
			System.out.print("Escull una opcio: ");
			opcio = input.nextInt();
		} while (opcio < 1 || opcio > 4);
		return opcio;
	}
	
	/*public String demanarCamp(String camp) {
		String nom;
		System.out.print("Nom persona: ");
		nom = input.next();
		return nom;
	}*/
	
	public String demanarNom() {
		String nom;
		System.out.print("Nom contacte: ");
		nom = input.next();
		return nom;
	}
	
	public String demanarTel() {
		String tel;
		System.out.print("Telefon: ");
		tel = input.next();
		return tel;
	}
	
	public void mostrarText(String text) {
		System.out.println(text);
	}
	
	public void sortir() {
		System.out.println("Surts de l agenda");
	}
	
}