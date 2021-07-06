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

	@Override
	public void declarerHTravail(int nombreHeures) {
		System.out.println("Administratif je déclare " + nombreHeures +
				" heures de travail");
	}

	@Override
	public void negocierContrat() {
		System.out.println("Administratif négocie son contrat");
	}

	@Override
	public void donnerAvertissement(Resident resident) {
		
		System.out.println("Administratif donne avertissement vers" +
				resident.getNom());
	}
	
	void verserSalaire(Employe emp , float salaire) {
		
		System.out.println("Je suis administratif et je verse un salaire de "+
		salaire + " à l'employé " + emp.getNom());
	}

}
