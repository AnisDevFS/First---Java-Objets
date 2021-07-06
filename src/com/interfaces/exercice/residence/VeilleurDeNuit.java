package com.interfaces.exercice.residence;

public class VeilleurDeNuit implements Employe {
	
	public VeilleurDeNuit(String nom) {
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
		System.out.println("VeilleurDeNuit je déclare " + nombreHeures +
				" heures de travail");
	}

	@Override
	public void negocierContrat() {
		System.out.println("VeilleurDeNuit négocie son contrat");
	}

	
	@Override
	public void donnerAvertissement(Resident resident) {
		
		System.out.println("VeilleurDeNuit donne avertissement vers" +
				resident.getNom());
	}
	
	void faireTour () {
		System.out.println("VeilleurDeNuit fait un tour");
	}

	
}
