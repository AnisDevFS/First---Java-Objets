package com.ecomerce;

public class Compte {

	private String numero;
	private float solde;
	private String devise;
	private float decouvert;

	public Compte() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Compte(String numero, float solde, String devise, float decouvert) {
		super();
		this.numero = numero;
		this.solde = solde;
		this.devise = devise;
		this.decouvert = decouvert;
	}

	@Override
	public String toString() {
		return "Compte [numero=" + numero + ", solde=" + solde + ", devise=" + devise + ", decouvert=" + decouvert
				+ "]";
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
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

	public float getDecouvert() {
		return decouvert;
	}

	public void setDecouvert(float decouvert) {
		this.decouvert = decouvert;
	}

}
