package com.first;

public class Voiture {
	
	private String marque;
	private String couleur;
	private int vitesse;
	private float prix;
	static int nombreVoiture = 0;

	
	
	public String getMarque() {
		return marque;
	}


	public void setMarque(String marque) {
		this.marque = marque;
	}


	public String getCouleur() {
		return couleur;
	}


	public void setCouleur(String couleur) {
		this.couleur = couleur;
	}


	public int getVitesse() {
		return vitesse;
	}


	public void setVitesse(int vitesse) {
		this.vitesse = vitesse;
	}


	public float getPrix() {
		return prix;
	}


	public void setPrix(float prix) {
		this.prix = prix;
	}


	public Voiture(String marque, String couleur, int vitesse, float prix) {
		this.nombreVoiture ++ ;
		System.out.println("voiture crée numéro" + this.nombreVoiture );
		this.marque = marque;
		this.couleur = couleur;
		this.vitesse = vitesse;
		this.prix = prix;
	}


	@Override
	public String toString() {
		return "Voiture [marque=" + marque + ", couleur=" + couleur + ", vitesse=" + vitesse + ", prix=" + prix + "]";
	}


	public Voiture() {
	}
	
	

}
