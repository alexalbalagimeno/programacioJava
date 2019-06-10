package iam.aalbala.m03.uf5.ex4.part4;

import java.util.Collections;
import java.util.Scanner;
import java.util.Vector;

public class Test {

	public static void main(String[] args) {
		/*
		 * (4) Fent servir la classe Vector, creeu un programa en Java que donat un
		 * vector de 15 elements amb valors aleatoris introduïts per l’usuari, sigui
		 * capaç d’ordenar el vector i treure el resultat per pantalla.
		 */
		Scanner input = new Scanner(System.in);
		int valor;
		Vector<Integer> v1 = new Vector<Integer>(15);
		for (int i = 0; i < v1.capacity(); i++) {
			System.out.print("Valor " + (i + 1) + ": ");
			valor = input.nextInt();
			v1.add(valor);
		}
		Collections.sort(v1);
		System.out.println(v1);
	}

}
