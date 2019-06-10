package iam.aalbala.m03.uf5.exemplejson;

import java.io.FileWriter;
import java.io.IOException;

import com.google.gson.stream.JsonWriter;

public class Prova2 {

	public static void main(String[] args) {

		try {
			JsonWriter writer = new JsonWriter(new FileWriter("alumne.json"));
			writer.beginObject();                    // afegeix   {
			writer.name("nom").value("Ola k ase");   // afegeix   "nom":"Ola k ase"
			writer.name("notes");                    // afegeix   ,"notes":
			writer.beginArray();                     // afegeix   [

			for (int i=0; i< 10; i++) {
				writer.value( 1+(int)(10*Math.random()) );    // afegeix   ,nota
			}

			writer.endArray();                       // afegeix   ] 
			writer.endObject();                      // afegeix   } 
			writer.close(); 
		} catch (IOException e) {
			System.out.println(e);
		}
		
	}

}
