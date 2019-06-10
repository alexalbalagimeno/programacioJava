package iam.aalbala.m03.uf5.exempleserialitzable.model;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;


public class Programa {

	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {

		Professor p1;
		p1 = new Professor("Albert ", 38, 1500);
		p1.imprimir();
		
		Grup aula4 = new Grup();
		aula4.setTutor(p1);
		aula4.imprimir();
		System.out.println("Aprovats: " + aula4.numAprovats());
		
		ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("grupA1"));
		out.writeObject(aula4);
		out.close();

		Grup aula5;
		ObjectInputStream in = new ObjectInputStream(new FileInputStream("grupA1"));
		aula5 = (Grup) in.readObject();
		in.close();
		aula5.imprimir();
	}

}
