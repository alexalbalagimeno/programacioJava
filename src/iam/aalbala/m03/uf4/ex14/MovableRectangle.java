package iam.aalbala.m03.uf4.ex14;

public class MovableRectangle implements Movable {
	MovablePoint topLeft;
	MovablePoint bottomRight;
	int xSpeed, ySpeed;

	public MovableRectangle(int x1, int y1, int x2, int y2, int xSpeed, int ySpeed) {
		this.topLeft = new MovablePoint(x1, y1, xSpeed, ySpeed);
		this.bottomRight = new MovablePoint(x2, y2, xSpeed, ySpeed);
		this.xSpeed = xSpeed;
		this.ySpeed = ySpeed;
	}

	public void moveUp() {
		topLeft.moveUp();
		bottomRight.moveUp();
	}

	public void moveDown() {
		topLeft.moveDown();
		bottomRight.moveDown();
	}

	public void moveLeft() {
		topLeft.moveLeft();
		bottomRight.moveLeft();
	}

	public void moveRight() {
		topLeft.moveRight();
		bottomRight.moveRight();
	}

	public String toString() {
		return "MovableRectangle [Dalt Esquerre=" + topLeft + ", Baix dreta=" + bottomRight + ", xSpeed=" + xSpeed
				+ ", ySpeed=" + ySpeed + "]";
	}

}
