package com.lambdaAndCA.exercices;

public class Test {

	public static void main(String[] args) {
		String[] stagiaires = { "Anis", "Inga", "Im�n", "S�bastien", "Nicolas", "Dalia" };

//		Ex 1:
//		Cr�er une interface fonctionnelle qui s'appelle Chat et � l'int�rieur une m�thode qui 
//		s'appelle mioler qui prend une Cha�ne de caract�res en param�tre qui est le nom du chat
//		Pour pouvoir cr�er une expression lambda li�e � un objet chat qui qui affiche
//		(nom + � miaule ! �)
		
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
