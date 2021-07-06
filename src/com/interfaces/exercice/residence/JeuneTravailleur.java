package com.interfaces.exercice.residence;

public class JeuneTravailleur implements Resident {
	
	private String nom;
	private int numChambre;

	public JeuneTravailleur(String nom, int numChambre) {
		super();
		this.nom = nom;
		this.numChambre = numChambre;
	}

	public JeuneTravailleur() {
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
	
	void travaillerCommerce() {
		System.out.println("JeuneTravailleur travaille dans le commerce");
	}

	@Override
	public void louerChambre(int numChambre) {
		this.setNumChambre(numChambre);
	}

	@Override
	public void payerLoyer(float loyer) {
		System.out.println("JeuneTravailleur j'ai payé "+ loyer);
	}

}
