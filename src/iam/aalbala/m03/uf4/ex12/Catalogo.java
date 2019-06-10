package iam.aalbala.m03.uf4.ex12;

public class Catalogo {
	String nomCataleg;
	Obra[] obras;

	public Catalogo(String nomCataleg, Obra[] obras) {
		this.obras = obras;
		this.nomCataleg = nomCataleg;
	}

	public Catalogo(String nomCataleg, Obra obra) {
		this.obras = new Obra[1];
		obras[0] = obra;
		this.nomCataleg = nomCataleg;
	}

	public boolean anadeObra(Obra nova) {
		Obra[] nouArrayObres = new Obra[obras.length + 1];
		int i = 0;
		if (obras.length > 0) {
			for (i = 0; i < obras.length; i++) {
				if (obras[i].getTitulo().equals(nova.getTitulo()))
					return false;
				nouArrayObres[i] = obras[i];
			}
		}
		nouArrayObres[i++] = nova;
		obras = nouArrayObres;
		return true;
	}

	public boolean eliminaObra(int numInventario) {

		boolean existeix = false;
		for (int i = 0; i < obras.length; i++) {
			if (obras[i].getNumeroInventario() == numInventario) {
				existeix = true;
			}
		}
		if (existeix) {
			Obra[] nouArrayObres = new Obra[obras.length - 1];
			int indexArrayAnterior = 0;
			for (int i = 0; i < nouArrayObres.length; i++) {
				if (obras[i].getNumeroInventario() == numInventario){
					indexArrayAnterior++;
				}
					nouArrayObres[i] = obras[indexArrayAnterior];
					indexArrayAnterior++;
			}
			obras = nouArrayObres;
			return true;
		}
		return false;
	}

	public Obra buscaObra(int numInventario) {
		for (int i = 0; i < obras.length; i++) {
			if (obras[i].getNumeroInventario() == numInventario) {
				return obras[i];
			}
		}
		return null;
	}

	public double totalSuperficie() {
		double superficie = 0;
		for (int i = 0; i < obras.length; i++) {
			if (obras[i] instanceof Pintura) {
				Pintura p1 = (Pintura) obras[i];
				superficie = superficie + p1.getAltura() * p1.getAncho();
			}
		}
		return superficie;
	}

	public int esculturaMasAlta() {
		double masalta = 0;
		int numInvmasalta = 0;
		for (int i = 0; i < obras.length; i++) {
			if (obras[i] instanceof Escultura) {
				Escultura e1 = (Escultura) obras[i];
				if (e1.getAltura() > masalta) {
					masalta = e1.getAltura();
					numInvmasalta = e1.getNumeroInventario();
				}
			}
		}
		return numInvmasalta;
	}

	public String toString() {
		String retornar = "";
		for (int i = 0; i < obras.length; i++) {
			retornar = retornar + obras[i];
		}
		return retornar;
	}
}
