package iam.aalbala.m03.uf4.ex6;

public class Equip implements Comparable<Equip>{
	
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
    
	@Override
	public int compareTo(Equip e) {
		int diferencia = e.puntsLliga - this.puntsLliga;
		return diferencia;
	}
	public int incrementaPunts(int puntsAincrementar) {
		puntsLliga = puntsLliga + puntsAincrementar;
		return puntsLliga;
	}
	
}
