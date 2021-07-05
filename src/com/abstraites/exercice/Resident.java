package com.abstraites.exercice;

public class Resident {

	private String nom;
	private String email;
	private int numChambre;

	public Resident(String nom, String email, int numChambre) {
		this.nom = nom;
		this.email = email;
		this.numChambre = numChambre;
	}

	public Resident() {
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getNumChambre() {
		return numChambre;
	}

	public void setNumChambre(int numChambre) {
		this.numChambre = numChambre;
	}

	@Override
	public String toString() {
		return "Resident [nom=" + nom + ", email=" + email + ", numChambre=" + numChambre + "]";
	}

}
