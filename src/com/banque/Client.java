package com.banque;

import java.util.ArrayList;

public class Client {
	
	private String prenom;
	private String email;
	private int age;
	private Carte carte;
	private ArrayList<Compte> comptes;
	
	
	public Client() {
	}
	
	
	public Client(String prenom, String email, int age, Carte carte, ArrayList<Compte> comptes) {
		this.prenom = prenom;
		this.email = email;
		this.age = Math.abs(age);
		this.carte = carte;
		this.comptes = comptes;
	}
	
	
	
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
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
	public Carte getCarte() {
		return carte;
	}
	public void setCarte(Carte carte) {
		this.carte = carte;
	}
	public ArrayList<Compte> getComptes() {
		return comptes;
	}
	public void setComptes(ArrayList<Compte> comptes) {
		this.comptes = comptes;
	}
	
	@Override
	public String toString() {
		return "Client [prenom=" + prenom + ", email=" + email + ", age=" + age + ", carte=" + carte + ", comptes="
				+ comptes + "]";
	}

	
	
	

}
