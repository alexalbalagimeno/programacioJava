package iam.aalbala.m03.uf4.ex2;

public class Circle {

		String color;
		double radi;
		
		public Circle(String color, double radi) {
			this.color = color;
			this.radi = radi;
		}
		
		public Circle(double radi) {
			this.color = "white";
			this.radi = radi;
		}

		public String getColor() {
			return color;
		}

		public void setColor(String color) {
			this.color = color;
		}

		public double getRadi() {
			return radi;
		}

		public void setRadi(double radi) {
			this.radi = radi;
		}
		
		public double getArea() {
			return Math.PI*radi*radi;
		}
		
		public String toString() {
			return "Això és un cercle\nColor: " + color + "\nRadi: " + radi + "\nArea: " + getArea();
		}
		
}
