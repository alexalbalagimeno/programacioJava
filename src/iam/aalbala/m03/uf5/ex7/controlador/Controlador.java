package iam.aalbala.m03.uf5.ex7.controlador;

import java.io.File;
import java.io.IOException;

import iam.aalbala.m03.uf5.ex7.model.Equip;
import iam.aalbala.m03.uf5.ex7.model.Jugador;
import iam.aalbala.m03.uf5.ex7.model.Lliga;
import iam.aalbala.m03.uf5.ex7.model.TeamFileFormatException;
import iam.aalbala.m03.uf5.ex7.vista.Vista;

public class Controlador {

	Vista vista = new Vista();
	Lliga lliga;
	File directoriLliga;

	public void menuPrincipal() throws IOException, TeamFileFormatException {
		int opcio = 0;
		while (opcio != 3) {
			opcio = vista.menuPrincipal();
			switch (opcio) {
			case 1:
				jugarLliga();
				break;
			case 2:
				editarLliga();
				break;
			case 3:
				sortir();
				break;
			}
		}
	}

	public void jugarLliga() throws IOException, TeamFileFormatException {

		vista.infoDirectori();

		directoriLliga = new File("LligaBBVA");

		lliga = new Lliga(directoriLliga);

		lliga.guardaLliga(directoriLliga);
		
		
	}

	public void editarLliga() throws IOException, TeamFileFormatException {
		int opcioEdita = 0;

		directoriLliga = new File("LligaBBVA");

		lliga = new Lliga(directoriLliga);

		do {
			opcioEdita = vista.menuEditar();
			switch (opcioEdita) {
			case 1:
				afegirEquip();
				break;
			case 2:
				borrarEquip();
				break;
			case 3:
				modificarEquip();
				break;
			case 4:
				borrarCarregar();
				menuPrincipal();
				break;
			}
		} while (opcioEdita != 4);
	}

	public void afegirEquip() throws TeamFileFormatException {

		Equip creat = vista.creaEquip();
		lliga.getEquips().add(creat);
		vista.infoEquipCreat(creat.getNomEquip());
	}

	public void borrarEquip() throws IOException, TeamFileFormatException {
		String nomEquip = vista.demanaEquipNom();
		for (int i = 0; i < lliga.getEquips().size(); i++) {
			if (lliga.getEquips().get(i).getNomEquip().equals(nomEquip)) {
				lliga.getEquips().remove(i);
				vista.infoEquipBorrat(nomEquip);
			}
		}
	}

	public void modificarEquip() throws IOException, TeamFileFormatException {
		String nomEquip = vista.demanaEquipNom();
		int opcio = vista.menuModificaEquip(nomEquip);
		switch (opcio) {
		case 1:
			cambiaNom(nomEquip);
			break;
		case 2:
			afegirJugador(nomEquip);
			break;
		case 3:
			borraJugador(nomEquip);
			break;
		}
	}
	
	public void cambiaNom(String nomEquip) {
		String nouNomEquip = vista.donaNouNomEquip();
		File antic = new File(directoriLliga+"/"+nomEquip+".txt");
		antic.renameTo(new File(directoriLliga+"/"+nouNomEquip+".txt"));
	}

	public void afegirJugador(String nomEquip) throws TeamFileFormatException {
		Jugador nou = vista.dadesNouJugador();
		for (int i = 0; i < lliga.getEquips().size(); i++) {
			if (lliga.getEquips().get(i).getNomEquip().equals(nomEquip)) {
				lliga.getEquips().get(i).getJugadors().put(nou.getDorsal(), nou);
				vista.infoJugadorAfegit(nomEquip);
			}
		}
	}
	
	public void borraJugador(String nomEquip) throws TeamFileFormatException {
		String dorsalJugador = vista.dorsalBorraJugador();
		for (int i = 0; i < lliga.getEquips().size(); i++) {
			if (lliga.getEquips().get(i).getNomEquip().equals(nomEquip)) {
				lliga.getEquips().get(i).getJugadors().remove(dorsalJugador);
				vista.infoJugadorBorrat(nomEquip);
			}
		}
	}
	
	public void borrarCarregar() throws IOException, TeamFileFormatException {

		File[] fitxers = directoriLliga.listFiles();
		for (int i = 0; i < fitxers.length; i++) {
			if (!fitxers[i].isDirectory()) {
				fitxers[i].delete();
			}
		}
		lliga.creaFitxersEquips();
	}

	public void sortir() {
		vista.sortir();
	}

}
