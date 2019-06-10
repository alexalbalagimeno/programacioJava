package iam.aalbala.m03.uf4.ex3;

public class Partit {

	private String nomEquipLocal;
	private String nomEquipVisitant;
	private int golsEquipLocal;
	private int golsEquipVisitant;

	public Partit(String nomEquipLocal, String nomEquipVisitant) {
		this.nomEquipLocal = nomEquipLocal;
		this.nomEquipVisitant = nomEquipVisitant;
		golsEquipLocal = 0;
		golsEquipVisitant = 0;
	}

	public String getNomEquipLocal() {
		return nomEquipLocal;
	}

	public String getNomEquipVisitant() {
		return nomEquipVisitant;
	}

	public int getGolsEquipLocal() {
		return golsEquipLocal;
	}

	public int getGolsEquipVisitant() {
		return golsEquipVisitant;
	}

	public void marcaEquipLocal() {
		golsEquipLocal++;
	}

	public void marcaEquipVisitant() {
		golsEquipVisitant++;
	}

	public String fi() {
		if (golsEquipLocal > golsEquipVisitant)
			return "Guanya " +nomEquipLocal;
		else if (golsEquipLocal == golsEquipVisitant)
			return "Empat";
		else
			return "Guanya " +nomEquipVisitant;
	}

	public String toString() {
		return "Equip local: " + nomEquipLocal + "\nEquip Visitant: " + nomEquipVisitant + "\nGols: " + golsEquipLocal + " - " + golsEquipVisitant;
	}
}
