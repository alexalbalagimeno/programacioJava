package iam.aalbala.m03.uf4.ex12;

public abstract class Obra {
	String titulo;
	int numeroInventario;
	Artista autor;
	int anio;

	public Obra(String titulo, int numeroInventario, Artista autor, int anio) {
		this.titulo = titulo;
		this.numeroInventario = numeroInventario;
		this.autor = autor;
		this.anio = anio;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public int getNumeroInventario() {
		return numeroInventario;
	}

	public void setNumeroInventario(int numeroInventario) {
		this.numeroInventario = numeroInventario;
	}

	public Artista getAutor() {
		return autor;
	}

	public void setAutor(Artista autor) {
		this.autor = autor;
	}

	public int getAnio() {
		return anio;
	}

	public void setAnio(int anio) {
		this.anio = anio;
	}

	public String toString() {
		return "\nTitulo: " + titulo + "\nNum inventario: " + numeroInventario + "\nAutor: " + autor.getNombre()
				+ "\nLugar de nacimiento: " + autor.getLugarDeNacimiento() + "\nAnio: " + anio;
	}

}