package com.enumeration.exercice;

import java.util.ArrayList;
import java.util.Iterator;

public class Test {

	public static void main(String[] args) {
		
		ArrayList<LesAdmins> lesAdmin = new ArrayList<LesAdmins>();
		lesAdmin.add(LesAdmins.Julien);
		lesAdmin.add(LesAdmins.Cathy);
		
		System.out.println(verifEnum("Cathy"));
		// .equalsIgnoreCase(String) // comme equals mais ne prends pas en 
		//compte les Maj Min 
		
		System.out.println(login("Julien", "JULIENJULIE"));

	}


//Ex 1 : créer une méthode qui prend en param un String
//et qui retourne true si elle trouve ce string dans les valeurs de l'ENUM
//et false si elle le trouve pas
	public static boolean verifEnum(String s) {
		
		for (LesAdmins admin : LesAdmins.values()) {
			
			if (s.equals(admin.name())) return true;
		}
		return false;
	}
	
	
	//Ex 2 : créer un méthode login qui prend en param 2 STrings :
	//un identifiant et un password
	//et qui  retourne true si :
	//l'identifiant est = à une valeur dans l'ENUM et le password sera = au 
	//meme String doublé tout en maj
	//exemple : login ("Cathy" , "CATHYCATHY") doit retourner true
	//tout les autres cas retournent false
	public static boolean login(String identifiant, String password) {
		
		for (LesAdmins admin : LesAdmins.values()) {
			
			if (identifiant.equals(admin.toString()) && 
				password.equals((admin.toString()+admin.toString()).toUpperCase())	)
				return true;
		}
		return false;
	}

}


















