package com.serialisation;

import java.io.Serializable;

public class User implements Serializable {

	private String nom;
	private transient String email;
	private int age;

	public User(String nom, String email, int age) {
		super();
		this.nom = nom;
		this.email = email;
		this.age = age;
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



	@Override
	public String toString() {
		return "User [nom=" + nom + ", email=" + email + ", age=" + age + "]";
	}
	

	

}
