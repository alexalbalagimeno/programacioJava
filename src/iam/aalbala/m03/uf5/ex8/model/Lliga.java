package iam.aalbala.m03.uf5.ex8.model;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Lliga implements Serializable{

	ArrayList<Equip> equips;
	ArrayList<Partit> partits;
	EquipLliga equipsLliga; //es per crear nomes els equips serialitzables
	File directoriLliga;
	File[] fitxers;

	public Lliga(ArrayList<Equip> equips) {
		this.equips = equips;
		int n = equips.size();
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (i != j) {
					Partit p = new Partit(equips.get(i), equips.get(j));
					partits.add(p);
				}
			}
		}
	}
	
	public Lliga(File directoriLliga, EquipLliga equipsLliga) throws IOException {
		this.directoriLliga = directoriLliga;
		equips = equipsLliga.getEquips();
//		// comprovar si existeix directori
//		if (directoriLliga.isDirectory()) {
//			fitxers = directoriLliga.listFiles(); // guardem els fitxers de cada equip
//			equipsLliga = new EquipLliga(getEquips(), "LligaBBVA");
//		}
//		//System.out.println("Llistat equips: ");
//		for (int i = 0; i < fitxers.length; i++) {
//			Equip e = null;
//			try {
//				if (!fitxers[i].isDirectory()) {
//					e = new Equip(fitxers[i]);
//					System.out.println(e.getNomEquip());
//					equipsLliga.getEquips().add(e);
//				}
//			} catch (NumeroJugadors e1) {
//				System.err.println(fitxers[i].getName()+"Minim 15 jugadors per equip");
//			} catch (TeamFileFormatException e2) {
//				System.err.println(fitxers[i].getName()+"Format incorrecte");
//			}
//		}
		int n = equips.size();
		// es preparen els partits
		partits = new ArrayList<Partit>();
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (i != j) {
					Partit p = new Partit(equips.get(i), equips.get(j));
					partits.add(p);
				}
			}
		}
	}

	public Lliga(File directoriLliga) throws IOException{
		this.directoriLliga = directoriLliga;
		// comprovar si existeix directori
		if (directoriLliga.isDirectory()) {
			fitxers = directoriLliga.listFiles(); // guardem els fitxers de cada equip
			equips = new ArrayList<Equip>();
		}
		//System.out.println("Llistat equips: ");
		for (int i = 0; i < fitxers.length; i++) {
			Equip e = null;
			try {
				if (!fitxers[i].isDirectory()) {
					e = new Equip(fitxers[i]);
					//System.out.println(e.getNomEquip());
					equips.add(e);
				}
			} catch (NumeroJugadors e1) {
				System.err.println(fitxers[i].getName()+"Minim 15 jugadors per equip");
			} catch (TeamFileFormatException e2) {
				System.err.println(fitxers[i].getName()+"Format incorrecte");
			}
		}
		int n = equips.size();
		// es preparen els partits
		partits = new ArrayList<Partit>();
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (i != j) {
					Partit p = new Partit(equips.get(i), equips.get(j));
					partits.add(p);
				}
			}
		}
	}

	
	public void setEquips(ArrayList<Equip> equips) {
		this.equips = equips;
	}

	public ArrayList<Equip> getEquips() {
		return equips;
	}

	public void jugaPartit(int numpartit) {
		Random r = new Random();
		int gols = r.nextInt(5);

		for (int i = 0; i < gols; i++) {
			partits.get(numpartit).marcaEquipLocal();
		}

		gols = r.nextInt(5);
		for (int i = 0; i < gols; i++) {
			partits.get(numpartit).marcaEquipVisitant();
		}

		partits.get(numpartit).fi();
	}

	public void jugaLliga() {
		for (int i = 0; i < partits.size(); i++)
			jugaPartit(i);
	}

	public String classificacio() {
		String retornar = "";

		for (int i = 0; i < equips.size(); i++) {
			retornar = retornar + equips.get(i).getNomEquip() + " Punts" + equips.get(i).getPuntsLliga() + "\n";
		}
		return "Classificació\n" + retornar;
	}

	public String classificacioordenada() {
		String retornar = "";
		// Equip aux;

		/*
		 * for (int i = 0; i < equips.length - 1; i++) { for (int j = 0; j <
		 * equips.length - i - 1; j++) { if (equips[j + 1].getPuntsLliga() >
		 * equips[j].getPuntsLliga()) { aux = equips[j + 1]; equips[j + 1] = equips[j];
		 * equips[j] = aux; } } }
		 */

		Collections.sort(equips);

		retornar = "EQUIPS" + "\t\tPUNTS\n";
		for (int i = 0; i < equips.size(); i++) {
			retornar = retornar + equips.get(i).getNomEquip() + "  \t" + equips.get(i).getPuntsLliga() + "\n";
		}
		return "Classificació\n" + retornar;
	}

	public String resultatLliga() {
		String retornar = "";
		Collections.sort(equips);

		int n = partits.size();
		for (int i = 0; i < n; i++) {
			retornar = retornar + partits.get(i);
		}

		return retornar;
	}

	public void guardaLliga(File directoriLliga) {
		int n = partits.size();
		PrintWriter sortida = null;
		try {
			sortida = new PrintWriter(
					directoriLliga + "/Resultats/L" + LocalDate.now() + "_" + LocalDateTime.now().getHour() + "-"
							+ LocalDateTime.now().getMinute() + "-" + LocalDateTime.now().getSecond() + ".txt");
			jugaLliga();
			Collections.sort(equips);
			sortida.println("El equip que guanya la lliga es "+equips.get(0).getNomEquip());
			sortida.println("\n"+classificacioordenada());
			sortida.println("Pichichi lliga: " + maximGolejadorLliga() + "\nGols totals: "
					+ maximGolejadorLliga().getGolsAcumulats());
			for (int i = 0; i < n; i++) {
				sortida.println("\nAlineació Local " + partits.get(i).getEquipLocal().getNomEquip());
				for (int j = 0; j < 11; j++) {
					sortida.println(partits.get(i).getAlineacioEquipLocal().get(j));
				}
				sortida.println("\nAlineació Visitant " + partits.get(i).getEquipVisitant().getNomEquip());
				for (int j = 0; j < 11; j++) {
					sortida.println(partits.get(i).getAlineacioEquipVisitant().get(j));
				}
				sortida.println("\n" + partits.get(i).resultatPartit());
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		sortida.close();
	}

	public Jugador maximGolejadorLliga() {

		ArrayList<Jugador> totsJugadors = new ArrayList<Jugador>();
		for (int i = 0; i < equips.size(); i++) {
			totsJugadors.addAll(equips.get(i).getJugadors().values());
		}
		Collections.sort(totsJugadors);

		return totsJugadors.get(0);
	}
	
	public void creaFitxersEquips() throws IOException {
		
		int n = equips.size();
		for(int i=0; i<n; i++) {
			PrintWriter sortida = new PrintWriter("LligaBBVA/"+equips.get(i).getNomEquip()+".txt");
			sortida.println(""+equips.get(i).retornaLinies());
			sortida.close();
		}
	}
	
}