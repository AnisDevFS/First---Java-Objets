package com.enumeration;

public class Test {

	public static void main(String[] args) {
			
		System.out.println(JourDeSemaine.Dimanche);
		System.out.println(JourDeSemaine.Samedi.toString());
		System.out.println(JourDeSemaine.Samedi.name());
		System.out.println(JourDeSemaine.Jeudi.ordinal());
		
		System.out.println(JourDeSemaine.values().length);
		
		for (JourDeSemaine jour : JourDeSemaine.values()) {
			
			System.out.println(jour.name());
		}
		

	}

}
