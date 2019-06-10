package iam.aalbala.m03.uf4.ex8;

public class Taylor {
	
	public static double sin(double x) {
		
		return x - Math.pow(x, 3)/6 + Math.pow(x, 5)/120;
	}
	
	public static double cosi(double x) {
		
		return 1 - Math.pow(x, 2)/2 + Math.pow(x, 4)/24;
	}
	
	public static double exp(double x) {
		
		return 1 + x + Math.pow(x, 2)/2 + Math.pow(x, 3)/6 + Math.pow(x, 4)/24 + Math.pow(x, 5)/120;
	}
	
	public static String autor() {
		return "Autor: Àlex Albalà";
	}
	
}
