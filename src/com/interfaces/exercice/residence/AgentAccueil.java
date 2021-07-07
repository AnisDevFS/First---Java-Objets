package com.interfaces.exercice.residence;

public class AgentAccueil implements Employe {
	
	public AgentAccueil(String nom) {
		super();
		this.nom = nom;
	}

	private String nom;

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}
	
	public void affecterChambre(Resident resident, int numChambre) {
		resident.setNumChambre(numChambre);
	}

}
