package td_tes;

import java.util.ArrayList;

public class PanierMain {
	
			//p2.equals(p1)
			//this s'applique sur le p2 (this est optionnel) ==> listepanier
			//p1.listepanier fait référence au p.listepanier dans la méthode quals du panier

	public static void main(String[] args) {
		ArrayList<Orange> listepanier1 = new ArrayList<Orange>();
		ArrayList<Orange> listepanier2 = new ArrayList<Orange>();
		ArrayList<Orange> listepanier3 = new ArrayList<Orange>();
		ArrayList<Orange> listepanier4 = new ArrayList<Orange>();


		//Test des paniers identiques sans JUnit
	try {
		Panier p1 = new Panier(listepanier1,10);
		p1.ajoute(new Orange(0.80, "France"));
		p1.ajoute(new Orange(0.80, "Espagne"));
		p1.ajoute(new Orange(0.90, "Floride"));
		
		Panier p2 = new Panier(listepanier2,10);
		p2.ajoute(new Orange(0.80, "France"));
		p2.ajoute(new Orange(0.80, "Espagne"));
		p2.ajoute(new Orange(0.90, "Floride"));

		Panier p3 = new Panier(listepanier3,5);
		p3.ajoute(new Orange(0.80, "France"));
		p3.ajoute(new Orange(0.80, "Espagne"));
		
		Panier p4 = new Panier(listepanier4,10);
		p4.ajoute(new Orange(0.80, "France"));
		p4.ajoute(new Orange(0.80, "Espagne"));
		p4.ajoute(new Orange(0.90, "Miami"));
		
		System.out.println(p1.equals(p3));
		System.out.println(p1.equals(p2));
		System.out.println(p1.equals(p4));
		
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	}	

}

