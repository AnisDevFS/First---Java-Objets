package com.serialisation;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class TestSer {

	public static void main(String[] args)  {

		User user = new User("Julien", "julien@pop.fr", 25);
		
		// il faut créer un fichier baseDeDonnees.txt dans le bureau
		try {
		File file = new File(System.getProperty("user.home") + "/Desktop/baseDeDonnees.txt");
		FileOutputStream fos = new FileOutputStream(file);
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		
		oos.writeObject(user);
		oos.close();
		}
		catch (Exception e) {
			e.getStackTrace();
		}
		
		System.out.println("l'objet est sérialisé");
		

	}

}
