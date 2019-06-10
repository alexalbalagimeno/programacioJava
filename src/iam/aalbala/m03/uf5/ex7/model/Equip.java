package iam.aalbala.m03.uf5.ex7.model;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Hashtable;
import java.util.Random;

public class Equip implements Comparable<Equip> {

	private String nomEquip;
	private int puntsLliga;
	private static int nroequips = 0;
	private Hashtable<String, Jugador> jugadors;
	private ArrayList<Jugador> alineacio;
	private File fitxer;

	public Equip(String nomEquip, Hashtable<String, Jugador> jugadors) {
		this.nomEquip = nomEquip;
		this.jugadors = jugadors;
		puntsLliga = 0;
		nroequips++;
	}

	public Equip(File fitxer) throws IOException, NumeroJugadors, TeamFileFormatException {
		puntsLliga = 0;
		nroequips++;
		this.fitxer = fitxer;
		this.nomEquip = fitxer.getName().replace(".txt", "");
		//System.out.println("Equip: " + fitxer.getName());
		String linia = "";
		// Equip e1 = new Equip(nomEquip, jugadors);
		if (fitxer.isFile()) {
			jugadors = new Hashtable<String, Jugador>();
			BufferedReader entrada = new BufferedReader(new FileReader(fitxer));
			while ((linia = entrada.readLine()) != null) {
				Jugador j = new Jugador(linia);
				jugadors.put(j.getDorsal(), j);
			}
			entrada.close();
			if (jugadors.size() < 15) {
				throw new NumeroJugadors("Minim 15 jugadors per equip");
			}
		}
	}

	public ArrayList<Jugador> crearAlineacio(int numJugadors) {
		ArrayList<Jugador> jugadorsValues = new ArrayList<Jugador>(jugadors.values());
		alineacio = new ArrayList<Jugador>();
		for (int i = 0; i < numJugadors; i++) {
			Random r = new Random();
			int posJug = r.nextInt(jugadorsValues.size());// dona posicio jugador
			// jugadorsValues.get(posJug).setGolsAcumulats(0);//jugador ara te 0 gols
			// acumulats
			alineacio.add(jugadorsValues.get(posJug));// guarda jugador d aquella posicio
			jugadorsValues.remove(posJug);// treu jugador d aquella posicio
		}
		return alineacio;
	}

	public Hashtable<String, Jugador> llistarTotsJugadors() {
		return jugadors;
	}

	public Hashtable<String, Jugador> getJugadors() {
		return jugadors;
	}

	public String retornaLinies() {
		String total = "";
		ArrayList<Jugador> jugadorsValues = new ArrayList<Jugador>(jugadors.values());
		int n = jugadors.size();
		for (int i = 0; i < n; i++) {
			if (i < n - 1) {
				total += jugadorsValues.get(i).formatFitxer() + "\n";
			}
			else
				total += jugadorsValues.get(i).formatFitxer();
		}
		return total;
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

	public int compareTo(Equip e) {
		int diferencia = e.puntsLliga - this.puntsLliga;
		return diferencia;
	}

	public int incrementaPunts(int puntsAincrementar) {
		puntsLliga = puntsLliga + puntsAincrementar;
		return puntsLliga;
	}

	public String toString() {
		return "Nom equip: " + nomEquip + "\tPunts lliga: " + puntsLliga;
	}
}
