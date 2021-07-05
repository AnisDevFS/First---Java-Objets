package com.interfaces;

public interface Compte {
	
	void retirer(float montant);
	void alimenter(float montant);
	void transferer( Compte dest, float montant);

}
