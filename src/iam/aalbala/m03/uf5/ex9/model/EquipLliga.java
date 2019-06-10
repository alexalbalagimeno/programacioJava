package iam.aalbala.m03.uf5.ex9.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Map;
import java.util.Map.Entry;

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

		// amb enumeration
//		for (int i = 0; i < equips.size(); i++) {
//			tot = tot + equips.get(i).getNomEquip() + "\nJugadors\n";
//			for (Enumeration<Jugador> e = equips.get(i).llistarTotsJugadors().elements(); e.hasMoreElements();) {
//				tot = tot + e.nextElement() + "\n";
//			}
//		}
		// recorre map per entry
		for (int i = 0; i < equips.size(); i++) {
			tot = tot + equips.get(i).getNomEquip() + "\nJugadors\n";
			for (Entry<String, Jugador> entry : equips.get(i).llistarTotsJugadors().entrySet()) {
				tot = tot + entry.getValue() + "\n";
			}
		}

//		for (int i = 0; i < equips.size(); i++) {
//			tot = tot + equips.get(i).getNomEquip() + "\nJugadors\n";
//			for (int j = 0; j < equips.get(i).getJugadors().size(); j++) {
//				tot = tot + equips.get(i).llistarTotsJugadors().get(""+j+1);
//			}
//		}
		// values en tira array
//		for (int i = 0; i < equips.size(); i++) {
//			tot = tot + equips.get(i).getNomEquip() + "\nJugadors\n" + equips.get(i).llistarTotsJugadors().values()+"\n";
//		}
		// amb llista arrayList
//		for (int i = 0; i < equips.size(); i++) {
//			ArrayList<Jugador> jugadorsValues = new ArrayList<Jugador>(equips.get(i).llistarTotsJugadors().values());
//			tot = tot + equips.get(i).getNomEquip() + "\nJugadors\n";
//			for (int j = 0; j < equips.get(i).getJugadors().size(); j++) {
//				tot = tot + jugadorsValues.get(j) + "\n";
//			}
//		}
		return tot;
	}
}
