package iam.aalbala.m03.uf4.ex12;

public class TestCatalogo {

	public static void main(String[] args) {

		Obra[] obras = new Obra[4];
		Artista a1 = new Artista("Leonardo", "Italia");
		obras[0] = new Escultura("Escultura1", 1, a1, 2000, "madera", 6);
		obras[1] = new Pintura("Pintura1", 2, a1, 2000, 1, 5, "marco");
		obras[2] = new Escultura("Escultura2", 3, a1, 2000, "madera", 11);
		obras[3] = new Pintura("Pintura2", 4, a1, 2000, 2, 4, "marco");
		Obra o1 = new Pintura("Pintura3", 5, a1, 2001, 2, 2, "Oleo");
		Obra o2 = new Escultura("Escultura3", 6, a1, 2001, "piedra", 9);
		Obra o3 = new Escultura("Escultura1", 6, a1, 2001, "piedra", 3);
		Obra o4 = new Escultura("Escultura4", 7, a1, 2003, "piedra", 3);
		Catalogo cat1 = new Catalogo("Nom",obras);
		System.out.println(cat1.anadeObra(o1));
		System.out.println(cat1.anadeObra(o2));
		System.out.println(cat1.anadeObra(o3));
		System.out.println(cat1.anadeObra(o4));
		System.out.println(cat1);
		System.out.println(cat1.eliminaObra(5));
		System.out.println(cat1.eliminaObra(5));
		System.out.println(cat1);
		System.out.println("Busca obra 7" +cat1.buscaObra(7));
		System.out.println("Busca obra 5"+cat1.buscaObra(5));
		System.out.println("Superficie total: " + cat1.totalSuperficie());
		System.out.println("Num Inv escultura mes alta: " + cat1.esculturaMasAlta());

		System.out.println(a1);
		
	}
}
