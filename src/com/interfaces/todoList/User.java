package com.interfaces.todoList;

import java.util.ArrayList;
import java.util.Scanner;

public class User {

	private long idUser;
	private String nom;
	private String email;
	private ArrayList<Enveloppant> enveloppants;

	public User() {
		super();
		// TODO Auto-generated constructor stub
	}

	public User(long idUser, String nom, String email, ArrayList<Enveloppant> enveloppants) {
		super();
		this.idUser = idUser;
		this.nom = nom;
		this.email = email;
		this.enveloppants = enveloppants;
	}

	public long getIdUser() {
		return idUser;
	}

	public void setIdUser(long idUser) {
		this.idUser = idUser;
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

	public ArrayList<Enveloppant> getEnveloppants() {
		return enveloppants;
	}

	public void setEnveloppants(ArrayList<Enveloppant> enveloppants) {
		this.enveloppants = enveloppants;
	}

	@Override
	public String toString() {
		return "User [idUser=" + idUser + ", nom=" + nom + ", email=" + email + ", enveloppants=" + enveloppants + "]";
	}
	
	
	// Créer une méthode  qui permet de rajouter un enveloppant et choisir son type (dossier ou projet)
	public void ajouterEnv() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Donne moi le type de l'ENveloppant soit dossier soit projet");
		String type = sc.nextLine();
		System.out.println("DOnne moi le nom :");
		String nomEnv = sc.nextLine();
		
		if (type.equals("dossier")) {
			ArrayList<Tache> taches = new ArrayList<Tache>();
			Dossier dossier = new Dossier(this.getEnveloppants().size()+1, nomEnv, taches);
			this.enveloppants.add(dossier);
		}
		else if (type.equals("projet")) {
			ArrayList<Tache> taches = new ArrayList<Tache>();
			Projet proj = new Projet(this.getEnveloppants().size()+1, nomEnv, taches);
			this.enveloppants.add(proj);
		} 
		else System.out.println("type erroné");
	}
	
	
	
//	une méthode qui permet d'ajouter une tache en prenant envloppant.
	public void ajouterTache(Enveloppant env , Tache tache) {

		env.ajouterTache(tache);
	}
	
	
	
	
	
	
	

//	une méthode qui permet d'ajouter une tache en prenant l'id du l'envloppant. (surcharge)
	public void ajouterTache(long idEnveloppant , Tache tache) {

		for (int i = 0 ; i < this.enveloppants.size() ; i++) {
			
			if (this.enveloppants.get(i).getId() == idEnveloppant) {
				this.enveloppants.get(i).ajouterTache(tache);
			}
		}
	}
	
	
	
	
	
	
	

	
	
	
	
	
	
	
	
	
	

}
