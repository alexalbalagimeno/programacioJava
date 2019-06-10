package iam.aalbala.m03.uf4.ex8;

public class TestTaylor {

	public static void main(String[] args) {
		
		System.out.println("sin(1): "+Taylor.sin(1));
		System.out.println("cos(1): "+Taylor.cosi(1));
		System.out.println("exp(1): "+Taylor.exp(1));
		
		System.out.println("sin(2): "+Taylor.sin(2));
		System.out.println("cos(2): "+Taylor.cosi(2));
		System.out.println("exp(2): "+Taylor.exp(2));
		System.out.println(Taylor.autor());

	}

}
