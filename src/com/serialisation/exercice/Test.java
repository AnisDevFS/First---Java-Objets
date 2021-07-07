package com.serialisation.exercice;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class Test {

	public static void main(String[] args) throws ParseException {
			
		User alexis = new User("Alexis", "alex@pop.fr", 22, "0000", null);
		
		Commande c1 = new Commande(1, 60, new SimpleDateFormat("dd/MM/yyyy").parse("31/12/2020") );
		Commande c2 = new Commande(2, 600, new SimpleDateFormat("dd/MM/yyyy").parse("31/12/2020"));
		Commande c3 = new Commande(3, 6000, new SimpleDateFormat("dd/MM/yyyy").parse("01/12/2020"));
		
		ArrayList<Commande> listCmd = new ArrayList<Commande>();
		listCmd.add(c3);	listCmd.add(c2); 	listCmd.add(c1); 
		
		alexis.setCommandes(listCmd);
		persister(alexis);
		
//		Ex 2	R�cuperer l'objet user � partir du fichier txt ou il s�rialis�
//		et l'afficher avec un toString
		File file = new File(System.getProperty("user.home") + "/Desktop/serialisation.txt");
		
		try {
		
		FileInputStream fis = new FileInputStream(file);
		ObjectInputStream ois = new ObjectInputStream(fis);
		
		User userBis = (User) ois.readObject();
		ois.close();
		System.out.println(userBis);
		}
		catch (Exception e) {
			e.getStackTrace();
		}
		
		System.out.println("l'objet est D�s�rialis�");
		
		
		commandesDate(file , "31/12/2020");

	}
	
	
	
	
	
	
	
	
	
//	Ex 1 : Cr�er un m�thode qui doit persister un objet user
//		dans un fichier txt dans le bureau
	
	public static void persister(User user) {
		
		try {
		File file = new File(System.getProperty("user.home") + "/Desktop/serialisation.txt");
		FileOutputStream fos = new FileOutputStream(file);
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		
		oos.writeObject(user);
		oos.close();
		}
		catch (Exception e) {
			e.getStackTrace();
		}
		
		System.out.println("l'objet est s�rialis�");
		
	}
	
	
	
	
	
	
	
//		Ex 3 : une m�thode qui prend un File et une Date
//		qui d�serialise et r�upere l'objet de type User dans le File et afficher toutes les commandes
//		pass�es dans la date pass�e aux paramettres
	
	public static void commandesDate(File file , String date) throws ParseException {
		
		Date dateReelle = new SimpleDateFormat("dd/MM/yyyy").parse(date);
		
		try {
			
		FileInputStream fis = new FileInputStream(file);
		ObjectInputStream ois = new ObjectInputStream(fis);
		
		User userRecupere = (User) ois.readObject();
		ois.close();
		
		for (Commande cmd : userRecupere.getCommandes()) {
			if (cmd.getDate().equals(dateReelle)) {
				System.out.println(cmd);
			}
		}
		}
		catch (Exception e) {
			e.getStackTrace();
		}

		
	}
	
	
	
	
	
	

}
