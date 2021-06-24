package com.first;

import java.util.ArrayList;

public class Test {

	public static void main(String[] args) {
			
		Voiture bmw = new Voiture("BMW Serie 1", "noir", 300, 40000f);
		System.out.println(bmw.toString());
		
		bmw.setCouleur("rouge");
		Trottinette.changerCouleurVoiture(bmw, "Vert");
		System.out.println("after SetCouleur");
		System.out.println(bmw.getMarque());
		Voiture clio = new Voiture("Clio 4", "rouge", 220, 4000f);
		System.out.println(bmw.nombreVoiture);
		ArrayList<Voiture> lesVoituresDeAnis = new ArrayList<Voiture>();
		lesVoituresDeAnis.add(clio); // lesVoituresDeAnis.add(bmw);
		
		Trottinette redTrot = new Trottinette(2, "rouge", 200);
		Trottinette blackTrot = new Trottinette(3, "noir", 500);
		
		Employe anis = new Employe(1, "Anis", "anis@pop.fr", -30 , lesVoituresDeAnis, null);
		System.out.println(anis.getAge());
		anis.setTrot(blackTrot); 
		System.out.println(anis.getTrot());
		anis.changerTrottinette(redTrot);
		System.out.println(anis.getTrot());
		
		System.out.println(anis.getVoitures());
		anis.ajouterVoiture(bmw);
		System.out.println(anis.getVoitures());
		
	}

}
