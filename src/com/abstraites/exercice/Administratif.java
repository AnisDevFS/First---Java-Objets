package com.abstraites.exercice;

public class Administratif extends Employe {

	public Administratif(String nom) {
		super(nom);
		// TODO Auto-generated constructor stub
	}

	@Override
	void negocierContrat() {
		System.out.println("Administratif n�gocie son contrat");
	}

	@Override
	void demanderConge(int nombreJour) {
		System.out.println("Administratif qui demande " +
				nombreJour + " jours de cong�");
	}
	
	void verserSalaire(Employe emp , float salaire) {
		
		System.out.println("Je suis administratif et je verse un salaire de "+
		salaire + " � l'employ� " + emp.getNom());
	}

}
