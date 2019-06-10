package iam.aalbala.m03.uf4.ex13;

public class Circle implements Ordenable, Imprimible {

	String color;
	double radi;

	public Circle(String color, double radi) {
		this.color = color;
		this.radi = radi;
	}

	public boolean menorQue(Ordenable ord) {
		Circle circ = (Circle) ord;
		if (this.radi < circ.radi)
			return true;
		return false;
	}

	public String imprimir() {
		return "El color es " + color + " i el radi es de " + radi;
	}
}
