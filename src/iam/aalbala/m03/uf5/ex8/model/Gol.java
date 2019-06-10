package iam.aalbala.m03.uf5.ex8.model;

import java.util.Random;

public class Gol implements Comparable<Gol>{
	private Jugador jugador;
	private int minut;
	
	public Gol(Jugador jugador) {
		this.jugador = jugador;
		jugador.marcaGol();
		Random r = new Random();
		minut = r.nextInt(91);
	}

	public Jugador getJugador() {
		return jugador;
	}
	
	public int compareTo(Gol g) {
		return minut - g.minut;
	}
	
	public String toString() {
		return "Gol de " + jugador.nom + " " +jugador.cognom + " minut "+ minut;
	}
}
