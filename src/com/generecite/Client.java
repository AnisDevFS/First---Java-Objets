package com.generecite;

import java.util.ArrayList;

public class Client<T> {
	
	private String prenom;
	private String email;
	private int age;
	private ArrayList<Compte> comptes;
	
	T foi2 (T objet) {
		return (T) (objet + "2") ;
	}
	
	String foi22 (T objet) {
		return objet + " foi2" ;
	}
	
	
	public Client() {
	}
	
	
	public Client(String prenom, String email, int age, ArrayList<Compte> comptes) {
		this.prenom = prenom;
		this.email = email;
		this.age = Math.abs(age);
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

	public ArrayList<Compte> getComptes() {
		return comptes;
	}
	public void setComptes(ArrayList<Compte> comptes) {
		this.comptes = comptes;
	}
	
	@Override
	public String toString() {
		return "Client [prenom=" + prenom + ", email=" + email + ", age=" + age + ", comptes="
				+ comptes + "]";
	}

	

	

}
