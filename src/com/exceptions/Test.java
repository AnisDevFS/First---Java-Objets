package com.exceptions;

import java.io.IOException;

public class Test {

	public static void main(String[] args) throws  IOException { // IOExeption est controlée donc obligation de throws à l'entete
			
		int[] tab = { 1, 8, 9 , 6 , 9};
		
		afficheAge(9);
		
		try {
			System.out.println(tab[3]);
		}
		catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(e.toString());
		}
		finally {
			System.out.println("oui cest chiant mais ce code va toujours s'executer");
		}
		
		System.out.println("---------------");
		
		affiche5Int(tab);
		
		System.out.println("-----------");
		
		System.out.println(FIchier.typeOfFile("C://pop/index.html"));
		
		// encore dans le main
		System.out.println( convert("anis") );
		
		System.out.println("suite du programme");
	}
	
	
	
	// créer un méthode qui affiche les 5 premiers entiers d'un tableau 
	
	public static void affiche5Int(int[] tab) throws ArrayIndexOutOfBoundsException {
		
		for (int i = 0 ; i < 5; i++) {
			
			if (i == tab.length) {
				throw new ArrayIndexOutOfBoundsException();
			}
			
			System.out.println(tab[i]);
			
		}
	}
	
	
	
	
	// créer une méthode qui convertit les String en entier
	public static int convert (String str) throws NumberFormatException {
		
		try {
			return Integer.parseInt(str);
		}
		catch (NumberFormatException e) {
			System.out.println("Le String n'est pas un entier : NumberFormatException");
			return 0;
		}
		
	}
	
	
	
	// la fameuse age négatif
	public static void afficheAge ( int age ) throws NegatifAgeException {
		
		if (age < 0 ) throw new NegatifAgeException();
		System.out.println(age + " est bon");
	}
	
	
	
	
	

}
