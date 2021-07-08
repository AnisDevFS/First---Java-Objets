package com.lambdaAndCA.exercices;

public class Test {

	public static void main(String[] args) {
		String[] stagiaires = { "Anis", "Inga", "Imén", "Sébastien", "Nicolas", "Dalia" };

//		Ex 1:
//		Créer une interface fonctionnelle qui s'appelle Chat et à l'intérieur une méthode qui 
//		s'appelle mioler qui prend une Chaîne de caractères en paramètre qui est le nom du chat
//		Pour pouvoir créer une expression lambda liée à un objet chat qui qui affiche
//		(nom + « miaule ! »)
		
		Chat ch = new Chat() {
			
			@Override
			public void mioler(String nomChat) {
				
				System.out.println(nomChat + " miaule !");
			}
		};
		
		ch.mioler("Mimi");
		
		Chat chatDeRue = (nomChat) -> System.out.println(nomChat + " miaule !");
		chatDeRue.mioler("Momo");

	}

}
