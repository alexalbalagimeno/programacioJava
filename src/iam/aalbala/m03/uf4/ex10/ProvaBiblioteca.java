package iam.aalbala.m03.uf4.ex10;

public class ProvaBiblioteca {

	public static void main(String[] args) {

		Item i1 = new Item("I1", "Electrodomestic");
		Obra o1 = new Obra("O2", "El señor de los anillos", "Tolkien", 443);
		Obra o2 = new Obra("O2", "Psicosis", "Robert Bloch", 254);
		Revista r1 = new Revista("R1", "Android Adictos", 2017, 2);
		Revista r2 = new Revista("R2", "Computer Hoy", 2018, 5);
		Volum v1 = new Volum("O3", "La niebla", "Stephen King", 243, 4);
		Volum v2 = new Volum("O4", "La guerra de los mundos", "Herbert George Wells", 322, 3);
		Volum v3 = new Volum("O2", "El médico", "Noah Gordon", 322, 5);

		System.out.println(i1);
		System.out.println(o1);
		System.out.println(o2);
		System.out.println(r1);
		System.out.println(r2);
		System.out.println(v1);
		System.out.println(v2);
		System.out.println(v3);
		System.out.println(v3.equals(o2));
		System.out.println(o1.equals(r1));
		System.out.println(i1.equals(r1));
		System.out.println(o1.equals(o2));
		System.out.println("Número d'obres: " + Obra.numObres);
	}

}
