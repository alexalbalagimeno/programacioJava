package iam.aalbala.m03.uf5.ex4.part3;

import java.util.List;
import java.util.Scanner;
import java.util.Vector;

public class Test {

	public static void main(String[] args) {
		/*
		 * (3) Fent servir la classe Vector, creeu un programa en Java que donat un
		 * vector de 20 elements enters, el descompongui en dos, un format pels valors
		 * senars i un altre pels valors parells. Cal remarcar que en aquests dos
		 * vectors resultants els valors es posaran correlativament (un desprès de
		 * l’altre).
		 */
		Scanner input = new Scanner(System.in);
		int senar = 0;
		int parell = 10;
		Vector<Integer> v1 = new Vector<Integer>(20);
		for (int i = 0; i < v1.capacity(); i++) {
			v1.add(0);
		}
		for (int i = 0; i < v1.capacity(); i++) {
			System.out.print("Element " + (i + 1) + ": ");
			int numEnter = input.nextInt();
			if (numEnter % 2 != 0) {
				v1.set(senar, numEnter);
				senar++;
			} else {
				v1.set(parell, numEnter);
				parell++;
			}
		}
		List<Integer> vSenar = v1.subList(0, 9);
		List<Integer> vParell = v1.subList(10, 19);
		System.out.println(vSenar);
		System.out.println(vParell);
	}
}
