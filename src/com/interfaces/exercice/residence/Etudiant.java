package com.interfaces.exercice.residence;

public class Etudiant implements Resident {

	private String nom;
	private int numChambre;

	public Etudiant(String nom, int numChambre) {
		super();
		this.nom = nom;
		this.numChambre = numChambre;
	}

	public Etudiant() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public int getNumChambre() {
		return numChambre;
	}

	public void setNumChambre(int numChambre) {
		this.numChambre = numChambre;
	}
	
	void etudierFac() {
		System.out.println("Etudiant étudie à la faculté");
	}
	
	@Override
	public void louerChambre(int numChambre) {
		this.setNumChambre(numChambre);
	}

	@Override
	public void payerLoyer(float loyer) {
		System.out.println("Etudiant j'ai payé "+ loyer);
	}

}
