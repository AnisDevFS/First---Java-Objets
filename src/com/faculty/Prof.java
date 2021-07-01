package com.faculty;

import java.util.ArrayList;

public class Prof extends Personne {

	private float salaire;
	private ArrayList<String> matieres;

	public Prof(String nom, String email, int age, float salaire, ArrayList<String> matieres) {
		super(nom, email, age);
		this.salaire = salaire;
		this.matieres = matieres;
	}

	public Prof() {
		super();
		// TODO Auto-generated constructor stub
	}

	public float getSalaire() {
		return salaire;
	}

	public void setSalaire(float salaire) {
		this.salaire = salaire;
	}

	public ArrayList<String> getMatieres() {
		return matieres;
	}

	public void setMatieres(ArrayList<String> matieres) {
		this.matieres = matieres;
	}

	@Override
	public String toString() {
		return "Prof [salaire=" + salaire + ", matieres=" + matieres + "]";
	}
	
	
	public void desciption () {
		super.desciption();
		System.out.print( " et j'enseigne : \n");
		for (String s : this.matieres) {
			System.out.println(s);
		}
	}

}
