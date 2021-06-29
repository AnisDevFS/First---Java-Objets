package com.todoList;

import java.util.ArrayList;

public class Test {

	public static void main(String[] args) {
		
		Folder coursesF = new Folder(1, "courses", null);
		Folder projetF = new Folder(1, "Projet Ng", null);
		
		ArrayList<Folder> listFoldersOfAnis = new ArrayList<Folder>();
			
		User anis = new User("Anis", "anis@pop.fr", "0000", 30, listFoldersOfAnis);
		User alexis = new User("Alexis", "alex@pop.fr", "1234", 27, null);
		
		System.out.println(anis.login("anis@pop.fr", "0000"));
		System.out.println(Test.login("anis@pop.com", "0000", anis));
		
		System.out.println(anis.getFolders());
		anis.addFolder(coursesF);
		anis.addFolder("courses Nom du dossier String");
		System.out.println(anis.getFolders());
		
		System.out.println("---------------");
		System.out.println(alexis.getFolders());
		alexis.addFolderWhenFoldersIsNull(projetF);
		System.out.println(alexis.getFolders());
		
		System.out.println("---------------");
		Task laitTache = new Task(1, "acheter du lait chez carrefour");
		
		anis.addTaskInFolder(laitTache, "courses");
		System.out.println(anis.getFolders().get(0).getTasks());
		
		System.out.println("---------------");
		coursesF.displayAllTasks();
		
		
		
		
		
		
		
		
		
		

	}
	
	
	
//	Ex 2 - bis : Créer une méthode static dans Test qui s’appelle login qui prend un 
//	email et un password et un User  qui retourne true si la connexion est bonne et false 
//	si ce n’est pas le cas
	public static boolean login (String email, String password, User user) {
		
		return user.login(email, password);	
//		if (user.getEmail().equals(email) && user.getPassword().equals(password))
//			return true;
//		return false;
	}


}
