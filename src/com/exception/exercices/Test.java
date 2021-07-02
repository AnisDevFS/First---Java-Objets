package com.exception.exercices;

import java.util.ArrayList;
import java.util.Arrays;

public class Test {
	
	
	public static void main(String[] args) throws NotANumberrException {
		
//		Ex 1 Exception : qui se lance si on n’arrive pas à afficher 
//		le 4eme élément d’un ArrayList sans utiliser IndexOutOfBoundsException
//		Important je ne dois pas être obligé de mettre un throws à l’entête de la méthode 
//		qui risque cette exception Tester l’exception dans main()
		
		ArrayList<Integer> entiers = new ArrayList<Integer>();
		entiers.add(5); entiers.add(15); entiers.add(55);
		System.out.println(entiers);
		
		int index = 2;
		
		if (index >= entiers.size()) {
			throw new ArrayListTropPetitException();
		}
		
		System.out.println( entiers.get(index) );
		

		
		//Ex2 
		String[] chaines = {"30" , "50" , "anis"};
		
		System.out.println(Arrays.toString(convertirStrToInt(chaines)));
		
		
		
	}
	
	
	
	
//	Ex 2 Exception :  Créer une méthode qui prend en paramètre un tableau de String
//	et qui retourne un tableau d’entiers (les entiers sont les String convertis) 
//	Gérer dans la méthode l’exception du format Créer une exception qui s’appelle
//	NotANumberrException Qui affiche un message d’erreur « contenu pas adéquat le 
//	mauvais String est non convertible »
//	Important je dois être obligé de mettre un throws à l’entête de la méthode qui 
//	risque cette exception
	
	public static int[] convertirStrToInt(String[] tabStr) throws NotANumberrException {
		
		int[] tabInt = new int[tabStr.length];
		
		for (int i = 0 ; i < tabStr.length; i++) {
			try {
				tabInt[i] = Integer.parseInt(tabStr[i]); 
			}
			catch (NumberFormatException e) {
				throw new NotANumberrException();
			}
		}
		
		// On peut utiliser isNumeric ou isDigit
		
		return tabInt;
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	



}
