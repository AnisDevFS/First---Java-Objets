package com.ecomerce;

public class Produit {
	
	private String nom;
	private int quantite;
	private float prix;
	
	public Produit() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Produit(String nom, int quantite, float prix) {
		super();
		this.nom = nom;
		this.quantite = quantite;
		this.prix = prix;
	}
	
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public int getQuantite() {
		return quantite;
	}
	public void setQuantite(int quantite) {
		this.quantite = quantite;
	}
	public float getPrix() {
		return prix;
	}
	public void setPrix(float prix) {
		this.prix = prix;
	}
	@Override
	public String toString() {
		return "Produit [nom=" + nom + ", quantite=" + quantite + ", prix=" + prix + "]";
	}
	
	

}
