package com.abstraites;

public class Eudiant extends Personne {

	@Override
	void manger() {
		System.out.println("etudiant mange");
	}

	@Override
	void dormir() {
		System.out.println("etudiant dort");
	}

}
