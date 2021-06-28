package com.banque;

import java.util.ArrayList;

public class Test {

	public static void main(String[] args) {
		
		// Exercice 1   Tester les 3 classes dans une classe test
		
		Carte cart1 = new Carte(222, "666", "gold");
		ArrayList<Compte> comptesAnis = new ArrayList<Compte>();
		
		Compte c1 = new Compte("55228", 600, 200, "courant" , '$');
		Compte c2 = new Compte("48615", 3000, 0, "epargne", '$');
		comptesAnis.add(c2);comptesAnis.add(c1);
		
		Client anis = new Client("Anis", "anis@pop.fr", 30, cart1, comptesAnis);
		System.out.println(anis.getEmail());
		System.out.println(anis.getCarte().getType());
		
		
		System.out.print(c1.getSolde() + " - ");
		System.out.print(c2.getSolde() + "\n");
		
		Compte.transferer(c1, c2, 600, '€');
		
		System.out.print(c1.getSolde() + " - ");
		System.out.print(c2.getSolde() + "\n");
	}

}
