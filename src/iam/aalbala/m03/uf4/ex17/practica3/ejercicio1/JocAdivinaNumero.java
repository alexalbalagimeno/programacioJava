package iam.aalbala.m03.uf4.ex17.practica3.ejercicio1;

import java.util.Scanner;

public class JocAdivinaNumero extends Joc {
	int numAAdivinar;
	Scanner input = new Scanner(System.in);

	public JocAdivinaNumero(int vides, int numAAdivinar) {
		super(vides);
		this.numAAdivinar = numAAdivinar;
	}

	public void juga() {
		reiniciaPartida();
		boolean acaba = false;
		do {
			System.out.print("Adivina un numero entre 0 i 10: ");
			int numIntroduit = input.nextInt();
			if (numAAdivinar == numIntroduit) {
				System.out.println("Has encertat");
				actualizaRecord();
				acaba = true;
			} else if (numAAdivinar > numIntroduit) {
				System.out.println("Has de posar un numero major");
			} else if (numAAdivinar < numIntroduit) {
				System.out.println("Has de posar un numero menor");
			}
		} while (quitaVida() == true && acaba == false);
	}
}
