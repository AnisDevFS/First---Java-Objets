package com.lambdaAndCA.exercices;

import java.util.ArrayList;
import java.util.Collections;

public class MainEx2 {

	public static void main(String[] args) {

		String[] stagiaires = { "Anis", "Inga", "Imén", "Sébastien", "Nicolas", "Dalia" };
		ArrayList<String> list = new ArrayList<String>();
		for (String s : stagiaires) {
			list.add(s);
		}

		TriMaj tMaj = (liste) -> {
			Collections.sort(liste);
//			for (String s : liste) {
//				System.out.println(s.toUpperCase());
//			}

//			liste.replaceAll(string -> string.toUpperCase());		

			liste.replaceAll(String::toUpperCase);
			
			// parcourir avec la méthode forEach et afficher en Maj
			liste.forEach(str -> System.out.println(str));

//			for (String s : liste) {
//				System.out.println(s);
//			}

		};

		TriMaj tMajClassAno = new TriMaj() {

			@Override
			public void trierEnMaj(ArrayList<String> liste) {

				Collections.sort(liste);
				for (String s : liste) {
					System.out.println(s.toUpperCase());
				}
			}
		};

		tMaj.trierEnMaj(list);

	}

//Ex 2:
//Créer une interface fonctionnelle qui s'appelle TriMaj et à l'intérieur une
//méthode qui s'appelle trierEnMaj qui prend un ArrayList de string en paramètre 
//Pour pouvoir créer une expression lambda liée à un objet t qui qui affiche
//les éléments de l’arraylist trié et en majuscule
//Créer une expression lambda liée à un objet tMaj qui qui affiche 
//les éléments de l’arraylist en majuscule
}
