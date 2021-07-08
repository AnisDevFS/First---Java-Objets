package com.lambdaAndCA.exercices;

import java.util.ArrayList;
import java.util.Collections;

public class MainEx2 {

	public static void main(String[] args) {

		String[] stagiaires = { "Anis", "Inga", "Im�n", "S�bastien", "Nicolas", "Dalia" };
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
			
			// parcourir avec la m�thode forEach et afficher en Maj
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
//Cr�er une interface fonctionnelle qui s'appelle TriMaj et � l'int�rieur une
//m�thode qui s'appelle trierEnMaj qui prend un ArrayList de string en param�tre 
//Pour pouvoir cr�er une expression lambda li�e � un objet t qui qui affiche
//les �l�ments de l�arraylist tri� et en majuscule
//Cr�er une expression lambda li�e � un objet tMaj qui qui affiche 
//les �l�ments de l�arraylist en majuscule
}
