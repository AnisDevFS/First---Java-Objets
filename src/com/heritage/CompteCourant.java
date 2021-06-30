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

}
