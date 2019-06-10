package iam.aalbala.m03.uf4.ex17.practica2;

public class Test {

	public static void main(String[] args) {

		Joc joc1 = new Joc(5);
		joc1.quitaVida();
		joc1.quitaVida();
		System.out.println(joc1.mostraVidesRestants());
		joc1.actualizaRecord();
		joc1.reiniciaPartida();
		joc1.quitaVida();
		joc1.quitaVida();
		joc1.quitaVida();
		joc1.quitaVida();
		System.out.println(joc1.mostraVidesRestants());
		joc1.actualizaRecord();
		joc1.reiniciaPartida();
		joc1.quitaVida();
		System.out.println(joc1.mostraVidesRestants());
		joc1.actualizaRecord();
	}

}
