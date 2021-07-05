package com.interfaces;

import java.util.ArrayList;

public class User {

	private String nom;
	private String email;
	private String age;
	private ArrayList<Compte> comptes;

	public User(String nom, String email, String age, ArrayList<Compte> comptes) {
		super();
		this.nom = nom;
		this.email = email;
		this.age = age;
		this.comptes = comptes;
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

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public ArrayList<Compte> getComptes() {
		return comptes;
	}

	public void setComptes(ArrayList<Compte> comptes) {
		this.comptes = comptes;
	}

	@Override
	public String toString() {
		return "User [nom=" + nom + ", email=" + email + ", age=" + age + ", comptes=" + comptes + "]";
	}
	
	public void envoyerArgent (Compte emetteur, Compte dest, float montant) {
		// on ne va pas tester si le compte emetteur est à lui ou pas 
		emetteur.transferer(dest, montant);
	}
	

}
