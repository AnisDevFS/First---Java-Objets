package com.first;

import java.util.ArrayList;

public class Employe {
	
	private long id;
	private String nom;
	private String email;
	private int age ;
	private ArrayList<Voiture> voitures;
	private Trottinette trot ;
	
	
	public Employe(long id, String nom, String email,
			int age , ArrayList<Voiture> voitures ,
			Trottinette trot) {
		this.id = id;
		this.nom = nom;
		this.email = email;
		if (age < 0)
		this.age = age * -1;
		else this.age = age;
		this.voitures = voitures;
		this.trot = trot;
	}


	public ArrayList<Voiture> getVoitures() {
		return voitures;
	}


	public void setVoitures(ArrayList<Voiture> voitures) {
		this.voitures = voitures;
	}


	public Employe() {
	}


	public long getId() {
		return id;
	}


	public void setId(long id) {
		this.id = id;
	}


	public String getNom() {
		return nom;
	}


	public void setNom(String nom) {
		this.nom = nom;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}


	public Trottinette getTrot() {
		return trot;
	}


	public void setTrot(Trottinette trot) {
		this.trot = trot;
	}
	
	
	public void changerTrottinette(Trottinette trot) {
		this.setTrot(trot);
	}
	
	public void ajouterVoiture(Voiture v) {
		this.voitures.add(v);
	}

	
}
