package iam.aalbala.m03.uf4.ex5;

import java.util.Scanner;

public class TestEx5 {

	public static void main(String[] args) {
		String nomGrup;
		String dniProfessor;
		String nomProfessor;
		String nomAlumne;
		String dniAlumne;
		int notaAlumne;

		Scanner teclat = new Scanner(System.in);

		System.out.println("Nom del grup: ");
		nomGrup = teclat.nextLine();
		System.out.println("Dni professor: ");
		dniProfessor = teclat.nextLine();
		System.out.println("Nom professor: ");
		nomProfessor = teclat.nextLine();
		System.out.println("Quants alumnes vols afegir: ");
		int numalum = teclat.nextInt();
		nomAlumne = teclat.nextLine(); // per alliberar buffer

		Professor p1 = new Professor(nomProfessor, dniProfessor);
		Estudiant[] alumnes = new Estudiant[numalum];

		for (int i = 0; i < numalum; i++) {
			System.out.println("Nom: ");
			nomAlumne = teclat.nextLine();
			System.out.println("Dni: ");
			dniAlumne = teclat.nextLine();
			System.out.println("Nota: ");
			notaAlumne = teclat.nextInt();
			alumnes[i] = new Estudiant(nomAlumne, dniAlumne);
			alumnes[i].setNota(notaAlumne);
			nomAlumne = teclat.nextLine(); // per alliberar buffer
		}

		Grup g1 = new Grup(nomGrup, p1, alumnes);

		System.out.println("Total d'aprovats: " + g1.numAprovats());

		Estudiant[] alumAprovats;
		alumAprovats = g1.grupAprovats();

		for (int i = 0; i < alumAprovats.length; i++) {
			System.out.println(alumAprovats[i].toString() + "\nNota: " + alumAprovats[i].getNota());
		}

		System.out.println(g1.toString());

		Estudiant[] alumnesAfegitAlumne = g1.afegirAlumne("nou alumne", "QQQ");
		
		
		g1 = new Grup(nomGrup, p1, alumnesAfegitAlumne);
		System.out.println(g1.toString());
		
		Estudiant[] alumnesBorratAlumne = g1.borrarAlumne("22A");
		g1 = new Grup(nomGrup, p1, alumnesBorratAlumne);
		System.out.println(g1.toString());
	}
}