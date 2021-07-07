package com.interfaces.exercice.residence;

public interface Employe {
	
	static void negocierContrat() {
		System.out.println("Je suis EMploy� et je n�gocie mon contrat");
	}
	
	default void declarerHTravail(int nombreHeures) {
		System.out.println(this.getClass().getSimpleName() +
				" je d�clare " + nombreHeures +
				" heures de travail");
	}
	

	default void donnerAvertissement(Resident resident) {
		
		System.out.println(this.getClass().getSimpleName() +
				" donne avertissement vers" +
				resident.getNom());
	}
	
	String getNom();

}
