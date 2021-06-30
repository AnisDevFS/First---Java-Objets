package com.ecomerce;

import java.util.ArrayList;

public class DBCmd {
	
	public static ArrayList<Commande> listeCommandes = new ArrayList<Commande>();
	
	public static String toStringg() {
			
		String s = "[";
		for (Commande commande : listeCommandes) {
			s = s + commande.toString() + " - ";
		}
		s = s + "]";
		return s;
	}

}
