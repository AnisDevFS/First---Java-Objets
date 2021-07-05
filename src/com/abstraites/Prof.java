package com.abstraites;

public abstract class Prof extends Personne {

	@Override
	void manger() {
		System.out.println("Prof mange");
	}

	@Override
	void dormir() {
		System.out.println("Prof dort");
	}
	
	abstract void preparerCours();
	
	void ensigner() {
		System.out.println("Prof enseigne");
	}

}
