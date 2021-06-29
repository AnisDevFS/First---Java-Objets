package com.todoList;

public class Task {

	private long id;
	private String designation;

	public Task(long id, String designation) {
		super();
		this.id = id;
		this.designation = designation;
	}

	public Task() {
		super();
		// TODO Auto-generated constructor stub
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	@Override
	public String toString() {
		return "Task [id=" + id + ", designation=" + designation + "]";
	}

}
