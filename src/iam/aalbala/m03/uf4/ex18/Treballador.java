package iam.aalbala.m03.uf4.ex18;

import java.util.Date;

public class Treballador extends Persona{
	double sou;
	Date dataContracte;
	
	@SuppressWarnings("deprecation")
	public Treballador(String nom, String cognom, String nif, int dia, int mes, int any, String adresa, double sou,
			int diaContracte, int mesContracte, int anyContracte) {
		super(nom, cognom, nif, dia, mes, any, adresa);
		this.sou = sou;
		this.dataContracte = new Date(anyContracte, mesContracte, diaContracte);
	}
	
	public String toString() {
		return super.toString() + "\nDADES TREBALLADOR:\nSou: " + sou + "\nData contractacio: " + dataContracte;
	}
}
