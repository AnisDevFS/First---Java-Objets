package com.exception.exercices;


//Ex 1 Exception : 	Cr�er une exception qui s�appelle ArrayListTropPetitException 
//qui contient le message d�erreur ad�quat et
// ArrayListTropPetitException est une exception non control�e (unchecked)
public class ArrayListTropPetitException extends RuntimeException {
	
	public ArrayListTropPetitException() {
		System.out.println("L'ArrayList est trop petit !");
	}

}
