package iam.aalbala.m03.uf5.ex4.part2;

import java.util.Scanner;
import java.util.Vector;

public class Test {

	public static void main(String[] args) {
		/*
		 * (2) Fent servir la classe Vector, Creeu un programa en Java que emmagatzemi
		 * en un vector la nota dels alumnes d’un grup i posteriorment calculi i
		 * visualitzi el nombre de notes que apareixen dins dels següents intervals:
		 * 
		 * [0 , 5[ Insuficient 
		 * [5 , 7[ Aprovat 
		 * [7 , 9[ Notable 
		 * [9 , 10] Excel·lent
		 * 
		 * Tingueu en compte que, encara que els grups de pràctiques tenen un màxim de
		 * trenta-cinc alumnes, cada grup pot tenir un nombre d’alumnes diferent. El
		 * programa ha de servir per qualsevol grup.
		 */
		Scanner input = new Scanner(System.in);
		System.out.print("Total alumnes del grup: ");
		int numAlumnes = 0;
		do {
			numAlumnes = input.nextInt();
		} while (numAlumnes < 1 || numAlumnes > 35);
		int nota;
		Vector<Integer> numNotes = new Vector<Integer>(numAlumnes);
		int notaSuspes = 0;
		int notaAprovat = 0;
		int notaNotable = 0;
		int notaExc = 0;

		for (int i = 0; i < numNotes.capacity(); i++) {
			System.out.print("Nota alumne " + (i + 1) + ": ");
			nota = input.nextInt();
			numNotes.add(nota);
			if (numNotes.get(i) < 5)
				notaSuspes++;
			else if (numNotes.get(i) >= 5 && numNotes.get(i) < 7)
				notaAprovat++;
			else if (numNotes.get(i) >= 7 && numNotes.get(i) < 9)
				notaNotable++;
			else
				notaExc++;
		}

		System.out.println("\nRESUM NOTES\nSuspesos: " + notaSuspes);
		System.out.println("Aprovats: " + notaAprovat);
		System.out.println("Notables: " + notaNotable);
		System.out.println("Excel.lents: " + notaExc);
	}
}
