package com.interfaces.todoList;

public class Tache {

	private long idTache;
	private String description;

	public Tache(long idTache, String description) {
		super();
		this.idTache = idTache;
		this.description = description;
	}

	public Tache() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Tache [idTache=" + idTache + ", description=" + description + "]";
	}

	public long getIdTache() {
		return idTache;
	}

	public void setIdTache(long idTache) {
		this.idTache = idTache;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

}
