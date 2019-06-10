package iam.aalbala.m03.uf4.ex7;

public class Quadrat extends ObjecteGeometric {
	double costat;

	public Quadrat(int x, int y, String color, double costat) {
		super(x, y, color);
		this.costat = costat;
	}

	public Quadrat(int x, int y, double costat) {
		super(x, y);
		this.costat = costat;
	}

	public double perimetre() {
		return 4 * costat;
	}

	public double area() {
		return costat * costat;
	}

	public String toString() {
		return super.toString() + "\nTipus: Quadrat\nPerimetre: " + perimetre() + "\nÀrea: " + area() + "\n";
	}
}
