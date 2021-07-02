package com.exception.exercices;


//Ex 1 Exception : 	Créer une exception qui s’appelle ArrayListTropPetitException 
//qui contient le message d’erreur adéquat et
// ArrayListTropPetitException est une exception non controlée (unchecked)
public class ArrayListTropPetitException extends RuntimeException {
	
	public ArrayListTropPetitException() {
		System.out.println("L'ArrayList est trop petit !");
	}

}
