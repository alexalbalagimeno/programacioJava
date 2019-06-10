package iam.aalbala.m03.uf4.ex9;

public class Partit {

	private Equip equipLocal;
	private Equip equipVisitant;
	private int golsEquipLocal;
	private int golsEquipVisitant;

	public Partit(Equip equipLocal, Equip equipVisitant) {
		this.equipLocal = equipLocal;
		this.equipVisitant = equipVisitant;
		golsEquipLocal = 0;
		golsEquipVisitant = 0;
	}

	public Equip getEquipLocal() {
		return equipLocal;
	}

	public Equip getEquipVisitant() {
		return equipVisitant;
	}

	public int getGolsEquipLocal() {
		return golsEquipLocal;
	}

	public int getGolsEquipVisitant() {
		return golsEquipVisitant;
	}
	
	
	public void setGolsEquipLocal(int golsEquipLocal) {
		this.golsEquipLocal = golsEquipLocal;
	}

	public void setGolsEquipVisitant(int golsEquipVisitant) {
		this.golsEquipVisitant = golsEquipVisitant;
	}

	public void marcaEquipLocal() {
		golsEquipLocal++;
	}

	public void marcaEquipVisitant() {
		golsEquipVisitant++;
	}

	public String fi() {
		if (golsEquipLocal > golsEquipVisitant) {
			equipLocal.incrementaPunts(3);
			return "Guanya " +equipLocal.getNomEquip();
		}
		else if (golsEquipLocal == golsEquipVisitant) {
			equipLocal.incrementaPunts(1);
			equipVisitant.incrementaPunts(1);
			return "Empat";
		}
		else {
			equipVisitant.incrementaPunts(3);
			return "Guanya " +equipVisitant.getNomEquip();
		}
	}

	public String toString() {
		return "Equip Local: " + equipLocal.getNomEquip() + "\nEquip Visitant: " + equipVisitant.getNomEquip() + "\nGols: " + golsEquipLocal + " - " + golsEquipVisitant;
	}
}
