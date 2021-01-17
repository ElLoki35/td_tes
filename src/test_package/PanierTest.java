package test_package;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Before;
import org.junit.Test;

import td_tes.Orange;
import td_tes.Panier;

public class PanierTest {

	private ArrayList<Orange> listepanier1, listepanier2, listepanier3, listepanier4;
	private Panier p1, p2, p3, p4;
	
	@Before
	public void init() throws Exception {
		listepanier1 = new ArrayList<Orange>();
		listepanier2 = new ArrayList<Orange>();
		listepanier3 = new ArrayList<Orange>();
		listepanier4 = new ArrayList<Orange>();
		
		p1 = new Panier(listepanier1, 10);
		p2 = new Panier(listepanier2, 10);
		p3 = new Panier(listepanier3, 5);
		p4 = new Panier(listepanier4, 10);
		
		p1.ajoute(new Orange(0.80, "France"));
		p1.ajoute(new Orange(0.80, "Espagne"));
		p1.ajoute(new Orange(0.90, "Floride"));
		
		p2.ajoute(new Orange(0.80, "France"));
		p2.ajoute(new Orange(0.80, "Espagne"));
		p2.ajoute(new Orange(0.90, "Floride"));
		
		p3.ajoute(new Orange(0.80, "France"));
		p3.ajoute(new Orange(0.80, "Espagne"));
		
	}
	
	@Test
	public void test() {
		assertEquals(false,p1.estPlein()); // => equivalent à : assertFalse(p1.estPlein());
		assertEquals(true,p4.estVide()); // => equivalent à : assertTrue(p4.estVide());
		assertEquals(false,p1.equals(p3));
		assertEquals(true,p1.equals(p2));
		assertEquals(10,p1.getContenance());
		//assertTrue(1.60==p3.getPrix());
	}

}
