package iam.aalbala.m03.uf4.ex5;

public class Grup {

	String nom;
	Professor tutor;
	Estudiant[] alumnes;

	public Grup(String nom, Professor tutor, Estudiant[] alumnes) {
		this.nom = nom;
		this.tutor = tutor;
		this.alumnes = alumnes;
	}

	public int numAprovats() {
		int numAprovats = 0;
		for (int i = 0; i < alumnes.length; i++) {
			if (alumnes[i].getNota() >= 5) {
				numAprovats++;
			}
		}
		return numAprovats;
	}

	public Estudiant[] grupAprovats() {

		int numAprovats = numAprovats();
		Estudiant[] AlumnesAprovats = new Estudiant[numAprovats];
		int j = 0;
		for (int i = 0; i < alumnes.length; i++) {
			if (alumnes[i].getNota() >= 5) {
				AlumnesAprovats[j] = alumnes[i];
				j++;
			}
		}
		return AlumnesAprovats;
	}

	public Estudiant[] afegirAlumne(String nomAlumneAfegir, String dniAlumneAfegir) {
		Estudiant[] alumnesnous = new Estudiant[alumnes.length + 1];
		int i;
		for (i = 0; i < alumnes.length; i++) {
			alumnesnous[i] = new Estudiant(alumnes[i].getNom(), alumnes[i].getDni());
		}
		alumnesnous[i++] = new Estudiant(nomAlumneAfegir, dniAlumneAfegir);
		return alumnesnous;
	}

	public Estudiant[] borrarAlumne(String dniAlumneBorrar) {
		boolean borrat = false;
		int nouArrayAlumnes= 0;
		for (int i = 0; i < alumnes.length; i++) {
			if (dniAlumneBorrar.equals(alumnes[i].getDni())) {
				borrat = true;
			}
		}
		if (borrat) {
			Estudiant[] alumnesnous = new Estudiant[alumnes.length - 1];
			for (int i = 0; i < alumnes.length; i++) {
				if (dniAlumneBorrar.equals(alumnes[i].getDni())) {
					i++;
				}
				alumnesnous[nouArrayAlumnes] = alumnes[i];
				nouArrayAlumnes++;
			}
			alumnes = alumnesnous;
			return alumnes;
		}
		return alumnes;
	}

	public String toString() {
		String retornar = "";

		for (int i = 0; i < alumnes.length; i++) {
			retornar = retornar + alumnes[i].toString() + "\n";
		}

		return "Grup: " + nom + "\nTutor: " + tutor.nom + "\nDni tutor: " + tutor.dni + "\n" + retornar;
	}
}
