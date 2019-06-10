package iam.aalbala.m03.uf5.ex7;

import java.io.IOException;

import iam.aalbala.m03.uf5.ex7.controlador.Controlador;
import iam.aalbala.m03.uf5.ex7.model.TeamFileFormatException;

public class Test {
	public static void main(String[] args) throws IOException, TeamFileFormatException {
		
		Controlador cont1 = new Controlador();
		cont1.menuPrincipal();
	}

}
