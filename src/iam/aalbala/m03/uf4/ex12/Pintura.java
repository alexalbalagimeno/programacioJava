package iam.aalbala.m03.uf4.ex12;

public class Pintura extends Obra {
	double altura;
	double ancho;
	String soporte;

	public Pintura(String titulo, int numeroInventario, Artista autor, int anio, double altura, double ancho,
			String soporte) {
		super(titulo, numeroInventario, autor, anio);
		this.altura = altura;
		this.ancho = ancho;
		this.soporte = soporte;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public double getAncho() {
		return ancho;
	}

	public void setAncho(double ancho) {
		this.ancho = ancho;
	}

	public String getSoporte() {
		return soporte;
	}

	public void setSoporte(String soporte) {
		this.soporte = soporte;
	}

	public String toString() {
		return super.toString() + "\nDimensiones pintura: " + altura + " x " + ancho + "\nSoporte pintura: " + soporte + "\n";
	}

}