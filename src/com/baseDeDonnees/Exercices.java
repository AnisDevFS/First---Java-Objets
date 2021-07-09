package com.baseDeDonnees;

import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.HashMap;

import com.mysql.jdbc.Connection;

public class Exercices {
	
	
	static String url = "jdbc:mysql://localhost:3306/bib";
	static String user = "root";
	static String passwd = "";

	public static void main(String[] args) {
			
		nomsDesUtilisateurs();
		System.out.println("-------------");
		
		clesValeurs();
		System.out.println("-------------");
		
		System.out.println(login("anis", "0000"));
		System.out.println("-------------");
		
		
		System.out.println(nomEcrivainLivre(3));
		System.out.println(nomEmprunteur("Spring Boot"));
	}
	
	
//	Ex 1 :	Créer une méthode login qui retourne un boolean si les paramètres login et password sont correctes 
	public static boolean login(String login, String pass) {

		try {
			Connection connection = (Connection) DriverManager.getConnection(url, user, passwd);

			String strSql = "SELECT * FROM utilisateurs WHERE login=? AND password=?"; 
			try (PreparedStatement statement = connection.prepareStatement(strSql)) {
				statement.setString( 1, login );
				statement.setString( 2, pass );
				try (ResultSet rs = statement.executeQuery()) {
					if (rs.next()) { // (int id, int id_livre, String nom, String login, String password)

							return true;
					
					}
				}
			}
		} catch (Exception exception) {
			throw new RuntimeException(exception);
		}
		return false;
	}
	
	
	
	
	
	
	
	

//	Ex 2 :	Créer une méthode qui affiche les noms des utilisateur
	public static void nomsDesUtilisateurs() {

		try {
			Connection connection = (Connection) DriverManager.getConnection(url, user, passwd);

			String strSql = "SELECT * FROM utilisateurs"; 
			try (PreparedStatement statement = connection.prepareStatement(strSql)) {
				try (ResultSet resultSet = statement.executeQuery()) {
					
					while (resultSet.next()) { 
						System.out.println((resultSet.getString("nom")));
					}
				}
			}
		} catch (Exception exception) {
			throw new RuntimeException(exception);
		}
	}
	
	
	
	
	
	
	
	
	

//	Ex 3 : Créer une méthode qui remplit (par clé=login/valeur=password) et affiche une HashMap (clé=login/valeur=password)
	public static void clesValeurs() {
		HashMap<String , String> hm = new HashMap<String , String>();
		try {
			Connection connection = (Connection) DriverManager.getConnection(url, user, passwd);

			String strSql = "SELECT * FROM utilisateurs"; 
			try (PreparedStatement statement = connection.prepareStatement(strSql)) {

				try (ResultSet resultSet = statement.executeQuery()) {
					while (resultSet.next()) { 
						hm.put(resultSet.getString("login"), resultSet.getString("password"));
					}
				}
			}
		} catch (Exception exception) {
			throw new RuntimeException(exception);
		}
		System.out.println(hm);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

//		Ex 4 :	Créer une méthode qui prend en param un id (l'id du livre) et qui retourne le nom de son écrivain
	public static String nomEcrivainLivre(int id) {

		try {
			Connection connection = (Connection) DriverManager.getConnection(url, user, passwd);

			String strSql = "SELECT * FROM livres "; // WHERE login=? AND password=?
			try (PreparedStatement statement = connection.prepareStatement(strSql)) {

				try (ResultSet rs = statement.executeQuery()) {
					while (rs.next()) { // (int id, int id_livre, String nom, String login, String password)

							if (rs.getInt("id") == id) return rs.getString("auteur");
					
					}
				}
			}
		} catch (Exception exception) {
			throw new RuntimeException(exception);
		}
		return null;
	}
	
	
//		Ex 5 :
//		Créer une méthode qui prend en param le nom du livre et qui retourne le nom de son emprunteur
//		(On va dire que les emprunteurs des livres sont dans la table utilisateurs)
	
	public static String nomEmprunteur(String nomLivre) {

		try {
			Connection connection = (Connection) DriverManager.getConnection(url, user, passwd);

			String strSql = "SELECT nom FROM utilisateurs, livres WHERE utilisateurs.id_livre = livres.id AND titre=?"; 
			try (PreparedStatement statement = connection.prepareStatement(strSql)) {
				statement.setString( 1, nomLivre );
				try (ResultSet rs = statement.executeQuery()) {
					while (rs.next()) { // (int id, int id_livre, String nom, String login, String password)

							return rs.getString("nom");
					
					}
				}
			}
		} catch (Exception exception) {
			throw new RuntimeException(exception);
		}
		return null;
	}

}
