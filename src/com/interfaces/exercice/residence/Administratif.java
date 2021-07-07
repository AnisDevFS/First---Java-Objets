package com.interfaces.exercice.residence;

public class Administratif implements Employe {
	
	public Administratif(String nom) {
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

	
	void verserSalaire(Employe emp , float salaire) {
		
		System.out.println("Je suis administratif et je verse un salaire de "+
		salaire + " à l'employé " + emp.getNom());
	}

}
