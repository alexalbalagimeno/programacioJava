package iam.aalbala.m03.uf4.ex11;

public class Rectangle extends Shape {

	double width;
	double length;

	public Rectangle() {
		width = 1;
		length = 2;
	}

	public Rectangle(double width, double length) {
		this.width = width;
		this.length = length;
	}

	public Rectangle(double width, double length, String color, boolean filled) {
		super(color, filled);
		this.width = width;
		this.length = length;
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public double getLength() {
		return length;
	}

	public void setLength(double length) {
		this.length = length;
	}

	public double getArea() {
		return width * length;
	}

	public double getPerimeter() {
		return 2 * width + 2 * length;
	}

	public String toString() {
		return "\nTipus: Rectangle\nPerimeter: " + getPerimeter() + "\nArea: " + getArea() + "\nColor: " + getColor()
				+ "\nFilled: " + isFilled() + "\n";
	}
}
