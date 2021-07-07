package com.serialisation;

import java.io.File;
import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class TestDeser {

	public static void main(String[] args) {

		// il faut créer un fichier baseDeDonnees.txt dans le bureau
		try {
		File file = new File(System.getProperty("user.home") + "/Desktop/baseDeDonnees.txt");
		FileInputStream fis = new FileInputStream(file);
		ObjectInputStream ois = new ObjectInputStream(fis);
		
		User userBis = (User) ois.readObject();
		ois.close();
		System.out.println(userBis);
		}
		catch (Exception e) {
			e.getStackTrace();
		}
		
		System.out.println("l'objet est Désérialisé");

	}

}
