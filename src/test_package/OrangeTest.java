package test_package;

import static org.junit.Assert.*;

import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;
import td_tes.Orange;

public class OrangeTest {

	private Orange o1,o2,o3;
	
	
	@Before
	public void init() throws Exception {
		o1 = new Orange(0.80, "France");
		o2 = new Orange(0.90, "France");
		o3 = new Orange(0.80, "France");
	}

	@Test
	public void test() {
		assertTrue(o1.equals(o3));
		assertEquals("France",o1.getOrigine());
		assertEquals(o1.getOrigine(),o2.getOrigine());
		assertTrue(0.80==o1.getPrix());
		assertTrue(o1.getPrix()==o3.getPrix());
		//assertEquals(o1.getPrix(),o3.getPrix());
	}

}
