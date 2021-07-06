package com.interfaces.todoList;

import java.util.ArrayList;

public class Test {

	public static void main(String[] args) {
		
		Tache laitT = new Tache(1, "acheter lait");
		Tache painT = new Tache(2, "acheter pain");
		ArrayList<Tache> courses = new ArrayList<Tache>();
		courses.add(painT); courses.add(laitT); 
		
		Tache BdDT = new Tache(1, "Créer la DB");
		Tache conceptionT = new Tache(2, "Créer le diagramme de classes");
		ArrayList<Tache> etapesProjet = new ArrayList<Tache>();
		etapesProjet.add(conceptionT); etapesProjet.add(BdDT);
		
		Enveloppant FaireCourses = new Dossier(1, "Courses", courses);
		Enveloppant projet = new Projet(11, "Projet TODOLIST", etapesProjet);
		
		ArrayList<Enveloppant> listeEnvJack = new ArrayList<Enveloppant>();
		listeEnvJack.add(projet);   listeEnvJack.add(FaireCourses); 
			
		User user = new User(9, "Jack", "jacj@pop.fr", listeEnvJack);
		
		Tache tacheAAjouter = new Tache(3, "acheter des legumes");
		
		System.out.println(projet);
		projet.ajouterTache("Créer le frontend");
		System.out.println(projet);
		
		System.out.println(user.getEnveloppants());
//		user.ajouterEnv();
		System.out.println(user.getEnveloppants());
		
		System.out.println("----------------");
		System.out.println(projet);
		user.ajouterTache(11, tacheAAjouter);
		System.out.println(projet);

	}

}
