package com.abstraites.exercice;

public abstract class Employe {
	


	protected String nom;
	
	public Employe(String nom) {
		super();
		this.nom = nom;
	}
	
	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	protected void declarerHTravail(int nombreH) {
		System.out.println("Je déclare " + nombreH + " heures de travail");
	}
	
	protected void donnerAvertissement(Resident resident) {
		
		System.out.println(resident.getNom() + " a eu un avertissement");
	}
	
	abstract void negocierContrat();
	
	abstract void demanderConge(int nombreJour);

}
