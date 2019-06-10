package iam.aalbala.m03.uf4.ex18;

import java.util.ArrayList;

public class TestBanc {

	public static void main(String[] args) {
		
		Client c1 = new Client("Alex", "Albala", "11111111A", 10, 3, 82, "Carrer A", "");
		Client c2 = new Client("Marta", "Ripoll", "11111111B", 22, 5, 85, "Carrer B", "");
		Client c3 = new Client("Toni", "Mas", "11111111C", 24, 6, 81, "Carrer C", "");
		Treballador t1 = new Treballador("Marc", "Marti", "22222222A", 10, 2, 91, "Carrer D", 1240, 10, 1,111);
		Treballador t2 = new Treballador("Mireia", "Blas", "22222222B", 11, 4, 90, "Carrer E", 1150, 14, 2, 112);
		Treballador t3 = new Treballador("Felix", "Valls", "22222222C", 9, 1, 89, "Carrer F", 1300, 14, 2, 109);
		CompteCorrent cc1 = new CompteCorrent(c1, 1111, 150000, 1, 1, 101, 1, 1, 111);
		CompteCorrent cc2 = new CompteCorrent(c2, 2222, 75000, 2, 2, 102, 2, 2, 112);
		CompteCorrent cc3 = new CompteCorrent(c3, 3333, 25000, 3, 3, 103, 3, 3, 113);
		Prestec p1 = new Prestec(c1, cc1, 1000, 6);
		Prestec p2 = new Prestec(c2, cc2, 2000, 18);
		Prestec p3 = new Prestec(c3, cc3, 3000, 24);
		
		ArrayList<Client> clients = new ArrayList<Client>();

		ArrayList<Treballador> treballadors = new ArrayList<Treballador>();

		ArrayList<ProducteBancari> productesBancaris = new ArrayList<ProducteBancari>();
		
		Banc b1 = new Banc("LaCaixa", treballadors, clients, productesBancaris);
		
		b1.creaClient(c2);
		b1.creaClient(c1);
		b1.creaClient(c3);
		System.out.println("LLISTA CLIENTS:");
		for (int i = 0; i < clients.size(); i++) {
            Client e = clients.get(i);
            System.out.println(e);
        }
		System.out.println();
		b1.creaProducteBancari(cc1);
		b1.creaProducteBancari(cc2);
		b1.creaProducteBancari(cc3);
		cc1.ingressarDiners(20);
		cc1.retirarDiners(5);
		cc1.transferenciaCompteCorrent(cc3, 500);
		b1.llistaOrdenadaQuantDiners();
		System.out.println("LLISTA PRODUCTES:");
		for (int i = 0; i < productesBancaris.size(); i++) {
            ProducteBancari e = productesBancaris.get(i);
            System.out.println(e);
		}
		System.out.println();
		b1.creaProducteBancari(p1);
		b1.creaProducteBancari(p2);
		System.out.println("LLISTA PRODUCTES:");
		for (int i = 0; i < productesBancaris.size(); i++) {
            ProducteBancari e = productesBancaris.get(i);   
            System.out.println(e);
		}
		System.out.println();
		System.out.println(p1.getCuotaMensual());
		System.out.println(p2.getCuotaMensual());
		System.out.println(p1.getDataFiPrestec());
		System.out.println(p2.getDataFiPrestec());
		System.out.println(b1.llistaPrestecActiu());
		
		b1.creaTreballador(t1);
		b1.creaTreballador(t2);
		b1.creaTreballador(t3);
		System.out.println("LLISTA TREBALLADORS:");
		for (Treballador treballador : treballadors) {
            System.out.println(treballador);
        }

	}

}
