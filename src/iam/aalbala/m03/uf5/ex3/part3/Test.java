package iam.aalbala.m03.uf5.ex3.part3;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		/*
		 * (3) Fent servir la classe String, creeu un programa en Java que compti el
		 * nombre de paraules a una frase. (Pista: podeu considerar una paraula com la
		 * transició d'un caràcter que no és una lletra a un caràcter que sí és una
		 * lletra).
		 */

		Scanner input = new Scanner(System.in);
		System.out.print("Introdueix una frase: ");
		String frase = input.nextLine();
		char[] fraseChar = frase.toCharArray();
		System.out.print("Introdueix una paraula: ");
		String paraula = input.nextLine();
		char[] paraulaChar = paraula.toCharArray();
		int cont = 0;
		int contParaula = 0;
		for (int i = 0; i < frase.length(); i++) {
			if (fraseChar[i] == paraulaChar[cont]) {
				cont++;
			} 
			else {
				cont = 0;
			}
			if (cont == paraula.length()) {
				contParaula++;
			}
		}
		System.out.println("Aquesta sequència de lletres surt: " + contParaula);
	}

}
