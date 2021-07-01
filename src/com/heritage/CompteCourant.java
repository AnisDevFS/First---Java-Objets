package com.heritage;

public class CompteCourant extends Compte {
	
	private float decouvert;

	public CompteCourant() {
	}

	public CompteCourant(String numeroCompte, float solde, String devise , float decouvert) {
		super(numeroCompte, solde, devise);
		this.decouvert = decouvert;
	}

	public float getDecouvert() {
		return decouvert;
	}

	public void setDecouvert(float decouvert) {
		this.decouvert = decouvert;
	}

	public void description() {
		System.out.println("Compte [numeroCompte=" + this.numeroCompte +
				", solde=" + this.solde +
				", découvert=" + this.decouvert +"]");
	}
	
	
	
	
//	Ex 3 : Dans le cadre d'un compte courant si j'envoie de l'argent un compte d'épargne je dois
//	tester son plafond et la solvabilité composée par le solde et le découvert
	public void virerArgent(Compte dest, float montant) {
		
		boolean plafondOk = true;

		if (dest instanceof CompteEpargne) {
			
			if ((dest.getSolde() + montant) > ((CompteEpargne)dest).getPlafond()) {
				 plafondOk = false;
			}
		}
		
		if ((this.solde + this.decouvert) >= montant && plafondOk) {
			
			this.transferer(dest, montant);
		}
	}
	
	
	
	
	
	
	
	
	
	
	

}
