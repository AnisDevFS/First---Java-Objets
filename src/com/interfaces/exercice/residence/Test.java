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
			 employe.declarerHTravail(6);
			Context cxt = new Context(employe, resident);
			cxt.execute();
			Employe.negocierContrat();
		}
		System.out.println("------------");
		
		
		int i = 5;
		Class iClass = int.class;
		System.out.println(iClass.getName());
		System.out.println(iClass.isPrimitive());
		System.out.println(((Object)i).getClass().getSimpleName());
		System.out.println(((Object)i).getClass().isPrimitive());

	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
