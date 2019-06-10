package iam.aalbala.m03.uf5.ex8.model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Partit {

	private Equip equipLocal;
	private Equip equipVisitant;
	private ArrayList<Jugador> alineacioEquipLocal;
	private ArrayList<Jugador> alineacioEquipVisitant;
	private ArrayList<Gol> golsEquipLocal;
	private ArrayList<Gol> golsEquipVisitant;

	public Partit(Equip equipLocal, Equip equipVisitant) {
		this.equipLocal = equipLocal;
		this.equipVisitant = equipVisitant;
		this.golsEquipLocal = new ArrayList<Gol>();
		this.golsEquipVisitant = new ArrayList<Gol>();
		this.alineacioEquipLocal = equipLocal.crearAlineacio(11);
		this.alineacioEquipVisitant = equipVisitant.crearAlineacio(11);
	}

	public Equip getEquipLocal() {
		return equipLocal;
	}

	public Equip getEquipVisitant() {
		return equipVisitant;
	}

	public ArrayList<Jugador> getAlineacioEquipLocal() {
		return alineacioEquipLocal;
	}

	public ArrayList<Jugador> getAlineacioEquipVisitant() {
		return alineacioEquipVisitant;
	}

	public void marcaEquipLocal() {
		Random r = new Random();
		int numAleatori = r.nextInt(alineacioEquipLocal.size());
		Jugador jugadorMarca = alineacioEquipLocal.get(numAleatori);
		golsEquipLocal.add(new Gol(jugadorMarca));
		Collections.sort(golsEquipLocal);
	}

	public void marcaEquipVisitant() {
		Random r = new Random();
		int numAleatori = r.nextInt(alineacioEquipVisitant.size());
		Jugador jugadorMarca = alineacioEquipVisitant.get(numAleatori);
		golsEquipVisitant.add(new Gol(jugadorMarca));
		Collections.sort(golsEquipVisitant);
	}

	public String fi() {
		if (golsEquipLocal.size() > golsEquipVisitant.size()) {
			equipLocal.incrementaPunts(3);
			return "Guanya " + equipLocal.getNomEquip();
		} else if (golsEquipLocal.size() == golsEquipVisitant.size()) {
			equipLocal.incrementaPunts(1);
			equipVisitant.incrementaPunts(1);
			return "Empat";
		} else {
			equipVisitant.incrementaPunts(3);
			return "Guanya " + equipVisitant.getNomEquip();
		}
	}

	public String resultatPartit() {

		String resultat;

		// resultat final
		if (golsEquipLocal.size() > golsEquipVisitant.size()) {
			resultat = equipLocal.getNomEquip() + " " + golsEquipLocal.size() + " - " + equipVisitant.getNomEquip()
					+ " " + golsEquipVisitant.size() + "\nGuanya " + equipLocal.getNomEquip();
		} else if (golsEquipLocal.size() < golsEquipVisitant.size()) {
			resultat = equipLocal.getNomEquip() + " " + golsEquipLocal.size() + " - " + equipVisitant.getNomEquip()
					+ " " + golsEquipVisitant.size() + "\nGuanya " + equipVisitant.getNomEquip();
		} else {
			resultat = equipLocal.getNomEquip() + " " + golsEquipLocal.size() + " - " + equipVisitant.getNomEquip()
					+ " " + golsEquipVisitant.size() + "\nEmpat";
		}
		// gols equip local
		resultat += "\nGols equip local " + equipLocal.getNomEquip() + "\n";
		for (Gol gol : golsEquipLocal) {
			resultat += gol + "\n";
		}

		// gols equip local
		resultat += "\nGols equip visitant " + equipVisitant.getNomEquip() + "\n";
		for (Gol gol : golsEquipVisitant) {
			resultat += gol + "\n";
		}

		return resultat;
	}
}
