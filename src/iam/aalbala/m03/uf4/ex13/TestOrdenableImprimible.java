package iam.aalbala.m03.uf4.ex13;

public class TestOrdenableImprimible {

	public static void main(String[] args) {

		Circle[] circles = new Circle[3];
		circles[0] = new Circle("vermell", 4);
		circles[1] = new Circle("blau", 2);
		circles[2] = new Circle("verd", 3);
		OrdenaVector.directSort(circles);
		System.out.println(OrdenaVector.imprimirArray(circles));
		System.out.println(circles[0].menorQue(circles[1]));
		System.out.println(circles[0].menorQue(circles[2]));
		System.out.println(circles[1].menorQue(circles[0]));
		System.out.println(circles[1].menorQue(circles[2]));
		System.out.println(circles[2].menorQue(circles[0]));
		System.out.println(circles[2].menorQue(circles[1]));
		System.out.println(circles[0].imprimir());
		System.out.println(circles[1].imprimir());
		System.out.println(circles[2].imprimir());
	}
	
}
