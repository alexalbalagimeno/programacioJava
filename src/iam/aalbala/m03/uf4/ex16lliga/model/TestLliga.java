package iam.aalbala.m03.uf4.ex16lliga.model;

public class TestLliga {

	public static void main(String[] args) {

		Equip e1 = new Equip("FC Barcelona");
		Equip e2 = new Equip("Real Madrid");
		Equip e3 = new Equip("Espanyol");

		Equip[] equips = new Equip[3];

		equips[0] = e1;
		equips[1] = e2;
		equips[2] = e3;

		Lliga l1 = new Lliga(equips);

		l1.jugaLliga();

		for (int i = 0; i < l1.partits.length; i++) {
			System.out.println(l1.partits[i].toString() + "\n");
		}

		System.out.println(l1.classificacioordenada());

		System.out.println("Total d'equips: " + Equip.getNumeroEquips());
	}

}
