package iam.aalbala.m03.uf5.ex1;

public class Test {

	public static void main(String[] args) {

		EquacioGrau2 eq1 = new EquacioGrau2(0, 1, 1);

		/*try {
			eq1.arrels();
			System.out.println("Sol1: "+eq1.getSol1()+ "\nSol2: "+eq1.getSol2());
		} catch (PrimerCoeficientZeroException e) {
			e.printStackTrace();
			System.out.println(e);
		} catch (NoArrelsRealsException e) {
			e.printStackTrace();
			System.out.println(e);
		}*/
		
		try {
			eq1.arrels();
			System.out.println("Sol1: "+eq1.getSol1()+ "\nSol2: "+eq1.getSol2());
		} catch (PrimerCoeficientZeroException e) {
			System.out.println(e);
		} catch (NoArrelsRealsException e) {
			System.out.println(e);
		}
	}
}
