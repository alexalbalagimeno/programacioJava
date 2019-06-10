package iam.aalbala.m03.uf4.ex1;

public class TestPersona {

	public static void main(String[] args) {
		
		Persona persona = new Persona("Pere","Perez","433455H",22, false);
		System.out.println(persona.getNom());
		System.out.println(persona.mostraNomComplert());
		System.out.println(persona.mostraEstatCivil());
		persona.aniversari();
		System.out.println(persona.mostraPersona());
	}

}
