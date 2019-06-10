package iam.aalbala.m03.uf5.ex8.model;

import java.io.Serializable;
import java.util.ArrayList;

public class EquipLliga implements Serializable {
	ArrayList<Equip> equips;
	String nomLliga;

	public EquipLliga(ArrayList<Equip> equips, String nomLliga) {
		this.equips = equips;
		this.nomLliga = nomLliga;
	}

	public ArrayList<Equip> getEquips() {
		return equips;
	}

	public String getNomLliga() {
		return nomLliga;
	}

	public String toString() {

		String tot = "";
		tot = nomLliga + "\n";
		for (int i = 0; i < equips.size(); i++) {
			tot = tot + equips.get(i).getNomEquip() + "\nJugadors\n" + equips.get(i).llistarTotsJugadors().values();
		}
		return tot;
	}
}
