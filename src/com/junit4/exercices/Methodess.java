package com.junit4.exercices;

public class Methodess {
	
//	Ex1 Dans Methodess cr�er une m�thode qui prend un tableau de String et 
//	qui affiche et qui retourne le string le plus long :
//		Tester cette m�thode dans TestMethodess
	
	String plusLong (String[] tab) {
		
		String maxStr = tab[0];
		for (String string : tab) {
			if (string.length() > maxStr.length()) maxStr = string;
		}
		return maxStr;
	}
	
	
	
	
//	Ex 2 :dans Methodess cr�er une m�thode qui utilise la m�thode
//	de l�ex1 et donc qui prend au paramettre un tableau de string
//	et qui affiche true et qui retourne true si le plus long string 
//	d�passe 12 char	Tester cette m�thode dans TestMethodess avec assertTrue()
	
	boolean maxSupA12(String[] tab) {
		
		if (plusLong(tab).length() > 12) return true;
		return false;
	}
	
	
	
	

	
//Ex3	cr�er une m�thode qui prend un string au param�tre et qui retourne 
//	le premier char s�il est majuscule et �z� si le premier char n�est pas
//	majuscule Tester � 2 reprises cette m�thode avec les 2 cas
	
	
	char majOrZ(String str) {
		if ( Character.isUpperCase(str.charAt(0)) )
			return str.charAt(0);
		return 'z';
	}
	
	
	
	
	
	
	
	
	

}
