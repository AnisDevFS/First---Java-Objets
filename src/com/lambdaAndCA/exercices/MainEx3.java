package com.lambdaAndCA.exercices;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class MainEx3 {
	
	public static void main(String[] args) throws IOException {
		
		String[] stagiaires = { "Anis", "Inga", "Im�n", "S�bastien", "Nicolas", "Dalia" };
		
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
	
//	Ex3 :Cr�er une interface fonctionnelle qui s'appelle Fichier et � 
//	l'int�rieur une m�thode qui s'appelle lire qui prend en 
//	param�tre un fichier (File) et un tableau de Cha�ne de caract�res
//	Pour pouvoir cr�er une expression lambda li�e � un objet f 
//	qui ins�re ligne par ligne les String du tableau dans le fichier

}
