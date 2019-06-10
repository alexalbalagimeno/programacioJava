package iam.aalbala.m03.uf5.exempleserialitzable.model;

import java.io.Serializable;

public class Alumne implements Serializable {
	
	private String nom;
	private int edat;
	private transient float nota;
	private Professor tutor;
	
	public Alumne(String nom, int edat) {
		this.nom = nom;
		this.edat = edat;
		nota = 10;
	}
	
	public Alumne(String nom, int edat, float nota) {
		this.nom = nom;
		this.edat = edat;
		this.nota = nota;
	}
	
	public void complirAnys() {
		edat = edat + 1;
	}
	
	public String getNom() {
		return nom;
	}
	
	public void setNota(float n) {
		nota = n;
	}

	public float getNota() {
		return nota;
	}
	
	public void setTutor(Professor p) {
		tutor = p;
	}
	
	public void imprimir() {
		System.out.println("Nom: " + nom + "   Edat: " + edat + "   Nota: " + nota + "   Tutor: " + tutor.getNom());
	}

}
