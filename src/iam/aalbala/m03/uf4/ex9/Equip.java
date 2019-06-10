package iam.aalbala.m03.uf4.ex9;

public class Equip implements Comparable<Equip>{
	
	private String nomEquip;
	private int puntsLliga;
	private static int nroequips = 0;
	
	public Equip(String nomEquip) {
		this.nomEquip = nomEquip;
		puntsLliga = 0;
		nroequips++;
	}
	
	public static int getNumeroEquips() {
		return nroequips;
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
