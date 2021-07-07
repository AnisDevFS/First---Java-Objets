package com.generecite;

public class Compte<V, T> {


	private V numero;
	private float solde;
	private T devise;
	
	public Compte() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Compte(V numero, float solde, T devise) {
		super();
		this.numero = numero;
		this.solde = solde;
		this.devise = devise;
	}
	
	public V getNumero() {
		return numero;
	}
	public void setNumero(V numero) {
		this.numero = numero;
	}
	public float getSolde() {
		return solde;
	}
	public void setSolde(float solde) {
		this.solde = solde;
	}
	
	public T getDevise() {
		return devise;
	}
	public void setDevise(T devise) {
		this.devise = devise;
	}
	@Override
	public String toString() {
		return "Compte [numero=" + numero + ", solde=" + solde + ", devise=" + devise + "]";
	}
	
	

}
