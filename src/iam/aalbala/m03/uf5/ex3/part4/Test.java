package iam.aalbala.m03.uf5.ex3.part4;

public class Test {
	public static void main(String[] args) {
		String palindrome = "holaloh";
		System.out.println((esPalindrome(palindrome) ? "Si" : "No") + " es palíndrome '" + palindrome + "'");
		String paraula = "Hipopotam";
		char character = 'o';
		int num = characterOcurrence(paraula, character);
		System.out.println("En la paraula '" + paraula + "' hi ha " + num + " '" + character + "'");
		String frase = " Aqui hi ha    5  paraules ";
		System.out.println("Número de paraules en '" + frase + "': " + compteParaules(frase));
	}

	public static boolean esPalindrome(String string) {
		String reversed = new StringBuilder(string).reverse().toString();
		return string.equalsIgnoreCase(reversed);
	}

	public static int characterOcurrence(String string, char character) {
		string = string.replaceAll("[^" + character + "]", "");
		return string.length();
	}

	public static int compteParaules(String string) {
		string = string.trim();
		//La primera barra escapa l'expresió \s (que significa espai en blanc)
		//El + és per no tindre en compte si hi ha varis seguits
		String[] paraules = string.split("\\s+");
		return paraules.length;
	}
}
