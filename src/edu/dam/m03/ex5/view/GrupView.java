package edu.dam.m03.ex5.view;

import java.util.Scanner;

import edu.dam.m03.ex5.model.Estudiant;
import edu.dam.m03.ex5.model.Professor;

public class GrupView {
	Scanner input;

	public GrupView() {
		input = new Scanner(System.in);
	}

	public int menuPrincipal() {
		System.out.println("Escull una opció:");
		System.out.println("1: Crear Grup");
		System.out.println("2: Sortir");
		return input.nextInt();
	}

	public int numeroAlumnes() {
		int numAlumnes;
		do {
			System.out.println("Quants alumnes vols tenir al grup (mensy de 30): ");
			numAlumnes = input.nextInt();
		} while (numAlumnes < 1 || numAlumnes > 30);
		return numAlumnes;
	}

	public Professor crearProfessor() {
		System.out.println("Nom tutor: ");
		String nom = input.next();
		System.out.println("Codi tutor: ");
		int codi = input.nextInt();
		System.out.println("Modul: ");
		String modul = input.next();
		return new Professor(nom, codi, modul);

	}

	public Estudiant crearAlumne() {

		System.out.println("Nom alumne: ");
		String nomAlumne = input.next();
		System.out.println("Codi alumne: ");
		int codiAlumne = input.nextInt();
		System.out.println("Edat alumne: ");
		int edatAlumne = input.nextInt();
		System.out.println("Nota alumne: ");
		int notaAlumne = input.nextInt();
		return new Estudiant(nomAlumne, codiAlumne, edatAlumne, notaAlumne);
	}

	public String nomGrup() {
		System.out.println("Nom del grup: ");
		return input.next();

	}

	public int opcioMenuGrup() {
		System.out.println("Escull una opció:");
		System.out.println("1: Elminar Alumne");
		System.out.println("2: Afegir Alumne");
		System.out.println("3: Mostrar aprovats");
		System.out.println("4: Sortir");
		return input.nextInt();

	}

	public int demanarCodiAlumne() {
		System.out.println("Codi alumne: ");
		return input.nextInt();

	}

	public void mostrarEstudiants(Estudiant[] e) {
		System.out.println("El grup d'estudiants són:");
		for (int i = 0; i < e.length; i++) {
			System.out.println(e[i]);
		}
		System.out.println("Fins aquí la llista d'estudiants");
	}

}
