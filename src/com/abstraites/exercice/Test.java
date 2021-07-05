package com.abstraites.exercice;

public class Test {

	public static void main(String[] args) {

		AgentAccueil aa = new AgentAccueil("Agent");
		VeilleurDeNuit vn = new VeilleurDeNuit("Veilleur");
		Administratif admin = new Administratif("administratif");
		Resident res = new Resident("Georges", "go@pop.fr", 0);
		
		aa.negocierContrat();
		vn.demanderConge(9);
		admin.declarerHTravail(35);
		aa.donnerAvertissement(res);
		System.out.println("---------------");
		admin.verserSalaire(vn, 2100f);
		System.out.println(res);
		aa.affecterChambre(res, 102);
		System.out.println(res);
		vn.faireTour();
	}

}
