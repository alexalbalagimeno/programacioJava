package iam.aalbala.m03.uf4.ex16lliga.model;

import java.util.Arrays;
import java.util.Random;

public class Lliga {

	Equip[] equips;
	Partit[] partits;

	public Lliga(Equip[] equips) {
		this.equips = equips;
		int n = equips.length;
		partits = new Partit[n * n - n];
		int numpartit = 0;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (i != j) {
					partits[numpartit++] = new Partit(equips[i], equips[j]);
				}
			}
		}
	}

	public void jugaPartit(int numpartit) {
		Random r = new Random();
		int gols = r.nextInt(5);

		for (int i = 0; i < gols; i++) {
			partits[numpartit].marcaEquipLocal();
		}

		gols = r.nextInt(5);
		for (int i = 0; i < gols; i++) {
			partits[numpartit].marcaEquipVisitant();
		}

		partits[numpartit].fi();
	}

	public void jugaLliga() {
		for (int i = 0; i < partits.length; i++)
			jugaPartit(i);
	}

	public String classificacio() {
		String retornar = "";

		for (int i = 0; i < equips.length; i++) {
			retornar = retornar + equips[i].getNomEquip() + " Punts" + equips[i].getPuntsLliga() + "\n";
		}
		return "Classificació\n" + retornar;
	}

	public String classificacioordenada() {
		String retornar = "";
		//Equip aux;

		/*for (int i = 0; i < equips.length - 1; i++) {
			for (int j = 0; j < equips.length - i - 1; j++) {
				if (equips[j + 1].getPuntsLliga() > equips[j].getPuntsLliga()) {
					aux = equips[j + 1];
					equips[j + 1] = equips[j];
					equips[j] = aux;
				}
			}
		}*/
		
		Arrays.sort(equips);

		for (int i = 0; i < equips.length; i++) {
			retornar = retornar + equips[i].getNomEquip() + " Punts" + equips[i].getPuntsLliga() + "\n";
		}
		return "Classificació\n" + retornar;
	}
}