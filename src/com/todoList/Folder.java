package com.todoList;

import java.util.ArrayList;

public class Folder {

	private long id;
	private String name;
	private ArrayList<Task> tasks;

	public Folder() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Folder(long id, String name, ArrayList<Task> tasks) {
		super();
		this.id = id;
		this.name = name;
		this.tasks = tasks;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public ArrayList<Task> getTasks() {
		return tasks;
	}

	public void setTasks(ArrayList<Task> tasks) {
		this.tasks = tasks;
	}

	@Override
	public String toString() {
		return "Folder [id=" + id + ", name=" + name + ", tasks=" + tasks + "]";
	}
	
	
	
	
	
//	Ex 5 : Une méthode de folder qui permet d’afficher toutes ses tasks

	public void displayAllTasks() {
		
		for (Task task : this.tasks) {
			System.out.println(task.getDesignation());
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
