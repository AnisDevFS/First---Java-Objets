package com.junit4;

public class Atester {
	
	public int somme(int a , int b) {
		return a + b;
	}
	
	public boolean negatif (int n) {
		if (n < 0) return true;
		return false;
	}
	
	public int max (int[] tab) {
		
		int max = tab[0];
		
		for (int i : tab) {
			if (i > max) max = i ;
		}
		return max; 
	}

}
