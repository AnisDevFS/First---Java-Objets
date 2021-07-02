package com.exceptions;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class FIchier {
	
	public static void main(String[] args) throws IOException {
		
		File dossier = new File("C://Users/Poste 2/Desktop/pppppppppppppp");

		if (!dossier.exists())
			dossier.mkdir();

		File file = new File(System.getProperty("user.home") + "/Desktop/cUnTestFaitParAnis.txt");
		if (!file.exists())
			try {

				file.createNewFile();
			} catch (IOException e) {
				e.printStackTrace();
			}
		
		
		String p = "pooooooooooop";
		FileWriter writer = new FileWriter(file);
		BufferedWriter bw = new BufferedWriter(writer);
		bw.write("Salut les stagiaires ");
		bw.newLine(); bw.newLine();
		bw.write("Java " + p);
		bw.close();
		writer.close();
		
//		FileInputStream fis = new FileInputStream(file);
//		InputStreamReader isr = new InputStreamReader(fis , "UTF-8");
//		BufferedReader reader = new BufferedReader(isr);
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream(file), "UTF-8"));
//		// j'ai créé un objet reader de type BufferedReader
//		// qui me permet de lire dans mon fichier file avec l'encodage UTF-8
		String s = reader.readLine();
//		// je declare un STring appélé s qui va prendre la valeur de premiere ligne de mon fichier
		while (s != null) {
			// tant que s n'est pas null
			System.out.println(s); // affciher la ligne
			s = reader.readLine(); // s prend la valeur de la next ligne de mon fichier
		}
		reader.close();
		

	}
	
	
	
	
	
	
	
	
	
	// creer une méthode qui prend un String (chemin vers un fichier)
	// et cette méthode doit créer le fichier
	
	public static void creerFichier(String pathOfFile) throws IOException {
		
		File file = new File(pathOfFile);
		file.createNewFile();

		
	}
	
	
	
	
	// creer une méthode qui va créer un fichier grace à son chemain
	// mais qui retourne le type du fichier  (String)
	
	 
	public static String typeOfFile(String pathOfFile) throws IOException {
		
		creerFichier(pathOfFile);
		
		String[] tab = pathOfFile.split(".");
		return tab[tab.length - 1];
	}
	
	
	
	
	
	
	
	
	
	
	
	

}
