package com.heritage;

public class CompteEpargne extends Compte {

	private float plafond;
	private float tauxInteret;
	
	public CompteEpargne() {
		super();
	}

	public CompteEpargne(String numeroCompte, float solde, String devise, float plafond, float tauxInteret) {
		super(numeroCompte, solde, devise);
		this.plafond = plafond;
		this.tauxInteret = tauxInteret;
	}


	@Override
	public String toString() {
		return "CompteEpargne [plafond=" + plafond + ", tauxInteret=" + tauxInteret + "]";
	}

	public float getPlafond() {
		return plafond;
	}

	public void setPlafond(float plafond) {
		this.plafond = plafond;
	}

	public float getTauxInteret() {
		return tauxInteret;
	}

	public void setTauxInteret(float tauxInteret) {
		this.tauxInteret = tauxInteret;
	}
	
	public void description() {
		super.description();
		System.out.println(", taux=" + this.tauxInteret +
		", plafond=" + this.plafond +"]");
	}

}
