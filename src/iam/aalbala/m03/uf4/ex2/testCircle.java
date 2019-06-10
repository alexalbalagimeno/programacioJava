package iam.aalbala.m03.uf4.ex2;

public class testCircle {

	public static void main(String[] args) {

		int i;
		int j = 0;
		int[] a = new int[10];

		for (i = 0; i < a.length; i++) {
			a[i] = i * 2;
		}
		
		for (i = 0; i < a.length; i++) {
			a[i] = i * 2;
		}
		Circle c1 = new Circle("Vermell", 3.5);
		Circle c2 = new Circle(3.9);

		System.out.println(c1.toString());
		System.out.println(c2.toString());
	}

}
