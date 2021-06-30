package com.ecomerce;

public class Utilisatuer {

	private String nom;
	private String email;
	private int age;

	public Utilisatuer(String nom, String email, int age, Compte compte) {
		super();
		this.nom = nom;
		this.email = email;
		this.age = age;
		this.compte = compte;
	}

	public Utilisatuer() {
		super();
		// TODO Auto-generated constructor stub
	}

	private Compte compte;

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Compte getCompte() {
		return compte;
	}

	public void setCompte(Compte compte) {
		this.compte = compte;
	}

	@Override
	public String toString() {
		return "Utilisatuer [nom=" + nom + ", email=" + email + ", age=" + age + ", compte=" + compte + "]";
	}
	
	
	
	
//	le but est de diminuer le solde du compte de l'utilsateur (un utilisateur à un seul Compte)
// avec le montant de la commande
//	et vérifier sa solvabilité
//	la méthode sera une void
//	Créer un Classe appelé DBCmd	qui contient une arrayList de Commande
//	chaque commande réussie doit s'ajouter dans cette ArrayList
	
	public void creerCmd (Produit produit, int nombreAchete) {
		
		if (nombreAchete <= produit.getQuantite()) {

			Commande cmd = new Commande(produit, nombreAchete);
			
			if (cmd.getPrixTotal() <= (this.getCompte().getSolde() + this.getCompte().getDecouvert()) )
				{
					produit.setQuantite(produit.getQuantite() - nombreAchete);
					this.getCompte().setSolde(this.getCompte().getSolde() - cmd.getPrixTotal());
					DBCmd.listeCommandes.add(cmd);
				}
			else {
				System.out.println("Le compte de l'utilsateur n'est pas solvable");
			}
		}
		else 
		System.out.println("La quatité de produit est insufisante");
		
	}
	
	
	
	
	
	

}
