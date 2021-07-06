package com.interfaces.exercice.residence;

public interface Resident {
	
	String getNom();
	
	void setNumChambre(int numChambre);
	
	void louerChambre(int numChambre);
	
	void payerLoyer(float loyer);

}
