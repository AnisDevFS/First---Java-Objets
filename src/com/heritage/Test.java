package com.heritage;

public class Test {

	public static void main(String[] args) {

		CompteCourant cc = new CompteCourant("666", 300, "euro", 200);
		Compte cc1 =  new CompteCourant("666", 300, "euro", 200);
		Compte c =  new Compte("666", 300, "euro");
		CompteEpargne ce = new CompteEpargne("6666", 3000, "euro", 100000f, 1f);
		
		cc1.description();
		ce.description();
		c.description();
		System.out.println(cc.getDecouvert());
		afficheSolde(c);
		afficheSolde(ce);
		afficheSolde(cc1);
		
	}
	
	public static void afficheSolde (Compte c) {
		System.out.println(c.getSolde());
	}

}
