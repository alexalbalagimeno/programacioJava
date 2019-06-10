package iam.aalbala.m03.uf4.ex18;

import java.util.Date;

public abstract class Persona {
	String nom;
	String cognom;
	String nif;
	Date datanaix;
	String adresa;

	@SuppressWarnings("deprecation")
	public Persona(String nom, String cognom, String nif, int dia, int mes, int any, String adresa) {
		this.nom = nom;
		this.cognom = cognom;
		this.nif = nif;
		this.adresa = adresa;
		this.datanaix = new Date(any, mes, dia);
	}

	public String toString() {
		return "DADES PERSONALS:\nNom: " + nom + "\tCognom: " + cognom + "\t\tNIF: " + nif + "\nData naixament: " + datanaix
				+ "\tAdresa: " + adresa;
	}
}
