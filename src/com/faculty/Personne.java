package com.faculty;

public class Personne {

	protected String nom;
	protected String email;
	protected int age;

	public Personne(String nom, String email, int age) {
		super();
		this.nom = nom;
		this.email = email;
		this.age = age;
	}

	public Personne() {
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

	@Override
	public String toString() {
		return "Personne [nom=" + nom + ", email=" + email + ", age=" + age + "]";
	}
	
	protected void desciption () {
		System.out.println("Je suis "+ this.getNom() + " et j'ai " + 
							this.getAge() + " ans");
	}
	

}
