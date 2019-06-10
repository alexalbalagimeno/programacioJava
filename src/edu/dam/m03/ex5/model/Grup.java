package edu.dam.m03.ex5.model;

public class Grup {
	private String nom;
	private Professor profe;
	Estudiant[] estudiants;

	public Estudiant[] getEstudiants() {
		return estudiants;
	}

	public Grup(String nom, Professor profe, Estudiant[] estudiant) {
		this.nom = nom;
		this.profe = profe;
		this.estudiants = estudiant;
	}

	public String toString() {
		String strAlumnes = "";
		for (int i = 0; i < estudiants.length; i++) {
			strAlumnes = strAlumnes + "\n" + estudiants[i].toString();
		}
		return strAlumnes;
	}

	public int numAprovats() {
		int numAprovats = 0;
		for (int i = 0; i < estudiants.length; i++) {
			
			if (estudiants[i].getNota() >= 5) {
				numAprovats++;
			}
		}

		return numAprovats;
	}

	public Estudiant[] grupAprovats() {
		Estudiant[] alumnesAprovats = new Estudiant[numAprovats()];
		int k=0;
		for (int i = 0; i < estudiants.length; i++) {
			if (estudiants[i].getNota() >= 5) {
				alumnesAprovats[k] = estudiants[i];
				k++;
			}
		}
		return alumnesAprovats;
	}

	public Professor getTutor() {
		return profe;
	}

	public String eliminarAlumne(int codi) {
		Boolean numTrobat = false;
		for (int i = 0; i < estudiants.length; i++) {
			if (estudiants[i].getCodiAlumne() == codi) {
				numTrobat = true;
			}
		}
		if (numTrobat) {
			Estudiant[] estudiant2 = new Estudiant[estudiants.length - 1];
			int k = 0;
			for (int i = 0; i < estudiants.length; i++) {
				if (estudiants[i].getCodiAlumne() != codi) {
					estudiant2[k] = estudiants[i];
					k++;
				}
			}
			this.estudiants = estudiant2;
			return "S'ha elimitat l'alumne correctament";
		} else {
			return "No es pot eliminar l'alumne, ja que no existeix";
		}
	}

	public String afegirAlumne(Estudiant a) {
		boolean codiTrobat = false;
		for (int i = 0; i < estudiants.length; i++) {
			if (a.getCodiAlumne() == estudiants[i].getCodiAlumne()) {
				codiTrobat = true;
			}
		}
		if (!codiTrobat) {
			Estudiant[] estudiant2 = new Estudiant[estudiants.length + 1];
			for (int i = 0; i < estudiants.length; i++) {
				estudiant2[i] = estudiants[i];
			}
			estudiant2[estudiants.length] = a;
			estudiants = estudiant2;
			return "S'ha afegit correctament";
		} else {
			return "No s'ha afegit, ja que ja existeix un alumne amb el codi "+a.getCodiAlumne();
		}
	}

}
