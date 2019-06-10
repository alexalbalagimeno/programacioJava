package iam.aalbala.m03.uf4.ex10;

public class Item {
	String referencia;
	String titol;

	public Item(String referencia, String titol) {
		this.referencia = referencia;
		this.titol = titol;
	}

	public String getReferencia() {
		return referencia;
	}

	public void setReferencia(String referencia) {
		this.referencia = referencia;
	}

	public String getTitol() {
		return titol;
	}

	public void setTitol(String titol) {
		this.titol = titol;
	}

	public boolean equals(Object obj) {
		if (obj instanceof Item) {
			Item i = (Item) obj;
			if (i.getReferencia().compareTo(this.getReferencia()) == 0)
				return true;

		}
		return false;
	}

	public String toString() {
		return "\nReferencia: " + referencia + "\nTitol: " + titol;
	}
}
