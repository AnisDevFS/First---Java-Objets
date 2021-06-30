package com.ecomerce;

public class Commande {
	

	private Produit produit;
	private int quantiteAchetee;
	private float prixTotal;
	
	public Commande(Produit produit, int quantiteAchetee, float prixTotal) {
		super();
		this.produit = produit;
		this.quantiteAchetee = quantiteAchetee;
		this.prixTotal = prixTotal;
	}
	
	public Commande(Produit produit, int quantiteAchetee) {
		super();
		this.produit = produit;
		this.quantiteAchetee = quantiteAchetee;
		this.prixTotal = produit.getPrix() * quantiteAchetee;
	}
	public Commande() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Produit getProduit() {
		return produit;
	}
	public void setProduit(Produit produit) {
		this.produit = produit;
	}
	public int getQuantiteAchetee() {
		return quantiteAchetee;
	}
	public void setQuantiteAchetee(int quantiteAchetee) {
		this.quantiteAchetee = quantiteAchetee;
	}
	public float getPrixTotal() {
		return prixTotal;
	}
	public void setPrixTotal(float prixTotal) {
		this.prixTotal = prixTotal;
	}
	@Override
	public String toString() {
		return "Commande [produit=" + produit + ", quantiteAchetee=" + quantiteAchetee + ", prixTotal=" + prixTotal
				+ "]";
	}
	

}
