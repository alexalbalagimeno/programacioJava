package iam.aalbala.m03.uf5.ex2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import iam.aalbala.m03.uf5.ex2.Task1;

public class TestCheckedExceptions {

	public static void main(String[] args) {

		FileInputStream fis = null;
		System.out.println("Exemple primera excepcio quan intentes obrir un fitxer que no existeix: ");
		try {
			fis = new FileInputStream("C:/Ruta_fitxer_inexixtent/fitxer.txt");
		} catch (FileNotFoundException fnfe) {
			System.out.println("No existeix fitxer en aquesta ruta");
		}

		try {
			FileWriter writer = new FileWriter("fitxer.txt", true);
			writer.write("hola");
			writer.close();
		} catch (IOException e) {
			e.printStackTrace();
		}

		try {
			URL url = new URL("http://www.exemple.com");
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}

		String dateStr = "2011-11-19";
		DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
		Date date;
		try {
			date = dateFormat.parse(dateStr);
			System.out.println(date);
		} catch (ParseException e) {
			e.printStackTrace();
		}

		Task1 task1 = new Task1();
		Thread thread1 = new Thread(task1);
		System.out.println("Abans Start");
		thread1.start();
		
		System.out.println("En paralel");
		for (int i = 0; i < 10; ++i) {
			System.out.println("Han pasat " + i + " segon(s) test");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				System.err.println("Error: " + e.toString());
			}
		}
		
		
	}
}
