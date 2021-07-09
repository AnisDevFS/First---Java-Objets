package com.junit4;

import org.junit.Test;

import junit.framework.TestCase;

public class AtesterTest extends TestCase{
	
	@Test
	public void testSomme() {
		assertEquals(8, Atester.somme(5, 3));
	}
	
	@Test
	public void testNegatif() {
		assertTrue(Atester.negatif(-5));
	}
	
	@Test
	public void testMax() {
		int[] tab = { -3 , 9 , 123}; 
		assertEquals(9, Atester.max(tab));
	}

}
