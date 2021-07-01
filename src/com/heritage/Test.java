package com.heritage;

public class Test {

	public static void main(String[] args) {

		CompteCourant cc = new CompteCourant("666", 33300, "euro", 200);
		
		Compte cc1 =  new CompteCourant("666", 600, "euro", 200);
		Compte c =  new Compte("666", 600, "euro");
		CompteEpargne ce = new CompteEpargne("6666", 3000, "euro", 10000f, 1f);
		CompteEpargne cebis = new CompteEpargne("6666", 3000, "euro", 4000f, 1f);
		
//		cc1.description();
//		ce.description();
//		c.description();
//		System.out.println(cc.getDecouvert());
		afficheSolde(c);
		afficheSolde(cc);
		afficheSolde(ce);
		afficheSolde(cebis);
		
		ce.virerArgent(cebis, 2000);
		System.out.println("-----------------");
		
		afficheSolde(c);
		afficheSolde(cc);
		afficheSolde(ce);
		afficheSolde(cebis);
		
		
	}
	
	public static void afficheSolde (Compte c) {
		System.out.println(c.getSolde());
	}

}
