package iam.aalbala.m03.uf5.ex5;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.SortedSet;
import java.util.TreeSet;

public class UtilitzacioObjectes {

	public static void main(String[] args) {

		/*
		 * Serveix per a crear llistes sense ordre i amb claus diferents perquè no
		 * admet claus iguals però si valors iguals, permet una clau nula i valors nuls
		 * i no es pot sincronitzar. Per tant, es pot utilitzar sempre que treballem amb
		 * classes sense que utilitzin fils i amb claus diferents
		 */

		System.out.println("HashMap");

		HashMap<String, String> persones = new HashMap<String, String>();

		persones.put("11111111D", "Pere Garcia");
		persones.put("11111111B", "Pere Garcia");
		persones.put("11111111C", "Marta Salgado");

		System.out.println(persones.keySet());
		System.out.println(persones.values());

		/*
		 * Serveix per a crear llistes sense ordre i amb claus diferents. No admet claus
		 * iguals però si valors iguals, no permet claus nules ni valors nuls i es pot
		 * sincronitzar. Per tant, es pot utilitzar sempre que treballem amb classes
		 * sense que utilitzin fils i amb claus diferents. Exemple de inicials i nom de
		 * pa�s
		 */

		System.out.println("HashTable");

		Hashtable<String, String> paisos = new Hashtable<String, String>();

		paisos.put("IT", "It�lia");
		paisos.put("UK", "Regne Unit");
		paisos.put("US", "Estats Units");
		paisos.put("US", "Estats Units2");
		paisos.put("MX", "M�xic");

		System.out.println(paisos.keySet());
		System.out.println(paisos.values());
		
		System.out.println(paisos.get("MX"));
	

		/*
		 * No estan ordenats els objectes i no soporta valors duplicats. Permet valor
		 * nul. Utilitza add en comptes de put. S'utilitza com un conjunt i no com a
		 * tipus (clau,valor). S'utilitza quan vols una llista �nica d'objectes. No �s
		 * sincronitzat.
		 */

		System.out.println("HashSet");

		HashSet<String> set = new HashSet<String>();

		set.add("Ravi");
		set.add("Vijay");
		set.add("Ravi");
		set.add("Ajay");

		Iterator<String> itr = set.iterator();

		while (itr.hasNext()) {
			System.out.println(itr.next());
		}

		/*
		 * HashSet Cont� valors �nics com HashSet. Mant� ordre d'inserci�.
		 */

		System.out.println("LinkedHashSet");

		LinkedHashSet<String> linkedHashSetObject1 = new LinkedHashSet<String>();

		LinkedHashSet<Integer> linkedHashSetObject2 = new LinkedHashSet<Integer>();

		linkedHashSetObject1.add("I");

		linkedHashSetObject1.add("Love");

		linkedHashSetObject1.add("Java");

		linkedHashSetObject1.add("Java");

		linkedHashSetObject1.add("I");

		linkedHashSetObject2.add(9);

		linkedHashSetObject2.add(3);

		linkedHashSetObject2.add(4);

		linkedHashSetObject2.add(9);

		linkedHashSetObject2.add(5);

		linkedHashSetObject2.add(9);

		System.out.println("Values in Linked HashSet String object are:" + linkedHashSetObject1);

		System.out.println("Values in Linked HashSet Integer object are:" + linkedHashSetObject2);

		TreeSet<String> fruits = new TreeSet<>();
		
		/*
		 * TreeSet no permet elements duplicats. - Un TreeSet mant� la llista ordenada.
		 */
		fruits.add("Banana");
		fruits.add("Apple");
		fruits.add("Pineapple");
		fruits.add("Orange");
		fruits.add("Apple");

		System.out.println("Fruits: " + fruits);

		fruits.add("banana");
		System.out.println("After adding banana: " + fruits);

	}

}
