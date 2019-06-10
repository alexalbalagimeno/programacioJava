package iam.aalbala.m03.uf4.ex16lliga.vista;

import java.util.Scanner;

import iam.aalbala.m03.uf4.ex16lliga.model.Equip;
import iam.aalbala.m03.uf4.ex16lliga.model.Lliga;

public class Vista {

	Scanner input;

	public Vista() {
		input = new Scanner(System.in);
	}

	public int menuPrincipal() {

		int opcio = 0;
		do {
			System.out.println("************MENU*************");
			System.out.println("1) Crea Equips");
			System.out.println("2) Crea Lliga");
			System.out.println("3) Juga Lliga");
			System.out.println("4) Classificacio ordenada");
			System.out.println("5) Sortir");
			System.out.print("Escull una opcio: ");
			opcio = input.nextInt();
		} while (opcio < 1 || opcio > 5);
		return opcio;
	}

	public Equip[] creaVectorEquips() {
		System.out.print("Quants equips vols: ");
		int numEquips = input.nextInt();
		Equip[] equips = new Equip[numEquips];
		String nomEquip = input.nextLine();
		for (int i = 0; i < equips.length; i++) {
			System.out.print("Nom equip " + (i + 1) + ": ");
			nomEquip = input.nextLine();
			equips[i] = new Equip(nomEquip);
		}
		return equips;
	}

	public Lliga creaLliga(Equip[] equips) {
		Lliga lliga = new Lliga(equips);
		System.out.println("Has creat satisfactoriament la lliga amb els seus partits!!!");
		return lliga;
	}

	public void jugaLliga() {
		System.out.println("Ja s ha acabat la lliga!!");
	}

	public void classificacioLliga(Lliga lliga) {
		String classificacio = lliga.classificacioordenada();
		System.out.println(classificacio);
	}

	public void sortir() {
		System.out.println("Surts del programa");
	}

	public void opcioAnterior1() {
		System.out.println("Passa per l opcio 1");
	}

	public void opcioAnterior2() {
		System.out.println("Passa per l opcio 2");
	}
}
