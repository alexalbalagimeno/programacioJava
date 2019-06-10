package iam.aalbala.m03.uf4.ex4;

public class TestPartit {

	public static void main(String[] args) {

		Equip e1 = new Equip("FC Barcelona");
		Equip e2 = new Equip("Real Madrid");
		Partit p1 = new Partit(e1, e2);
		Partit p2 = new Partit(e2, e1);
		p1.marcaEquipLocal();
		p1.marcaEquipLocal();
		p1.marcaEquipLocal();
		p1.marcaEquipLocal();
		p1.marcaEquipVisitant();
		p1.marcaEquipVisitant();
		p1.marcaEquipVisitant();
		System.out.println(p1);
		System.out.println(p1.fi());
		System.out.println("Punts lliga\n" + e1.getNomEquip() + " - " + e1.getPuntsLliga() + " punts\n"
				+ e2.getNomEquip() + " - " + e2.getPuntsLliga() + " punts");

		p2.marcaEquipLocal();
		p2.marcaEquipLocal();
		p2.marcaEquipVisitant();
		p2.marcaEquipVisitant();
		p2.marcaEquipVisitant();
		System.out.println(p2);
		System.out.println(p2.fi());
		System.out.println("Punts lliga\n" + e1.getNomEquip() + " - " + e1.getPuntsLliga() + " punts\n"
				+ e2.getNomEquip() + " - " + e2.getPuntsLliga() + " punts");

	}

}