package com.interfaces;

public class CompteEpargne implements Compte {

	private String numCompte;
	private float solde;
	private float plafond;

	public CompteEpargne(String numCompte, float solde, float plafond) {
		super();
		this.numCompte = numCompte;
		this.solde = solde;
		this.plafond = plafond;
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

	public float getPlafond() {
		return plafond;
	}

	public void setPlafond(float plafond) {
		this.plafond = plafond;
	}

	@Override
	public void retirer(float montant) {
		if (this.getSolde() >= montant) {
			this.setSolde(this.getSolde() - montant);
		}
		else System.out.println("solde n'est pas suffisant");
	}

	@Override
	public void alimenter(float montant) {
		if ((this.getSolde() + montant) > this.getPlafond()) {
			System.out.println("le plafond est atteint");
		}
		else
		this.setSolde(this.getSolde() + montant);
		
	}

	@Override
	public String toString() {
		return "CompteEpargne [numCompte=" + numCompte + ", solde=" + solde + ", plafond=" + plafond + "]";
	}

	@Override
	public void transferer(Compte dest, float montant) {
		if (dest instanceof CompteEpargne) {
			if ((this.getSolde()  <= montant) || ((this.getSolde() + montant) > this.getPlafond())) {
				System.out.println("solde n'est pas suffisant"
						+ "ou le plafond est atteint");
			}
			else {
				this.setSolde(this.getSolde() - montant);
				dest.alimenter(montant);
			}
		}
		else if (dest instanceof CompteCourant) {
				if (this.getSolde()  <= montant)  {
					System.out.println("solde n'est pas suffisant");
				}
				else {
					this.setSolde(this.getSolde() - montant);
					dest.alimenter(montant);
				}
			}
		}

	

}
