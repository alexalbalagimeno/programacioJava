package iam.aalbala.m03.uf5.ex1;

public class EquacioGrau2 {
	double a;
	double b;
	double c;
	double sol1;
	double sol2;
	
	public EquacioGrau2(double a, double b, double c) {
		this.a = a;
		this.b = b;
		this.c = c;
	}
	
	public void arrels() throws PrimerCoeficientZeroException,NoArrelsRealsException{
		
		if(a==0) throw new PrimerCoeficientZeroException("Primer coeficient 0");
		
		else if(b*b < 4*a*c) throw new NoArrelsRealsException("Arrels negatives");
		
		else {
			sol1 =(-b + Math.sqrt(Math.pow(b,2) -4*a*c) ) / (2*a);
			sol2 =(-b - Math.sqrt(Math.pow(b,2) -4*a*c) ) / (2*a);
		}
	}

	public double getSol1() {
		return sol1;
	}

	public double getSol2() {
		return sol2;
	}
}
