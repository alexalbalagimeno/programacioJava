package iam.aalbala.m03.uf4.ex12;

public class Artista {
	String nombre;
	String lugarDeNacimiento;

	public Artista(String nombre, String lugarDeNacimiento) {
		this.nombre = nombre;
		this.lugarDeNacimiento = lugarDeNacimiento;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getLugarDeNacimiento() {
		return lugarDeNacimiento;
	}

	public void setLugarDeNacimiento(String lugarDeNacimiento) {
		this.lugarDeNacimiento = lugarDeNacimiento;
	}

	public String toString() {
		return "\nNombre: " + nombre + "\nLugar de Nacimiento: " + lugarDeNacimiento;
	}
}
