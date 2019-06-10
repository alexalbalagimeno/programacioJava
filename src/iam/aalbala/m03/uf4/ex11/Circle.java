package iam.aalbala.m03.uf4.ex11;

public class Circle extends Shape {

	double radius;

	public Circle() {
		radius = 1;
	}

	public Circle(double radius) {
		this.radius = radius;
	}

	public Circle(double radius, String color, boolean filled) {
		super(color, filled);
		this.radius = radius;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	public double getArea() {
		return Math.PI * radius * radius;
	}

	public double getPerimeter() {
		return 2 * Math.PI * radius;
	}

	public String toString() {
		return "\nTipus: Circle\nPerimeter: " + getPerimeter() + "\nArea: " + getArea() + "\nColor: " + getColor()
				+ "\nFilled: " + isFilled() + "\nRadius: " + getRadius() + "\n";
	}
}
