package com.heritage;

public class Compte {
	
	protected String numeroCompte;
	protected float solde;
	protected String devise;
	
	public Compte() {
	}
	public Compte(String numeroCompte, float solde, String devise) {
		super();
		this.numeroCompte = numeroCompte;
		this.solde = solde;
		this.devise = devise;
	}
	

	public String getNumeroCompte() {
		return numeroCompte;
	}
	public void setNumeroCompte(String numeroCompte) {
		this.numeroCompte = numeroCompte;
	}
	public float getSolde() {
		return solde;
	}
	public void setSolde(float solde) {
		this.solde = solde;
	}
	public String getDevise() {
		return devise;
	}
	public void setDevise(String devise) {
		this.devise = devise;
	}
	
	@Override
	public String toString() {
		return "Compte [numeroCompte=" + numeroCompte + ", solde=" + solde + ", devise=" + devise + "]";
	}
	
	public void description() {
		System.out.println("Compte [numeroCompte=" + this.numeroCompte +
				", solde=" + this.solde + "]");
	}
	
	public void transferer (Compte destinataire, float montant) {
		this.solde -= montant;
		destinataire.setSolde(destinataire.getSolde() + montant);
	}
	
	

	
	
//	Ex 1 : Pour la m�thode virer argent donc content je ne peux pas accepter les virements d'un montant
//	inf�rieur � 500� et je consid�re que je n'ai pas de d�couvert (pas de conditions suppl�mentaires m�me 
//	si j�envoie vers un compte d��pargne)	
	public void virerArgent(Compte dest, float montant) {
		if (this.solde >= montant && montant >= 500) {
			
			this.transferer(dest, montant);
		}
	}
	
	
	
	

}
