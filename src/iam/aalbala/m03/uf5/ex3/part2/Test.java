package iam.aalbala.m03.uf5.ex3.part2;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		/*
		 * (2) Fent servir la classe String, creeu un programa en Java que compti el
		 * nombre d'aparicions d'un caràcter a una frase.
		 */
		
		Scanner input = new Scanner(System.in);
		System.out.print("Introdueix una frase: ");
		String frase = input.nextLine();
		char[] fraseChar = frase.toCharArray();
		System.out.print("Introdueix un caracter: ");
		char caracter = input.next().charAt(0);
		int cont=0;
		for (int i = 0; i < frase.length(); i++) {
			if(fraseChar[i]==caracter) {
				cont++;
			}
		}
		System.out.println(cont+" vegades");
	}

}
