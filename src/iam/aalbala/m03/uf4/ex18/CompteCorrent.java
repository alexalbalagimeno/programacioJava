package iam.aalbala.m03.uf4.ex18;

import java.util.Date;

public class CompteCorrent extends ProducteBancari implements Comparable<CompteCorrent> {
	double quantDiners;
	int numCompte;
	Date dataCreacio;
	Date dataCancelacio;

	@SuppressWarnings("deprecation")
	public CompteCorrent(Client client, int numCompte, double quantDiners, int diaDataCreacio, int mesDataCreacio,
			int anyDataCreacio, int diaDataCancelacio, int mesDataCancelacio, int anyDataCancelacio) {
		super(client);
		this.client = client;
		this.numCompte = numCompte;
		this.quantDiners = quantDiners;
		this.dataCreacio = new Date(anyDataCreacio, mesDataCreacio, diaDataCreacio);
		this.dataCancelacio = new Date(anyDataCancelacio, mesDataCancelacio, diaDataCancelacio);
		if (quantDiners <= 25000) {
			client.tipus = "Normal";
		} else if (quantDiners > 25000 && quantDiners <= 50000) {
			client.tipus = "Bronze";
		} else if (quantDiners > 50000 && quantDiners <= 100000) {
			client.tipus = "Silver";
		} else
			client.tipus = "Gold";
	}

	public int compareTo(CompteCorrent c) {
		int diferencia = (int) c.quantDiners - (int) this.quantDiners;
		return diferencia;
	}

	public boolean retirarDiners(double dinersARetirar) {
		if (dinersARetirar <= quantDiners) {
			quantDiners = quantDiners - dinersARetirar;
			return true;
		} else
			return false;
	}

	public boolean ingressarDiners(double ingresDiners) {
		if (ingresDiners > 0) {
			quantDiners = quantDiners + ingresDiners;
			return true;
		} else
			return false;
	}

	public boolean transferenciaCompteCorrent(CompteCorrent rep, int dinersTransferencia) {
		if (dinersTransferencia > 0) {
			rep.ingressarDiners(dinersTransferencia);
			retirarDiners(dinersTransferencia);
			return true;
		} else
			return false;
	}

	public String toString() {
		return client.toString() + "\nDADES COMPTE:\nNumero compte: " + numCompte + "\nDiners: " + quantDiners
				+ "\nData creacio: " + dataCreacio + "\nData cancelacio: " + dataCancelacio;
	}
}
