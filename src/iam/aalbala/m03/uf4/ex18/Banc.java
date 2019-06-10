package iam.aalbala.m03.uf4.ex18;

import java.util.ArrayList;
import java.util.Collections;

public class Banc {
	String nom;
	ArrayList<Treballador> treballadors;
	ArrayList<Client> clients;
	ArrayList<ProducteBancari> productesBancaris;

	public Banc(String nom, ArrayList<Treballador> treballadors, ArrayList<Client> clients,
			ArrayList<ProducteBancari> productesBancaris) {
		super();
		this.nom = nom;
		this.treballadors = treballadors;
		this.clients = clients;
		this.productesBancaris = productesBancaris;
	}

	public void creaTreballador(Treballador nou) {
		treballadors.add(nou);
	}

	public void creaClient(Client nou) {
		clients.add(nou);
	}

	public void creaProducteBancari(ProducteBancari nou) {
		productesBancaris.add(nou);
		if (nou instanceof Prestec) {
			Prestec p1 = (Prestec) nou;
			p1.associat.quantDiners = p1.associat.quantDiners + p1.quantDiners;
		}
	}

	public ArrayList<Client> llistaOrdenadaQuantDiners() {

		ArrayList<CompteCorrent> comptesCorrentsordenar =  new ArrayList<CompteCorrent>();
		for (int i = 0; i < productesBancaris.size(); i++) {
			if (productesBancaris.get(i) instanceof CompteCorrent) {
				CompteCorrent c1 = (CompteCorrent) productesBancaris.get(i);
				comptesCorrentsordenar.add(c1);
			}
		}
		Collections.sort(comptesCorrentsordenar);
		return clients;
	}

	public ArrayList<Client> llistaPrestecActiu() {
		ArrayList<Client> clientsPrestecActiu = new ArrayList<Client>();
		for (int i = 0; i < productesBancaris.size(); i++) {
			if (productesBancaris.get(i) instanceof Prestec) {
				Prestec p1 = (Prestec) productesBancaris.get(i);
				CompteCorrent cc1 = p1.associat;
				clientsPrestecActiu.add(cc1.client);
			}
		}
		return clientsPrestecActiu;
	}
}
