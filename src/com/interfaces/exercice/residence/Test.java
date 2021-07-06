package com.interfaces.exercice.residence;

public class Test {

	public static void main(String[] args) {
			
		VeilleurDeNuit vn = new VeilleurDeNuit("Paul le Veilleur");
		AgentAccueil aa = new AgentAccueil("Jack l'Agent");
		Administratif admin = new Administratif("Mr l'adminstratif");
		
		Employe [] tab = new Employe[3];
		tab[0] = vn;	tab[1] = aa;	tab[2] = admin;
		
		Resident resident = new Etudiant("Anis" , 30);
		System.out.println("------------");
		for (Employe employe : tab) {
			// employe.donnerAvertissement(resident);
			Context cxt = new Context(employe, resident);
			cxt.execute();
		}

	}

}
