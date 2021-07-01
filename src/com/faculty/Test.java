package com.faculty;

import java.util.ArrayList;

public class Test {

	public static void main(String[] args) {
			
		Personne p = new Personne("Joe Biden", "joe@pop.fr", 80);
		
		Etudiant e = new Etudiant("anis", "anis@op.fr", 30, "161665632");
		
		ArrayList<String> matieres = new ArrayList<String>();
		matieres.add("java"); matieres.add("HTML"); matieres.add("CSS");
		
		Prof prof = new Prof("Mark Leprof", "mark@pop.fr", 60, 3500, matieres);
		
		p.desciption();
		System.out.println("---------------");
		e.desciption();
		System.out.println("---------------");
		prof.desciption();

	}

}
