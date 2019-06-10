package iam.aalbala.m03.uf4.ex7;

public class TestObjecteGeometric {

	public static void main(String[] args) {

		ObjecteGeometric o1 = new ObjecteGeometric(3, 3);
		Cercle c1 = new Cercle(1, 2, 3);
		Cercle c2 = new Cercle(3, 4, "Vermell", 2);
		Quadrat q1 = new Quadrat(2, 3, 4);
		Quadrat q2 = new Quadrat(5, 5, "Blau", 5);

		System.out.println(o1);
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(q1);
		System.out.println(q2);

	}

}
