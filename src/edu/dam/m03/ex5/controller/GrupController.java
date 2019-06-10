package edu.dam.m03.ex5.controller;

import edu.dam.m03.ex5.model.Estudiant;
import edu.dam.m03.ex5.model.Grup;
import edu.dam.m03.ex5.model.Professor;
import edu.dam.m03.ex5.view.GrupView;

public class GrupController {
	Grup grup;
	GrupView view;

	public GrupController() {
		view = new GrupView();
	}

	public void menuPrincipal() {
		int opcio = view.menuPrincipal();
		switch (opcio) {
		case 1:
			menuCrearGrup();

			break;
		case 2:
			return;
		default:
			break;
		}
	}

	public void menuCrearGrup() {
		String nomGrup = view.nomGrup();
		Professor p = view.crearProfessor();
		Estudiant[] arrEstudiants = new Estudiant[view.numeroAlumnes()];
		for (int i = 0; i < arrEstudiants.length; i++) {
			arrEstudiants[i] = view.crearAlumne();
		}
		grup = new Grup(nomGrup, p, arrEstudiants);

		menuGrup();

	}

	public void menuGrup() {
		int opcio = view.opcioMenuGrup();
		switch (opcio) {
		case 1:
			eliminarAlumne();
			break;
		case 2:
			afegirAlumne();
			break;
		case 3:
			mostrarAprovats();
		default:
			break;
		}
	}

	public void afegirAlumne() {
		Estudiant e = view.crearAlumne();
		grup.afegirAlumne(e);
	}

	public void eliminarAlumne() {
		int codiAlumne = view.demanarCodiAlumne();
		grup.eliminarAlumne(codiAlumne);
	}

	public void mostrarAprovats() {
		view.mostrarEstudiants(grup.grupAprovats());
	}

}
