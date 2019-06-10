package iam.aalbala.m03.uf5.ex3.part1;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		/*
		 * (1) Fent servir la classe String, creeu un programa en Java que digui si una
		 * paraula introduïda és un palíndrom o no, és a dir, si es llegeix igual
		 * d'esquerra a dreta que de dreta a esquerra.
		 */

		Scanner input = new Scanner(System.in);
		System.out.print("Introdueix una paraula: ");
		String paraula = input.nextLine();
		int cont=0;
		for (int i = 0; i < paraula.length()/2; i++) {
			if(paraula.charAt(i)==paraula.charAt(paraula.length()-i-1)) {
				cont++;
			}
			if(cont==paraula.length()/2) {
				System.out.println("Palindrom");
			}
		}
		
	}
	
	public static boolean isPalindrome(String string) {
		String reversed = new StringBuilder(string).reverse().toString();
		return string.equalsIgnoreCase(reversed);
	}
	
	public static int characterOcurrence(String string, char character) {
		string = string.replaceAll("[^"+character+"]","");
		return string.length();
	}
	
	public static int countWords(String string) {
		string = string.trim();
		String[] words = string.split("\\s+");
		return words.length;
	}

}
