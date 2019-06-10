package iam.aalbala.m03.uf4.ex16lliga.controlador;

import iam.aalbala.m03.uf4.ex16lliga.model.Equip;
import iam.aalbala.m03.uf4.ex16lliga.model.Lliga;
import iam.aalbala.m03.uf4.ex16lliga.model.Partit;
import iam.aalbala.m03.uf4.ex16lliga.vista.Vista;

public class Controlador {

	Vista vista1 = new Vista();
	Lliga lliga;
	Equip[] equips;
	Partit[] partits;

	public void menuPrincipal() {
		boolean passaOpcio1 = false;
		boolean passaOpcio2 = false;
		int opcio = 0;
		while (opcio != 5) {
			opcio = vista1.menuPrincipal();
			switch (opcio) {
			case 1:
				crearEquips();
				passaOpcio1 = true;
				break;
			case 2:
				if (passaOpcio1) {
					crearLliga();
					passaOpcio2 = true;
				} else
					opcioAnterior1();
				break;
			case 3:
				if (passaOpcio2) {
					jugaLliga();
				} else
					opcioAnterior2();
				break;
			case 4:
				if (passaOpcio2) {
					classificacioLliga();
				} else
					opcioAnterior2();
				break;
			case 5:
				sortir();
				break;
			}
		}
	}

	public void crearEquips() {
		equips = vista1.creaVectorEquips();
	}

	public void crearLliga() {
		lliga = vista1.creaLliga(equips);
	}

	public void jugaLliga() {
		lliga.jugaLliga();
		vista1.jugaLliga();
	}

	public void classificacioLliga() {
		vista1.classificacioLliga(lliga);
	}

	public void sortir() {
		vista1.sortir();
	}

	public void opcioAnterior1() {
		vista1.opcioAnterior1();
	}

	public void opcioAnterior2() {
		vista1.opcioAnterior2();
	}
}
