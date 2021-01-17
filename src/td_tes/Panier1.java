package td_tes;

import java.util.ArrayList;

public class Panier1 {

	public static void main(String[] args) {

		//Test des différentes méthodes présentes dans la classe Panier
		ArrayList<Orange> panier = new ArrayList<Orange>();
		Panier p = new Panier(panier,10);
		try {
			p.ajoute(new Orange(0.80, "France"));
			p.ajoute(new Orange(0.80, "Espagne"));
			p.ajoute(new Orange(0.90, "Floride"));
			System.out.println("Contenance du panier\n"+p);
			p.retire();
			System.out.println("le dernier produit ajouté est retiré :\n"+p);
			p.boycotteOrigine("France");
			System.out.println("la panier en boycottant la France :\n"+p);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
