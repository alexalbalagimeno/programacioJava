package iam.aalbala.m03.uf4.ex9;

import java.util.Arrays;

public class TestLliga {

	public static void main(String[] args) {

		Equip[] equips = new Equip[4];

		equips[0] = new Equip("FC Barcelona");
		equips[1] = new Equip("Real Madrid");
		equips[2] = new Equip("Espanyol");
		equips[3] = new Equip("Bilbao");

		Lliga l1 = new Lliga(equips);

		
		//l1.jugaLliga();
		for (int i = 0; i < l1.partits.length; i++) {
			l1.jugaPartit(i);
		}
		//System.out.println(Arrays.toString(l1.partits));
		
		for (int i = 0; i < l1.partits.length; i++) {
			System.out.println("Partit: "+(i+1));
			System.out.println(l1.partits[i] + "\n");
		}

		System.out.println(l1.classificacioordenada());

		System.out.println("Total d'equips: " + Equip.getNumeroEquips());
		
	}

}
