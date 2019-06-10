package iam.aalbala.m03.uf4.ex13;

public abstract class OrdenaVector {

	public static void directSort(Ordenable[] vect) {
		int i = 0;
		Ordenable aux;
		while (i < vect.length - 1) {
			int j = i + 1;
			while (j < vect.length) {
				if (vect[j].menorQue(vect[i])) {
					aux = vect[i];
					vect[i] = vect[j];
					vect[j] = aux;
				}
				j++;
			}
			i++;
		}
	}

	public static String imprimirArray(Imprimible[] vect) {

		String retorn = "";
		for (int i = 0; i < vect.length; i++) {
			retorn = retorn + vect[i].imprimir() + "\n";
		}
		return retorn;
	}
}
