package iam.aalbala.m03.uf4.ex7;

public class ObjecteGeometric {
	int x;
	int y;
	String color;

	public ObjecteGeometric(int x, int y, String color) {
		this.x = x;
		this.y = y;
		this.color = color;
	}

	public ObjecteGeometric(int x, int y) {
		this.x = x;
		this.y = y;
		color = "Blanc";
	}

	public String toString() {
		return "ObjecteGeometric\nX: " + x + "\nY: " + y + "\nColor: " + color;
	}

}