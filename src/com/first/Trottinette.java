package com.first;

public class Trottinette {
	
	private long id;
	private String couleur;
	private float prix;
	
	
	public Trottinette(long id, String couleur, float prix) {
		this.id = id;
		this.couleur = couleur;
		this.prix = prix;
	}

	

	public Trottinette() {
		super();
		// TODO Auto-generated constructor stub
	}



	@Override
	public String toString() {
		return "Trottinette ( id=" + id + ", couleur=" + couleur + ", prix=" + prix + " )";
	}



	public long getId() {
		return id;
	}



	public void setId(long id) {
		this.id = id;
	}



	public String getCouleur() {
		return couleur;
	}



	public void setCouleur(String couleur) {
		this.couleur = couleur;
	}



	public float getPrix() {
		return prix;
	}



	public void setPrix(float prix) {
		this.prix = prix;
	}
	
	public static void changerCouleurVoiture(Voiture voiture, String couleur) {
		voiture.setCouleur(couleur);
	}
	
	

}
