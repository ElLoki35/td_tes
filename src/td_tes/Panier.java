package td_tes;

import java.util.ArrayList;
import java.util.List;

public class Panier {
	private ArrayList<Orange> listepanier;
	private int contenance;
	// arralylist: les oranges à ajouter dans le panier ; contenannce est la capcité maximale du panier
	public Panier(ArrayList<Orange> panier, int contenance) {
		this.listepanier=panier;
		this.contenance = contenance;
	}
	
	public boolean estPlein() {
		//panier.size = nombre d'oranges dans la liste listepanier ( dans le panier)
		//c'est plein si ce nombre est égal a la capacité maximale du panier.
		if(contenance==listepanier.size()) {
			return true;
		}
		return false;
	}
	
	public boolean estVide() {
		if(listepanier.isEmpty()) {
			return true;
		}
		return false;
	}
	
	
	public int getContenance() {
		return contenance;
	}

	void setContenance(int contenance) {
		this.contenance = contenance;
	}

	@Override
	public String toString() {
		String s="";
		//listepanier.get(i) qui est l'orange i
		for(int i=0;i<listepanier.size();i++) {
			s+="Element "+i+" : "+listepanier.get(i)+"\n";
		}
		return s;
	}

	public boolean equals(Panier p) {
		boolean test=false;
		// si les 2 paniers sont de tailles différents ==> ils sont différents
		//p : panier / p.listepanier : arraylist des oranges dans le panier p // p.listepanier.size est la taille du panier p
		if(p.listepanier.size()!=this.listepanier.size()) {
			return false;
		}
		//fin du test de la taille des paniers ///
		// je parcours toutes les oranges du panier p : p.listepanier
		for (Orange o: p.listepanier) { // p(0) =====> p(sizepa -1)
			test=false;
			//je parcours toutes les oranges du panier actuel : this.listepanier
			for(Orange o2 : this.listepanier) { // actuel(0) ========> actuel (sizeac-1)
				//tester si p(i) [fixé avec la première boucle] existe dans le panier actuel 
				//sous un indice quelconque entre 0 et sizeac-1
				if(o.equals(o2)) { // si l'orange courante de ***P*** existe dans le panier actuel
					//l'orange existe dans le panier et on remet test à true ==> élément trouvé
					test=true;
					// plus besoin de continuer dans la boucle actuelle
					break;
				}
			}
			//si test=false ===> p(i) introuvable dans le panier actuel ==> return false : paniers diférents
		if(!test)
			return false;
		}
		//test est toujours évaluée à true ===> les 2 paniers sont égaux 
		return true;
	}
	
	public Panier boycotteOrigine(String origine) {
		for(int i=0;i<listepanier.size();i++) {
			if(listepanier.get(i).getOrigine()==origine)
				listepanier.remove(i);
		}
		return this;
	}
	//supprimer le dernier élméent (dernière orange)
	public void retire() {
		//si lpanie n'est pas vide //
		//supprime le dernier élement : listepanier.size() -1 //
		if (!this.estVide()) // === this.estvide==false 
		{
			listepanier.remove(listepanier.size()- 1);
		}
	}
	
	
	//ajouter une orange
	public void ajoute(Orange o) {
		if (!this.estPlein())
			listepanier.add(o);
		}
	
	// Cration de la méthode qui permet d'obtenir le prix de la totalité du contenu
		// du panier
		public int getPrix() {
			// Initialisation d'une variable prix à 0€ qui être incrémenter suivant le prix
			// des oranges présentes
			int prix = 0;
			// Création d'une boucle for each qui va balayer toutes les oranges du panier
			for (Orange orange : listepanier)
				// Le prix de chaque orange est additionné jusqu'à la fin de la boucle
				prix += orange.getPrix();
			// On retourne le prix total du panier
			return prix;
		}
}
	

