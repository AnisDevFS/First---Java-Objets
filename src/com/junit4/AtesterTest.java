package com.junit4;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class AtesterTest {
	
	static Atester at;
	
	@Before
	public 	void setUp() {
		System.out.println("l'objet at de type Atester initialisé");
		at = new Atester();
	}
	
	@BeforeClass
	public static void debut() {
		System.out.println("debut de test");
	}
	
	@AfterClass
	public static void fin() {
		System.out.println("fin de test");
	}
	
	@Test
	public void testSomme() {
		assertEquals(8, at.somme(5, 3));
	}
	
	@Test
	public void testNegatif() {
		assertTrue(at.negatif(-5));
	}
	

	@Test
	public void testMax() {
		int[] tab = { -3 , 9 , 123}; 
		assertEquals(123, at.max(tab));
	}
	
	@After
	public void nettoyer() throws Exception {
	System.out.println("l'objet at de type Atester détruit");
	at = null;
	}

}
