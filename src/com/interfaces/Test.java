package com.interfaces;

import java.util.ArrayList;

public class Test {

	public static void main(String[] args) {
		
		Compte cc = new CompteCourant("1235215", 1000, 200);
		Compte ce = new CompteEpargne("1564162", 6000, 10000);
		
		Compte cc1 = new CompteCourant("1235215", 1000, 200);
		Compte ce1 = new CompteEpargne("1564162", 600, 1000);
		
		ArrayList<Compte> list = new ArrayList<Compte>();
		list.add(ce); list.add(cc);
		
		User user = new User("Julien" , "julien@pop.fr", "25", list);
		
		System.out.println(cc); System.out.println(ce1); 
		user.envoyerArgent(cc, cc, 1000);
		System.out.println(cc); System.out.println(ce1);
		
		
		System.out.println( user.getComptes());
		
		for (Compte compte : user.getComptes()) {
			
			compte.retirer(5000);
			compte.alimenter(5000);
			compte.alimenter(5000);
		}
		
		System.out.println( user.getComptes());
		
		
	}

}
