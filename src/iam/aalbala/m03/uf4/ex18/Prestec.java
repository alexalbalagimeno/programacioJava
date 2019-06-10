package iam.aalbala.m03.uf4.ex18;

import java.util.Date;

public class Prestec extends ProducteBancari {
	Date dataFiPrestec = new Date();
	CompteCorrent associat;
	double quantDiners;
	int mesos;
	double cuotaMensual;

	@SuppressWarnings("deprecation")
	public Prestec(Client client, CompteCorrent associat, double quantDiners, int mesos) {
		super(client);
		this.associat = associat;
		this.quantDiners = quantDiners;
		this.mesos = mesos;
		cuotaMensual = quantDiners / mesos;
		dataFiPrestec = new Date(dataFiPrestec.getYear(), dataFiPrestec.getMonth() + mesos, dataFiPrestec.getDay());
	}

	public double getCuotaMensual() {
		return cuotaMensual;
	}

	public Date getDataFiPrestec() {
		return dataFiPrestec;
	}

	public String toString() {
		return "DADES PRESTEC:\nQuantitat diners prestec: " + quantDiners + "\nMesos a retornarlo: " + mesos;
	}
}
