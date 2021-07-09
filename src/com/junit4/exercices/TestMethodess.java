package com.junit4.exercices;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class TestMethodess {
	
	static Methodess meth;
	@Before
	public void setUp() {
		meth = new Methodess();
		System.out.println("l'objet meth de Type Methodess initialisé");
	}
	
//	Ex 1:
//	Créer une méthode qui affiche « début de tests » au début des tests
	@BeforeClass
	public static void debut() {
		System.out.println("début des tests !");
	}
	
	
	
//	Créer une méthode qui affiche « fin de tests » à la fin de l’exécution des tests
	@AfterClass
	public static void fin() {
		System.out.println("fin des tests !");
	}
	
	
//	créer une méthode qui affiche « Test suivant » après chaque test
	@After
	public void suivant() {
		meth = null;
		System.out.println("l'objet meth de Type Methodess détruit");
	}
	
	
	
	// Ex 1
	@Test
	public void plusLongTest() {
		String[] tab = {"jouh" , "ommoujgoh", "a"};
		assertEquals("ommoujgoh", meth.plusLong(tab));
	}
	
	
	// Ex 2
	@Test
	public void maxSupA12Test() {
		String[] tab = {"jouh" , "ommouiyujthjgoh", "a"};
		assertTrue(meth.maxSupA12(tab));
	}
	
	
	
	
	
	// Ex 3
	@Test
	public void majOrZTestWhenFirstIsLower() {
		String s = "sdfghj";
		assertEquals('z' , meth.majOrZ(s));
	}
	
	@Test
	public void majOrZTestWhenFirstIsUpper() {
		String s = "Sdfghj";
		assertEquals('S' , meth.majOrZ(s));
	}
	
	// les tests de la méthode de l'ex 3 
	// quand la String au param est "" ou null ne fonctionneront pas
	// ce qui oblige le dév à gérer les cas de "" et null
	// et donc rendre la méthode plus optimale
	// l'un des interet du TDD

}
