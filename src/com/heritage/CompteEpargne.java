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
	
	
	
//	Ex 2 : Dons le cas d'un compte d'épargne si j'envoie de l'argent à un autre compte 
//	d'épargne je dois tester son plafond
	
	public void virerArgent(Compte dest, float montant) {
		
		boolean plafondOk = true;
		
		if (dest.getClass().getName().equals("com.heritage.CompteEpargne")) {
	//	if (dest.getClass().equals(this.getClass())) {
	//	if (dest instanceof CompteEpargne) {
			
			if ((dest.getSolde() + montant) > ((CompteEpargne)dest).getPlafond()) {
				 plafondOk = false;
			}
		}
		
		if (this.solde >= montant && plafondOk) {
			
			this.transferer(dest, montant);
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
