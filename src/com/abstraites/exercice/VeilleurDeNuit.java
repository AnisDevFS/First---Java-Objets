package com.abstraites.exercice;

public class VeilleurDeNuit extends Employe {

	public VeilleurDeNuit(String nom) {
		super(nom);
		// TODO Auto-generated constructor stub
	}

	@Override
	void negocierContrat() {
		System.out.println("VeilleurDeNuit n�gocie son contrat");
	}

	@Override
	void demanderConge(int nombreJour) {
		System.out.println("VeilleurDeNuit qui demande " +
				nombreJour + " jours de cong�");
	}
	
	void faireTour () {
		System.out.println("VeilleurDeNuit fait un tour");
	}

}
