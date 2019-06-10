package iam.aalbala.m03.uf5.ex4.part1;

import java.util.Scanner;
import java.util.Vector;

public class Test {

	public static void main(String[] args) {
		/*
		 * (1) Fent servir la classe Vector, Creeu un programa en Java, que primer
		 * llegeix un vector de deu elements numèrics i a continuació calcula el seu
		 * mòdul
		 */
		Scanner input = new Scanner(System.in);
		double suma = 0;
		int valor = 0;
		Vector<Integer> v1 = new Vector<Integer>(10);
		for (int i = 0; i < v1.capacity(); i++) {
			System.out.print("Valor " + (i + 1) + ": ");
			valor = input.nextInt();
			v1.add(valor);
			suma = suma + Math.pow((double) (v1.get(i)), 2);
		}
		System.out.println("Modul del vector es: "+Math.sqrt(suma));
	}
}
