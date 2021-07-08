package com.lambdaAndCA.exercices;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class MainEx3 {
	
	public static void main(String[] args) throws IOException {
		
		String[] stagiaires = { "Anis", "Inga", "Imén", "Sébastien", "Nicolas", "Dalia" };
		
		File file = new File(System.getProperty("user.home") + "/Desktop/lambda.txt");

		Fichier f = (fichier , tab) -> {
			
			BufferedWriter bw = new BufferedWriter(new FileWriter(fichier));
			
			for (String nom : tab) {
				bw.write(nom);
				bw.newLine();
			}
			bw.close();
		};
		
		Fichier f2 = new Fichier() {
			
			@Override
			public void lire(File file, String[] tab) throws IOException {
				BufferedWriter bw = new BufferedWriter(new FileWriter(file));
				
				for (String nom : tab) {
					bw.write(nom);
					bw.newLine();
				}
				bw.close();	
			}
		};
		
		f2.lire(file, stagiaires);
	}
	
//	Ex3 :Créer une interface fonctionnelle qui s'appelle Fichier et à 
//	l'intérieur une méthode qui s'appelle lire qui prend en 
//	paramètre un fichier (File) et un tableau de Chaîne de caractères
//	Pour pouvoir créer une expression lambda liée à un objet f 
//	qui insère ligne par ligne les String du tableau dans le fichier

}
