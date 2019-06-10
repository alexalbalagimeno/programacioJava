package iam.aalbala.m03.uf5.exempleserialitzable.model;

import java.io.Serializable;


public class Professor implements Serializable {

	private String nom;
	private int edat;
	private transient int sou;
	
	public Professor(String nom, int edat) {
		this.nom = nom;
		this.edat = edat;
		this.sou = 0; 
	}
	
	public Professor(String nom, int edat, int sou) {
		this.nom = nom;
		this.edat = edat;
		this.sou = sou;
	}
	
	public void complirAnys() {
		edat = edat + 1;
	}
	
	public String getNom() {
		return nom;
	}
	
	public void setSou(int s) {
		sou = s;
	}

	public int getsou() {
		return sou;
	}
	
	public void imprimir() {
		System.out.println("Nom: " + nom + "   Edat: " + edat + "   Sou: " + sou);
	}

}
