package com.abstraites;

public class Test {

	public static void main(String[] args) {
		
		Personne p = new SuperProf();
		p.marcher();
		((Prof) p).ensigner();

	}

}
