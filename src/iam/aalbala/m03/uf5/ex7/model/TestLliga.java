package iam.aalbala.m03.uf5.ex7.model;

import java.io.File;
import java.io.IOException;

public class TestLliga {

	public static void main(String[] args) throws NumeroJugadors, IOException, TeamFileFormatException {

		File directoriLliga = new File("LligaBBVA");

		Lliga Lliga1 = new Lliga(directoriLliga);
		
		Lliga1.guardaLliga(directoriLliga);
		
		System.out.println("\nLlistat equips sense partits");

		for (int i = 0; i < Lliga1.equips.size(); i++) {
			System.out.println("\nEquip: " + (i + 1));
			System.out.println(Lliga1.equips.get(i));
			System.out.println("Jugadors");
			for (int j = 0; j < Lliga1.equips.get(i).getJugadors().size(); j++) {
				System.out.println(Lliga1.equips.get(i).getJugadors().get("" + (j + 1)));
			}
		}
//		for (int i = 0; i < Lliga1.partits.size(); i++) {
//			Lliga1.jugaPartit(i);
//			System.out.println("\nAlineació de: "+Lliga1.partits.get(i).getEquipLocal().getNomEquip());
//			for (int j = 0; j < 11; j++) {
//				System.out.println(Lliga1.partits.get(i).getAlineacioEquipLocal().get(j));
//			}
//			System.out.println("\nAlineació de: "+Lliga1.partits.get(i).getEquipVisitant().getNomEquip());
//			for (int j = 0; j < 11; j++) {
//				System.out.println(Lliga1.partits.get(i).getAlineacioEquipVisitant().get(j));
//			}
//			System.out.println("\n"+Lliga1.partits.get(i).resultatPartit());
//			System.out.println(Lliga1.classificacioordenada());
//		}
//
//		System.out.println("Pichichi lliga: " + Lliga1.maximGolejadorLliga() + "\nGols totals: "
//				+ Lliga1.maximGolejadorLliga().getGolsAcumulats());

		// Lliga1.jugaLliga();

		// String guardar = Lliga1.resultatLliga() +"\n"+
		// Lliga1.classificacioordenada();

		// Lliga1.guardaLliga(directoriLliga);
		//
		// System.out.println(Lliga1.resultatLliga());
		//
		// System.out.println(Lliga1.classificacioordenada());
		//
		// System.out.println("Total d'equips: " + Equip.getNumeroEquips());

		// Equip Barcelona = new Equip(dirLliga, "Barcelona");
		// Equip Bilbao = new Equip(dirLliga, "Bilbao");
		// Equip Madrid = new Equip(dirLliga, "Madrid");

		// FileReader fileRead = new FileReader(file);
		// BufferedReader bufferedReader = new Buffer

		// File directori = new File("LligaBBVA");
		// Lliga lligadir = new Lliga(directori);
		//
		// Equip e1 = new Equip("Barcelona");
		// Equip e2 = new Equip("Madrid");
		// Equip e3 = new Equip("Bilbao");
		//
		// Equip[] equips = new Equip[3];
		//
		// equips[0] = e1;
		// equips[1] = e2;
		// equips[2] = e3;
		//
		// Lliga l1 = new Lliga(equips);
		//
		// l1.jugaLliga();
		//
		// for (int i = 0; i < l1.partits.length; i++) {
		// System.out.println(l1.partits[i].toString() + "\n");
		// }
		//
		// System.out.println(l1.classificacioordenada());
		//
		// System.out.println("Total d'equips: " + Equip.getNumeroEquips());

	}

}
