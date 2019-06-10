package iam.aalbala.m03.uf5.ex6.model;

import java.util.HashMap;
import java.util.Map;

public class Agenda {

	HashMap<String, String> contactes;

	public Agenda() {
		contactes = new HashMap<String, String>();
	}

	public String afegirContacte(String nom, String telefon) {
		if (contactes.get(nom) == null) {
			contactes.put(nom, telefon);
			return "Contacte nou afegit";
		} else {
			contactes.put(nom, telefon);
			return "Usuari existent actualitzat";
		}
	}

	public String esborrarContacte(String nom) {
		if (contactes.get(nom) == null) {
			return "No existia";
		} else {
			System.out.println(contactes.get(nom));//ensenya value(telefon) de la key(nom)
			contactes.remove(nom);
			return "Contacte borrat";
		}
	}

	public String llistarContactes() {
		String llista = "La llista de contactes es: \n";
		for (Map.Entry<String, String> entry : contactes.entrySet()) {
			llista = llista + "Nom: " + entry.getKey() + "\n";
			llista = llista + "Tel: " + entry.getValue() + "\n";
			llista = llista + "************************" + "\n";
		}
		return llista;
	}

}