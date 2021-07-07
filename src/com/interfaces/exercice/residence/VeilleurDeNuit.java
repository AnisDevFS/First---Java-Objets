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

	void faireTour () {
		System.out.println("VeilleurDeNuit fait un tour");
	}

	
}
