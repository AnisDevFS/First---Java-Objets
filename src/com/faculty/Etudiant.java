package com.faculty;

public class Etudiant extends Personne {

	private String numeroEtudiant;

	public Etudiant(String nom, String email, int age, String numeroEtudiant) {
		super(nom, email, age);
		this.numeroEtudiant = numeroEtudiant;
	}

	public Etudiant() {
		super();
		// TODO Auto-generated constructor stub
	}


	public String getNumeroEtudiant() {
		return numeroEtudiant;
	}

	public void setNumeroEtudiant(String numeroEtudiant) {
		this.numeroEtudiant = numeroEtudiant;
	}
	
	@Override
	public String toString() {
		return "Prof [numeroEtudiant=" + numeroEtudiant + ", nom=" + nom + ", email=" + email + ", age=" + age + "]";
	}
	
	
	public void desciption () {
		super.desciption();
		System.out.println( " et mon num étudiant = "
							+ this.getNumeroEtudiant());
	}

}
