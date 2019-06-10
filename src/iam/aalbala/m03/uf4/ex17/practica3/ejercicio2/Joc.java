package iam.aalbala.m03.uf4.ex17.practica3.ejercicio2;

public abstract class Joc {
	private int vides;
	private int numVides;
	int record = 0;

	public Joc(int vides) {
		this.vides = vides;
		numVides = vides;
	}

	public String mostraVidesRestants() {
		return "Vides restants: " + numVides;
	}

	public int getVides() {
		return vides;
	}

	public void setVides(int vides) {
		this.vides = vides;
	}

	public boolean quitaVida() {
		numVides--;
		if (numVides < 0) {
			System.out.println("Joc acabat");
			return false;
		} else
			return true;
	}

	public void reiniciaPartida() {
		numVides = vides;
	}

	public void actualizaRecord() {
		if (numVides == record) {
			record = numVides;
			System.out.println("Has arribat al record");
		} else if (numVides > record) {
			record = numVides;
			System.out.println("Has batut el record, el nou record es " + record);
		}
	}
	
	public abstract void juga();
	
}
