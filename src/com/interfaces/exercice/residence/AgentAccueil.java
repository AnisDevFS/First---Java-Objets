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

	@Override
	public void declarerHTravail(int nombreHeures) {
		System.out.println("AgentAccueil je déclare " + nombreHeures +
				" heures de travail");
	}

	@Override
	public void negocierContrat() {
		System.out.println("AgentAccueil négocie son contrat");
	}
	
	@Override
	public void donnerAvertissement(Resident resident) {
		
		System.out.println("AgentAccueil donne avertissement vers" +
				resident.getNom());
	}
	
	public void affecterChambre(Resident resident, int numChambre) {
		resident.setNumChambre(numChambre);
	}

}
