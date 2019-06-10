package edu.dam.m03.ex5.model;

public class Estudiant {
	private String nom;
	private int codiAlumne;
	private int edat;
	private int nota;
	
	public Estudiant(String nom, int codiAlumne, int edat, int nota) {
		this.nom = nom;
		this.codiAlumne = codiAlumne;
		this.edat = edat;
		this.nota = nota;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public int getCodiAlumne() {
		return codiAlumne;
	}

	public void setCodiAlumne(int codiAlumne) {
		this.codiAlumne = codiAlumne;
	}

	public int getEdat() {
		return edat;
	}

	public void setEdat(int edat) {
		this.edat = edat;
	}
	
	
	public int getNota() {
		return nota;
	}

	public void setNota(int nota) {
		this.nota = nota;
	}
/*
	public String toString() {
		return "Hola, em dic "+getNom()+", soc Estudiant, tinc "+ getEdat()+" anys,  el meu codi d'alumne és "+getCodiAlumne()+ " i he tret un "+getNota();
	}
	*/
}
