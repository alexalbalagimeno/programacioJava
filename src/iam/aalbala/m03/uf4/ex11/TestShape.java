package iam.aalbala.m03.uf4.ex11;

public class TestShape {

	public static void main(String[] args) {
		
		//Exemple 1
		Shape s1 = new Circle(5.5, "RED", false);
		System.out.println(s1);
		System.out.println(s1.getArea());
		System.out.println(s1.getPerimeter());
		System.out.println(s1.getColor());
		System.out.println(s1.isFilled());
		//System.out.println(s1.getRadius());
		
		//Exemple 2
		Circle c1 = (Circle)s1;
		
		System.out.println(c1);
		System.out.println(c1.getArea());
		System.out.println(c1.getPerimeter());
		System.out.println(c1.getColor());
		System.out.println(c1.isFilled());
		System.out.println(c1.getRadius());

		//Exemple 3
		Shape s3 = new Rectangle(1.0, 2.0, "RED", false);
		System.out.println(s3);
		System.out.println(s3.getArea());
		System.out.println(s3.getPerimeter());
		System.out.println(s3.getColor());
		//System.out.println(s3.getLength());

		//Exemple 4
		Rectangle r1 = (Rectangle)s3;
		System.out.println(r1);
		System.out.println(r1.getArea());
		System.out.println(r1.getColor());
		System.out.println(r1.getLength());

		//Exemple 5
		Shape s4 = new Square(6.6);
		System.out.println(s4);
		System.out.println(s4.getArea());
		System.out.println(s4.getColor());
		//System.out.println(s4.getSide());

		//Exemple 6
		Rectangle r2 = (Rectangle)s4;
		System.out.println(r2);
		System.out.println(r2.getArea());
		System.out.println(r2.getColor());
		//System.out.println(r2.getSide());
		System.out.println(r2.getLength());

		// Exemple 7
		Square sq1 = (Square)r2;
		System.out.println(sq1);
		System.out.println(sq1.getArea());
		System.out.println(sq1.getColor());
		System.out.println(sq1.getSide());
		System.out.println(sq1.getLength());

		//Exemple 1 no funciona perquè volem accedir al métode getRadius() que es 
		//de la classe Circle i ho volem fer desde un objecte abstracte Shape on aquest métode no està definit
		
		//Exemple 3 no funciona perquè volem accedir al métode getLength() que es 
		//de la classe Rectangle i ho volem fer desde un objecte abstracte Shape on aquest métode no està definit
		
		//Exemple 5 no funciona perquè volem accedir al métode getSide() que es 
		//de la classe Square i ho volem fer desde un objecte abstracte Shape on aquest métode no està definit
		
		//Exemple 6 no funciona perquè volem accedir al métode getSide() que es 
		//de la classe Square i ho volem fer desde un objecte Rectangle on aquest métode no està definit
		
		//Què és el "downcast" o "upcast"? Quins dels exemples anteriors són una cosa o l'altre?
		
	}

}
