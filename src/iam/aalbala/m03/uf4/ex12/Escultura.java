package iam.aalbala.m03.uf4.ex12;

public class Escultura extends Obra {
	String material;
	double altura;

	public Escultura(String titulo, int numeroInventario, Artista autor, int anio, String material, double altura) {
		super(titulo, numeroInventario, autor, anio);
		this.material = material;
		this.altura = altura;
	}

	public String getMaterial() {
		return material;
	}

	public void setMaterial(String material) {
		this.material = material;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public String toString() {
		return super.toString() + "\nMaterial escultura: " + material + "\nAltura escultura: " + altura + "\n";
	}
}