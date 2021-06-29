package com.todoList;

import java.util.ArrayList;

public class User {

	private String name;
	private String email;
	private String password;
	private int age;
	private ArrayList<Folder> folders;

	public User(String name, String email, String password, int age, ArrayList<Folder> folders) {
		super();
		this.name = name;
		this.email = email;
		this.password = password;
		this.age = age;
		this.folders = folders;
	}

	// name, email, password, age et des folders

	public User() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public ArrayList<Folder> getFolders() {
		return folders;
	}

	public void setFolders(ArrayList<Folder> folders) {
		this.folders = folders;
	}

	@Override
	public String toString() {
		return "User [name=" + name + ", email=" + email + ", password=" + password + ", age=" + age + ", folders="
				+ folders + "]";
	}
	
	
	
//	Ex 2 : Cr�er une m�thode d�objet chez User qui s�appelle login qui 
//	prend un email et un password et qui retourne true si la connexion est
//	bonne et false si ce n�est pas le cas
	
	public boolean login (String email, String password) {
		
		if (this.getEmail().equals(email) && this.getPassword().equals(password))
			return true;
		return false;
	}
	
	
//	Ex 3 : Cr�er une m�thode qui permet � l�User de rajouter un folder
	public void addFolder(Folder f) {
		
		this.folders.add(f);
	}

	
//	Ex 3 : Cr�er une m�thode qui permet � l�User de rajouter un folder en pr�cisant le nom du folder
	public void addFolder(String folderName) {
		
		Folder f = new Folder(this.folders.size() + 1, folderName, null);
		this.folders.add(f);
	}
	
	
//	Ex 3 : Cr�er une m�thode qui permet � l�User de rajouter un folder et gerer une liste de folders null
	public void addFolderWhenFoldersIsNull(Folder f) {
		
		if (this.folders == null) {
			ArrayList<Folder> folders = new ArrayList<Folder>();
			folders.add(f);
			this.setFolders(folders);
		}
		else this.folders.add(f);
	}
	
	
	
	
//	Ex 4 :  Une m�thode qui permet � l�User de rajouter une Task
//	dans un folder en passant le nom du Folder

	public void addTaskInFolder(Task t, String folderName) {
		
		for (int i =0; i < this.folders.size() ; i++) {
			
			if (this.folders.get(i).getName().equals(folderName)) {
				
				if (this.folders.get(i).getTasks() == null) {
					ArrayList<Task> tasks = new ArrayList<Task>();
					tasks.add(t);
					this.folders.get(i).setTasks(tasks);
				}
				else 
				this.folders.get(i).getTasks().add(t);
			}
		}
	}
	
	
	
	
	
	
	
	
	

}
