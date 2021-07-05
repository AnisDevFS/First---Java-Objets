package com.abstraites.exercice;

public class AgentAccueil extends Employe {

	public AgentAccueil(String nom) {
		super(nom);
		// TODO Auto-generated constructor stub
	}

	@Override
	void negocierContrat() {
		System.out.println("Agent d'accueil négocie son contrat");
	}

	@Override
	void demanderConge(int nombreJour) {
		System.out.println("Agent d'accueil qui demande " +
				nombreJour + " jours de congé");
	}
	
	void affecterChambre (Resident resident , int numChambre) {
		resident.setNumChambre(numChambre);
	}

}
