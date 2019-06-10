package iam.aalbala.m03.uf4.ex17.practica3.ejercicio2;

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
		int numIntroduit = 1000;
		do {
			System.out.print("Adivina un numero entre 0 i 10: ");
			numIntroduit = input.nextInt();
			if (validaNumero(numIntroduit)) {
				System.out.println("Has encertat");
				actualizaRecord();
			} else if (numAAdivinar > numIntroduit && !validaNumero(numIntroduit)) {
				System.out.println("Has de posar un numero major");
			} else if (numAAdivinar < numIntroduit && !validaNumero(numIntroduit)) {
				System.out.println("Has de posar un numero menor");
			}
		} while (quitaVida() == true && !validaNumero(numIntroduit));
	}

	public boolean validaNumero(int numeroIntroduit) {
		if (numeroIntroduit == numAAdivinar) {
			return true;
		} else
			return false;
	}
}
