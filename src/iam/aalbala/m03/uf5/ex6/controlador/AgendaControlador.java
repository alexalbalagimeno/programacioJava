package iam.aalbala.m03.uf5.ex6.controlador;

import iam.aalbala.m03.uf5.ex6.model.Agenda;
import iam.aalbala.m03.uf5.ex6.vista.AgendaView;

public class AgendaControlador {

	Agenda agenda;
	AgendaView view;

	public AgendaControlador() {
		view = new AgendaView();
		agenda = new Agenda();
	}

	public void menuPrincipal() {
		int opcio = 0;
		do {
			opcio = view.menuPrincipal();
			switch (opcio) {
			case 1:
				afegirContacte();
				break;
			case 2:
				esborrarContacte();
				break;
			case 3:
				mostrarAgenda();
				break;
			case 4:
				sortir();
				break;
			default:
				break;
			}
		} while (opcio != 4);
	}

	public void afegirContacte() {
		String nomPersona = view.demanarNom();
		String telPersona = view.demanarTel();
		String resultat = agenda.afegirContacte(nomPersona, telPersona);
		view.mostrarText(resultat);
	}

	public void esborrarContacte() {
		String nomPersona = view.demanarNom();
		String resultat = agenda.esborrarContacte(nomPersona);
		view.mostrarText(resultat);
	}

	public void mostrarAgenda() {
		view.mostrarText(agenda.llistarContactes());
	}

	public void sortir() {
		view.sortir();
	}
}