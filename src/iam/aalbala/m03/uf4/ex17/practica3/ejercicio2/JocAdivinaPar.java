package iam.aalbala.m03.uf4.ex17.practica3.ejercicio2;

public class JocAdivinaPar extends JocAdivinaNumero {

	public JocAdivinaPar(int vides, int numAAdivinar) {
		super(vides, numAAdivinar);
	}

	public void juga() {
		reiniciaPartida();
		int numIntroduit = 1000;
		do {
			System.out.print("Adivina un numero par entre 0 i 10: ");
			numIntroduit = input.nextInt();
			validaNumero(numIntroduit);
			if (numIntroduit == numAAdivinar) {
				System.out.println("Has encertat");
				actualizaRecord();
			} else if (numAAdivinar > numIntroduit) {
				System.out.println("Has de posar un numero major");
			} else if (numAAdivinar < numIntroduit) {
				System.out.println("Has de posar un numero menor");
			}
		} while (quitaVida() == true && numIntroduit != numAAdivinar);
	}

	public boolean validaNumero(int numeroIntroduit) {
		if (numeroIntroduit % 2 == 0) {
			return true;
		} else {
			System.out.println("Error");
			return false;
		}
	}
}
