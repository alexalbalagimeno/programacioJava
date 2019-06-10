package iam.aalbala.m03.uf4.ex7;

public class Cercle extends ObjecteGeometric {

	double radi;

	public Cercle(int x, int y, String color, double radi) {
		super(x, y, color);
		this.radi = radi;
	}

	public Cercle(int x, int y, double radi) {
		super(x, y);
		this.radi = radi;
	}

	public double perimetre() {
		return 2 * Math.PI * radi;
	}

	public double area() {
		return Math.PI * radi * radi;
	}

	public String toString() {
		return super.toString() + "\nTipus: Cercle\nPerimetre: " + perimetre() + "\nÀrea: " + area() + "\n";
	}
	
	
}
