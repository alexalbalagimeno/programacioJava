package iam.aalbala.m03.uf5.ex8.controlador;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import iam.aalbala.m03.uf5.ex8.model.Equip;
import iam.aalbala.m03.uf5.ex8.model.EquipLliga;
import iam.aalbala.m03.uf5.ex8.model.Jugador;
import iam.aalbala.m03.uf5.ex8.model.Lliga;
import iam.aalbala.m03.uf5.ex8.model.TeamFileFormatException;
import iam.aalbala.m03.uf5.ex8.vista.Vista;

public class Controlador {

	Vista vista = new Vista();
	Lliga lliga;
	File directoriLliga;
	EquipLliga equipsLliga;

	public void menuPrincipal() throws IOException, TeamFileFormatException, ClassNotFoundException {
		int opcio = 0;
		while (opcio != 5) {
			opcio = vista.menuPrincipal();
			switch (opcio) {
			case 1:
				jugarLliga();
				break;
			case 2:
				editarLliga();
				break;
			case 3:
				llegirLligaSerialitzada();
				break;
			case 4:
				guardarLligaSerialitzada();
				break;
			case 5:
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
				vista.menuPrincipal();
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

	public void llegirLligaSerialitzada() throws IOException, ClassNotFoundException {
		
		equipsLliga = new EquipLliga(lliga.getEquips(),"LligaBBVA");
		
		try {
			EquipLliga e;
			ObjectInputStream in = new ObjectInputStream(new FileInputStream("LligaBBVA/Serial/equips"));
			e = (EquipLliga) in.readObject();
			in.close();
			System.out.println(e);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public void guardarLligaSerialitzada() throws IOException {
		
		equipsLliga = new EquipLliga(lliga.getEquips(),"LligaBBVA");
		
		try {
			ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("LligaBBVA/Serial/equips"));
			out.writeObject(equipsLliga);
			out.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public void sortir() {
		vista.sortir();
	}

}
