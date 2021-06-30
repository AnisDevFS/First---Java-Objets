package com.ecomerce;

public class Test {

	public static void main(String[] args) {
			
		Produit chemise = new Produit("Chemise SpringField", 100, 25f);
		Produit oneplus7t = new Produit("oneplus7t", 350, 350f);
		System.out.println(creerCmd(chemise, 40));

		
		Compte compteAnis = new Compte("666", 800, "euro", 200);
		Utilisatuer anis = new Utilisatuer("Anis", "anis@pop.fr", 30, compteAnis);
		
		
		anis.creerCmd(chemise, 20);
		anis.creerCmd(oneplus7t, 1);
		System.out.println(DBCmd.toStringg());
		anis.creerCmd(oneplus7t, 1);
		
		
		

	}
	

//	Ex 1 : qui permet de créer une commande (retourne une commande) la méthode doit prendre 2 param  (static)
//	un Produit et un nombre (nombre de produits achetés) et doit retourner un objet de type Commande
	
	public static Commande creerCmd (Produit produit, int nombreAchete) {
		
		if (nombreAchete <= produit.getQuantite()) {

			Commande cmd = new Commande(produit, nombreAchete);
			produit.setQuantite(produit.getQuantite() - nombreAchete);
			
			return cmd;
		}
		
		System.out.println("La quatité de produit est insufisante");
		return null;
		
	}

}
