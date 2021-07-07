package com.serialisation.exercice;

import java.io.Serializable;
import java.util.ArrayList;

public class User implements Serializable {

	private String nom;
	private String email;
	private int age;
	private transient String password; // ne devrait pas etre sérialisé
	private ArrayList<Commande> commandes;

	@Override
	public String toString() {
		return "User [nom=" + nom + ", email=" + email + ", age=" + age + ", password=" + password + ", commandes="
				+ commandes + "]";
	}

	public ArrayList<Commande> getCommandes() {
		return commandes;
	}

	public void setCommandes(ArrayList<Commande> commandes) {
		this.commandes = commandes;
	}

	public User(String nom, String email, int age, String password, ArrayList<Commande> commandes) {
		this.nom = nom;
		this.email = email;
		this.age = age;
		this.password = password;
		this.commandes = commandes;
	}

	public User() {
		super();
		// TODO Auto-generated constructor stub
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

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}
