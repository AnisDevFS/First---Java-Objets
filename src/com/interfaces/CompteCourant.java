package com.interfaces;

public class CompteCourant implements Compte {

	private String numCompte;
	private float solde;
	private float decouvert;

	public CompteCourant(String numCompte, float solde, float decouvert) {
		super();
		this.numCompte = numCompte;
		this.solde = solde;
		this.decouvert = decouvert;
	}

	public String getNumCompte() {
		return numCompte;
	}

	public void setNumCompte(String numCompte) {
		this.numCompte = numCompte;
	}

	public float getSolde() {
		return solde;
	}

	public void setSolde(float solde) {
		this.solde = solde;
	}

	public float getDecouvert() {
		return decouvert;
	}

	public void setDecouvert(float decouvert) {
		this.decouvert = decouvert;
	}

	@Override
	public void retirer(float montant) {
		if ((this.getSolde() + this.getDecouvert()) >= montant) {
			this.setSolde(this.getSolde() - montant);
		}
		else System.out.println("solde n'est pas suffisant");
	}

	@Override
	public String toString() {
		return "CompteCourant [numCompte=" + numCompte + ", solde=" + solde + ", decouvert=" + decouvert + "]";
	}

	@Override
	public void alimenter(float montant) {
		this.setSolde(this.getSolde() + montant);
	}

	@Override
	public void transferer(Compte dest, float montant) {
		if ((this.getSolde() + this.getDecouvert()) >= montant) {
			this.setSolde(this.getSolde() - montant);
			dest.alimenter(montant);
		}
		else System.out.println("solde n'est pas suffisant");
	}

}
