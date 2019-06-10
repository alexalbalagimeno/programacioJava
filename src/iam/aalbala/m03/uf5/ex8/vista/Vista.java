package iam.aalbala.m03.uf5.ex8.vista;

import java.io.File;
import java.util.Hashtable;
import java.util.Scanner;

import iam.aalbala.m03.uf5.ex8.model.Equip;
import iam.aalbala.m03.uf5.ex8.model.Jugador;
import iam.aalbala.m03.uf5.ex8.model.TeamFileFormatException;

public class Vista {

	Scanner input;

	public Vista() {
		input = new Scanner(System.in);
	}

	public int menuPrincipal() {

		int opcio = 0;
		do {
			System.out.println("************MENU*************");
			System.out.println("1) Jugar Lliga");
			System.out.println("2) Edita Lliga");
			System.out.println("3) Llegir equips lliga serialitzats");
			System.out.println("4) Guarda equips lliga serialitzats");
			System.out.println("5) Sortir");
			System.out.print("Escull una opcio: ");
			opcio = input.nextInt();
		} while (opcio < 1 || opcio > 5);
		return opcio;
	}

	public int menuEditar() {

		int opcio = 0;
		do {
			System.out.println("************MENU*************");
			System.out.println("1) Afegir Equip");
			System.out.println("2) Esborrar Equip");
			System.out.println("3) Modificar Equip");
			System.out.println("4) Enrere");
			System.out.print("Escull una opcio: ");
			opcio = input.nextInt();
		} while (opcio < 1 || opcio > 4);
		return opcio;
	}

	public void infoDirectori() {
		System.out.println("El directori de la lliga es LligaBBVA");
	}

	public void sortir() {
		System.out.println("Surts del programa");
	}

	public Equip creaEquip() throws TeamFileFormatException {
		String nomEquip;
		Hashtable<String, Jugador> jugadors;
		String dorsal;
		String nom;
		String cognom;
		int edat;
		int alcada;
		int golsAcumulats = 0;
		String liniaFitxer;
		int numJug = 0;

		System.out.print("Nom equip: ");
		nomEquip = input.next();
		do {
			System.out.print("Numero jugadors equip (Minim 15): ");
			numJug = input.nextInt();

		} while (numJug < 15);

		jugadors = new Hashtable<String, Jugador>();

		for (int i = 0; i < numJug; i++) {
			System.out.println("Jugador " + (i + 1));
			System.out.print("Dorsal: ");
			dorsal = input.next();
			System.out.print("Nom: ");
			nom = input.next();
			System.out.print("Cognom: ");
			cognom = input.next();
			System.out.print("Edat: ");
			edat = input.nextInt();
			System.out.print("Alcada: ");
			alcada = input.nextInt();
			liniaFitxer = dorsal + "#" + nom + "#" + cognom + "#" + edat + "#" + alcada + "#" + golsAcumulats;
			Jugador j = new Jugador(liniaFitxer);
			jugadors.put(dorsal, j);
		}
		Equip equipCreat = new Equip(nomEquip, jugadors);
		return equipCreat;
	}

	public void infoEquipCreat(String nomEquip) {
		System.out.println("Equip " + nomEquip + " creat");
	}

	public void infoEquipBorrat(String nomEquip) {
		System.out.println("Equip " + nomEquip + " borrat");
	}

	public String demanaEquipNom() {

		File[] fitxers;
		File directoriLliga = new File("LligaBBVA");

		fitxers = directoriLliga.listFiles();

		for (int i = 0; i < fitxers.length; i++) {
			if (!fitxers[i].isDirectory()) {
				System.out.println(fitxers[i].getName().substring(0, fitxers[i].getName().length() - 4));
			}
		}
		String nomEquip = "";
		String nomFitxer = "";
		boolean gestiona = false;
		do {
			System.out.println("Nom Equip: ");
			nomEquip = input.next();
			for (int i = 0; i < fitxers.length && gestiona == false; i++) {
				if (!fitxers[i].isDirectory()) {
					nomFitxer = fitxers[i].getName().substring(0, fitxers[i].getName().length() - 4);
					if (nomFitxer.equals(nomEquip)) {
						gestiona = true;
					}
				}
			}
			if (gestiona == false)
				System.out.println("Posa correctament el nom!!");

		} while (gestiona == false);

		return nomEquip;
	}

	public int menuModificaEquip(String nomEquip) {
		int opcio = 0;

		do {
			System.out.println("************MENU*************");
			System.out.println("1) Cambia nom equip");
			System.out.println("2) Afegir jugador");
			System.out.println("3) Esborrar jugador");
			opcio = input.nextInt();
		} while (opcio < 1 || opcio > 3);

		return opcio;
	}

	public String donaNouNomEquip() {
		System.out.print("Nou nom: ");
		return input.next();
	}

	public Jugador dadesNouJugador() throws TeamFileFormatException {
		String dorsal;
		String nom;
		String cognom;
		int edat;
		int alcada;
		int golsAcumulats = 0;
		System.out.print("Dorsal: ");
		dorsal = input.next();
		System.out.print("Nom: ");
		nom = input.next();
		System.out.print("Cognom: ");
		cognom = input.next();
		System.out.print("Edat: ");
		edat = input.nextInt();
		System.out.print("Alcada: ");
		alcada = input.nextInt();
		Jugador nou = new Jugador(dorsal + "#" + nom + "#" + cognom + "#" + edat + "#" + alcada + "#" + golsAcumulats);
		return nou;
	}
	
	public String dorsalBorraJugador() {
		System.out.print("Dorsal: ");
		return input.next();
	}

	public void infoJugadorAfegit(String nomEquip) {
		System.out.println("Jugador afegit a " + nomEquip);
	}
	
	public void infoJugadorBorrat(String nomEquip) {
		System.out.println("Jugador borrat a " + nomEquip);
	}

}
