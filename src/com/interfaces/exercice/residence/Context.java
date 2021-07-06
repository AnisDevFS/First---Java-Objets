package com.interfaces.exercice.residence;

public class Context {
	
	Employe employe;
	Resident resident;
	
	public Context(Employe employe, Resident resident) {
		this.employe = employe;
		this.resident = resident;
	}
	
	public void execute() {
		this.employe.donnerAvertissement(this.resident);
	}

}
