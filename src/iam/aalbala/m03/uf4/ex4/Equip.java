package iam.aalbala.m03.uf4.ex4;

public class Equip {
	
	private String nomEquip;
	private int puntsLliga;
	
	public Equip(String nomEquip) {
		this.nomEquip = nomEquip;
		puntsLliga = 0;
	}

	public String getNomEquip() {
		return nomEquip;
	}

	public int getPuntsLliga() {
		return puntsLliga;
	}

	public int incrementaPunts(int puntsAincrementar) {
		puntsLliga = puntsLliga + puntsAincrementar;
		return puntsLliga;
	}
}
