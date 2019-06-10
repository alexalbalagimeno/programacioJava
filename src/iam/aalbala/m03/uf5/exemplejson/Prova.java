package iam.aalbala.m03.uf5.exemplejson;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class Prova {

	public static void main(String[] args) {

	Gson gson = new GsonBuilder().setPrettyPrinting().create(); 
	String s;
		
	double notes[] = { 0.6, 10, 9.8, 7.5, 4.3 };
	s = gson.toJson( notes ); 
	System.out.println( s ); 

	Persona p = new Persona("Ana", 30);
	s = gson.toJson( p );
	System.out.println( s );

	s = "{\"nom\":\"pepe\",\"edat\":25}";

	Persona p2;
	p2 = gson.fromJson(s, Persona.class);
	System.out.println( p2 );
	}

}
