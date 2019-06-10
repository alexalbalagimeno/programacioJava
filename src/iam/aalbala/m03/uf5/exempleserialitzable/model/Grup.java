package iam.aalbala.m03.uf5.exempleserialitzable.model;

import java.io.Serializable;
import java.util.Scanner;



public class Grup implements Serializable {


	
	// L'únic atribut del grup és un vector d'objectes de classe Alumne
	private Alumne alumnes[];


	
	// Constructor
	public Grup() {

		int n;		// número d'alumnes
		int i;		// per recòrrer el vector
		String nom;	// nom d'un alumne
		float nota;	// nota d'un alumne
		int edat;	// edat d'un alumne

		// Per demanar coses pel teclat
		Scanner teclat = new Scanner(System.in);
		
		// Demana quants alumnes volem (comprovant que el valor és correcte)
		System.out.println("Quants alumnes vols? ");
		do {
		  n = teclat.nextInt();
		} while (n <= 0);

		// Crea espai al vector pel número d'alumnes que ens han dit
		alumnes = new Alumne[n];

		// Recorre el vector d'alumnes i per a cada posició:
		for (i = 0; i < alumnes.length; i++) {

			// Demanem el nom de l'alumne
			System.out.println("Nom de l'alumne " + (i+1) + " : ");
			nom = teclat.next();

			// Demanem l'edat de l'alumne, fins que sigui correcta
			do {
				System.out.println("Edat de l'alumne " + (i+1) + " : ");
				edat = teclat.nextInt();
			} while (edat <= 0);


			// Demanem la nota de l'alumne, fins que sigui correcta
			do {
				System.out.println("Nota de l'alumne " + (i+1) + " : ");
				nota = teclat.nextFloat();
			} while ((nota < 0) || (nota>10));

			// Crea l'alumne a la posició corresponent del vector, cridant al constructor
			alumnes[i] = new Alumne(nom, edat, nota);
		}
	};



	// métode "numAprovats" retorna el número d'alumnes aprovats
	public int numAprovats() {

		int n = 0;	// número d'aprovats
		int i;		// per recòrrer el vector

		// recorrem el vector d'alumnes i obtenim la nota amb el mètode getNota() d'Alumne
		for (i = 0; i < alumnes.length; i++)
			if (alumnes[i].getNota() >= 5)
				n++;

		return n;
	};



	// métode "setTutor" assigna un tutor a un grup d'alumnes
	public void setTutor(Professor p) {

		int i;

		// Recorre el vector d'alumnes, i a cada alumne crida el seu mètode setTutor()
		for (i = 0; i < alumnes.length; i++)
			alumnes[i].setTutor(p);
	}



	// métode "imprimir" per imprimir un grup d'alumnes
	public void imprimir() {

		int i;

		System.out.println("Alumnes");
		System.out.println("-------");

		// Recorre el vector d'alumnes, i a cada alumne crida el seu mètode imprimir()
		for (i = 0; i < alumnes.length; i++)
			alumnes[i].imprimir();
	}

}
