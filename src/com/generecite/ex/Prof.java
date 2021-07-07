package com.generecite.ex;

import java.util.ArrayList;

public class Prof<T> {

	private String nom;
	private String email;
	private int age;
	private T matieres;

	public Prof(String nom, String email, int age, T matieres) {
		super();
		this.nom = nom;
		this.email = email;
		this.age = age;
		this.matieres = matieres;
	}

	public Prof() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Prof [nom=" + nom + ", email=" + email + ", age=" + age + ", matieres=" + matieres + "]";
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

	public T getMatieres() {
		return matieres;
	}

	public void setMatieres(T matieres) {
		this.matieres = matieres;
	}
	
	
	
	void decrireMatieres() {
		System.out.println("Je suis " + this.getNom() + " et j'enseigne : ");
		
		if (this.getMatieres().getClass().getSimpleName().equals("ArrayList")) 
		{
			for (String matiere : (ArrayList<String>) this.getMatieres()) {
				System.out.println(matiere);
			}
		}
		else if ( this.getMatieres() instanceof String) 
		{
			System.out.println(this.getMatieres());
		}
		
	}
	
	
	
	
	
	

}
