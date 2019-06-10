package iam.aalbala.m03.uf4.ex14;

public class MovablePoint implements Movable {
	int x;
	int y;
	int xSpeed;
	int ySpeed;

	public MovablePoint(int x, int y, int xSpeed, int ySpeed) {
		this.x = x;
		this.y = y;
		this.xSpeed= xSpeed;
		this.ySpeed = ySpeed;
	}

	public void moveUp() {
		this.y += ySpeed;
	}

	public void moveDown() {
		this.y -= ySpeed;
	}

	public void moveLeft() {
		this.x -= xSpeed;
	}

	public void moveRight() {
		this.x += xSpeed;
	}

	public String toString() {
		return "MovablePoint [x=" + x + ", y=" + y + "]";
	}
}
