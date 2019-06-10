package iam.aalbala.m03.uf4.ex14;

public class TestMovable {

	public static void main(String[] args) {
		MovableRectangle rec1 = new MovableRectangle(4, 4, 2, 2, 2, 10);// ySpeed més gran, per tant, es mou en y més
		System.out.println("Inicialment\n" + rec1);
		rec1.moveDown();
		System.out.println("Mou abaix\n" + rec1);
		rec1.moveUp();
		System.out.println("Mou amunt\n" + rec1);
		rec1.moveUp();
		System.out.println("Mou amunt\n" + rec1);
		rec1.moveRight();
		System.out.println("Mou dreta\n" + rec1);
		rec1.moveRight();
		System.out.println("Mou dreta\n" + rec1);
		rec1.moveLeft();
		System.out.println("Mou esquerra\n" + rec1);
		MovableRectangle rec2 = new MovableRectangle(0, 0, 1, 1, 1, 0);// ySpeed 0, no es mou mai en y
		System.out.println("Inicialment\n" + rec2);
		rec2.moveDown();
		System.out.println("Mou abaix\n" + rec2);
		rec2.moveUp();
		System.out.println("Mou amunt\n" + rec2);
		rec2.moveUp();
		System.out.println("Mou amunt\n" + rec2);
		rec2.moveRight();
		System.out.println("Mou dreta\n" + rec2);
		rec2.moveRight();
		System.out.println("Mou dreta\n" + rec2);
		rec2.moveLeft();
		System.out.println("Mou esquerra\n" + rec2);
	}
}
