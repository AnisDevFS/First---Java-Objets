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
		System.out.println("l'objet meth de Type Methodess initialis�");
	}
	
//	Ex 1:
//	Cr�er une m�thode qui affiche � d�but de tests � au d�but des tests
	@BeforeClass
	public static void debut() {
		System.out.println("d�but des tests !");
	}
	
	
	
//	Cr�er une m�thode qui affiche � fin de tests � � la fin de l�ex�cution des tests
	@AfterClass
	public static void fin() {
		System.out.println("fin des tests !");
	}
	
	
//	cr�er une m�thode qui affiche � Test suivant � apr�s chaque test
	@After
	public void suivant() {
		meth = null;
		System.out.println("l'objet meth de Type Methodess d�truit");
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
	
	// les tests de la m�thode de l'ex 3 
	// quand la String au param est "" ou null ne fonctionneront pas
	// ce qui oblige le d�v � g�rer les cas de "" et null
	// et donc rendre la m�thode plus optimale
	// l'un des interet du TDD

}
