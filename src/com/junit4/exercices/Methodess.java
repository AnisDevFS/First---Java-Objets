package com.junit4.exercices;

public class Methodess {
	
//	Ex1 Dans Methodess créer une méthode qui prend un tableau de String et 
//	qui affiche et qui retourne le string le plus long :
//		Tester cette méthode dans TestMethodess
	
	String plusLong (String[] tab) {
		
		String maxStr = tab[0];
		for (String string : tab) {
			if (string.length() > maxStr.length()) maxStr = string;
		}
		return maxStr;
	}
	
	
	
	
//	Ex 2 :dans Methodess créer une méthode qui utilise la méthode
//	de l’ex1 et donc qui prend au paramettre un tableau de string
//	et qui affiche true et qui retourne true si le plus long string 
//	dépasse 12 char	Tester cette méthode dans TestMethodess avec assertTrue()
	
	boolean maxSupA12(String[] tab) {
		
		if (plusLong(tab).length() > 12) return true;
		return false;
	}
	
	
	
	

	
//Ex3	créer une méthode qui prend un string au paramètre et qui retourne 
//	le premier char s’il est majuscule et ‘z’ si le premier char n’est pas
//	majuscule Tester à 2 reprises cette méthode avec les 2 cas
	
	
	char majOrZ(String str) {
		if ( Character.isUpperCase(str.charAt(0)) )
			return str.charAt(0);
		return 'z';
	}
	
	
	
	
	
	
	
	
	

}
