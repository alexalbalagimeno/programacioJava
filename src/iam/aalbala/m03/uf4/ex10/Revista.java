package iam.aalbala.m03.uf4.ex10;

public class Revista extends Item {
	private int any;
	private int nro;

	public Revista(String referencia, String titol, int any, int nro) {
		super(referencia, titol);
		this.any = any;
		this.nro = nro;
	}

	public int getAny() {
		return any;
	}

	public void setAny(int any) {
		this.any = any;
	}

	public int getNro() {
		return nro;
	}

	public void setNro(int nro) {
		this.nro = nro;
	}

	public String toString() {
		return super.toString() + "\nAny: " + any + "\nNúmero de revista: " + nro;
	}

}
