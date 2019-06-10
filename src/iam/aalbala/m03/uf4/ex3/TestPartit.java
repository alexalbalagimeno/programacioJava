package iam.aalbala.m03.uf4.ex3;

public class TestPartit {

	public static void main(String[] args) {
		
		Partit p1 = new Partit("FC Barcelona", "Real Madrid");
		
		p1.marcaEquipLocal();
		p1.marcaEquipLocal();
		p1.marcaEquipVisitant();
		System.out.println(p1);
		System.out.println(p1.fi());
	}

}
