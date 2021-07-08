package com.lambdaAndCA;

public class MainClass {

	public static void main(String[] args) {
		
		Calcul cal = new Calcul() {
			@Override
			public	void somme (int a , int b) {
				System.out.println( a + " + " + b + " = " + (a+b));
			}
		};
		
		cal.somme(3 , 2);
		System.out.println(cal.getClass().getName());
		
		DireBonjour bon = new DireBonjour() {
			
			@Override
			public String bonjour(String nom) {
				return "Bonjour "+nom;
			}
		};
		
		System.out.println(bon.bonjour("Anis"));

	}

}
