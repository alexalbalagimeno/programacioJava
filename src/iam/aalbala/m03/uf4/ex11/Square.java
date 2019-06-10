package iam.aalbala.m03.uf4.ex11;

public class Square extends Rectangle {

	public Square() {

	}

	public Square(double side) {
		super.length = side;
		super.width = side;
	}

	public Square(double side, String color, boolean filled) {
		super.color = color;
		super.filled = filled;
		super.length = side;
		super.width = side;
	}

	public double getSide() {
		return super.length;
	}

	public void setSide(double side) {
		super.length = side;
		super.width = side;
	}

	public void setWidth(double side) {
		setSide(width);
	}

	public void setLength(double side) {
		setSide(length);
	}

	public String toString() {
		return "\nTipus: Quadrat\nPerimeter: " + getPerimeter() + "\nArea: " + getArea() + "\nColor: " + getColor()
				+ "\nFilled: " + isFilled() + "\n" + "\nLength: " + length + "\nWidth: " + width+"\n";
	}
}
