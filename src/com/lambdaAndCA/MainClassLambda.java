package com.lambdaAndCA;

public class MainClassLambda {
	
	public static void main(String[] args) {
		
//		Calcul cal = new Calcul() {
//			@Override
//			public	void somme (int a , int b) {
//				System.out.println( a + " + " + b + " = " + (a+b));
//			}
//		};
		
		Calcul cal = (a , b) ->	System.out.println( a+" + "+b+" = "+(a+b));

		System.out.println(cal.getClass().getName());
		cal.somme(3 , 2);
		
//		DireBonjour bon = new DireBonjour() {
//			
//			@Override
//			public String bonjour(String nom) {
//				return "Bonjour "+nom;
//			}
//		};
		
		DireBonjour bon = (nom) ->  "Bonjour "+nom ;
//		DireBonjour bon = (nom) -> { return "Bonjour "+nom ;};
		
		System.out.println(bon.bonjour("Anis"));
		clheure(bon.bonjour("Anis"));

	}
	
	static void clheure(String nom) {
		System.out.println(nom + " c'est l'heure !");
	}

}
