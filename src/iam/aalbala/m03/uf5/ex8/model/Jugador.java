package iam.aalbala.m03.uf5.ex8.model;

import java.io.Serializable;

public class Jugador implements Comparable <Jugador>, Serializable{
	String dorsal;
	String nom;
	String cognom;
	int edat;
	int alcada;
	int golsAcumulats;

	public Jugador(String linia) throws TeamFileFormatException {
		String[] caracteristiques = linia.split("#");

		try {
			this.dorsal = caracteristiques[0];
			this.nom = caracteristiques[1];
			this.cognom = caracteristiques[2];
			this.edat = Integer.parseInt(caracteristiques[3]);
			this.alcada = Integer.parseInt(caracteristiques[4]);
			this.golsAcumulats = Integer.parseInt(caracteristiques[5]);
		} catch (Exception e) {
			throw new TeamFileFormatException("La linia del fitxer de jugador no és correcte: " + linia); 
		} 
	}
	
	public String formatFitxer() {
		return dorsal+"#"+nom+"#"+cognom+"#"+edat+"#"+alcada+"#"+golsAcumulats;
	}

	public void setGolsAcumulats(int golsAcumulats) {
		this.golsAcumulats = golsAcumulats;
	}

	public String getDorsal() {
		return dorsal;
	}

	public String getNom() {
		return nom;
	}

	public String getCognom() {
		return cognom;
	}

	public int getEdat() {
		return edat;
	}

	public int getAlcada() {
		return alcada;
	}

	public int getGolsAcumulats() {
		return golsAcumulats;
	}
	
	public int compareTo(Jugador j) {
		return j.golsAcumulats - golsAcumulats;
	}
	
	public void marcaGol() {
		golsAcumulats++;
	}
	
	public String toString() {
		return dorsal + ", " + nom + ", " + cognom + ", " + edat + ", " + alcada;
	}
}
