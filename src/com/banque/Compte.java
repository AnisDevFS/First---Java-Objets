package com.banque;

public class Compte {

	private String numero;
	private float solde;
	private float decouvert;
	private String type;
	private char devise;
	
	public Compte() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Compte(String numero, float solde, float decouvert, String type, char devise) {
		super();
		this.numero = numero;
		this.solde = solde;
		this.decouvert = decouvert;
		this.type = type;
		this.devise = devise;
	}

	@Override
	public String toString() {
		return "Compte [numero=" + numero + ", solde=" + solde + ", decouvert=" + decouvert + ", type=" + type + "]";
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public float getSolde() {
		return solde;
	}

	public void setSolde(float solde) {
		this.solde = solde;
	}

	public float getDecouvert() {
		return decouvert;
	}

	public void setDecouvert(float decouvert) {
		this.decouvert = decouvert;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
	
	
	public char getDevise() {
		return devise;
	}

	public void setDevise(char devise) {
		this.devise = devise;
	}

	// Ex2
	public void alimenter(float montant) {
		this.solde = this.solde + montant;
	}
	
	public boolean retraitPossible(float montant) {
		if (montant <= (this.decouvert + this.solde)) {
			return true;
		}
		return false;
	}
	
	
	public void retirer(float montant) {
		
		if (this.retraitPossible(montant)) {
			System.out.println("vous avez retiré "+ montant);
			
			this.setSolde(this.solde - montant);
		}
		else 
			System.out.println("vous ne pouvez pas retiré "+ montant);
	}
	
	
	
//	Ex 3 méthode static  qui permet
//	De transférer de l’argent d’un compte à un autre
	
	
	// Ex5 méthode transferer de lex 3 (sans param devise)
	// le montant à envoyer aura la devise de l'emmetteur
	public static void transferer(Compte emmetteur, Compte receveur, float montant) {
		
		if (emmetteur.retraitPossible(montant)) {
			
			if (emmetteur.getDevise() == receveur.getDevise()) {
				emmetteur.setSolde(emmetteur.getSolde() - montant);
				receveur.setSolde(montant + receveur.getSolde());
			}
			else {
				if (receveur.getDevise() == '€') { // emmetteur.getDevise() = '$'
					emmetteur.setSolde(emmetteur.getSolde() - montant);
					receveur.setSolde((montant * 0.84f) + receveur.getSolde());
				}
				else if (receveur.getDevise() == '$') { // emmetteur.getDevise() = '€'
					emmetteur.setSolde(emmetteur.getSolde() - montant);
					receveur.setSolde((montant * 1.19f) + receveur.getSolde());
				}
			}
		}
		else {
			System.out.println("le compte emmetteur n'a pas l'argent suffisant !");
		}
	}
	
	
	
	
	
	
	
	
	// Ex5 méthode transferer de lex 4 (avec + param devise)
	
	public static void transferer(Compte emmetteur, Compte receveur, float montant , char devise) {
		
		if (emmetteur.getDevise() == devise) {
			
			if (emmetteur.retraitPossible(montant)) {		

				emmetteur.retirer(montant);
				
				if (receveur.getDevise() == emmetteur.getDevise()) {
					receveur.alimenter(montant);
				}
				
				else if (receveur.getDevise() == '€' && devise == '$') { // emmetteur.getDevise() = '$'
					receveur.alimenter(montant * 0.84f);
				}
				else if (receveur.getDevise() == '$' && devise == '€' ) { // emmetteur.getDevise() = '€'
					receveur.alimenter(montant * 1.19f);
				}
			}
			else 
				System.out.println("le compte emmetteur n'a pas l'argent suffisant !");
		}
		
		else { // emmetteur.getDevise() != devise
			if ( devise == '€' && emmetteur.getDevise() == '$') {
				
				if (emmetteur.retraitPossible(montant * 1.19f)) {		

					emmetteur.retirer(montant * 1.19f);
					
					if (receveur.getDevise() == devise) {
						receveur.alimenter(montant);
					}

					else if (receveur.getDevise() == '$') { // emmetteur.getDevise() = '€'
						receveur.alimenter(montant * 1.19f);
					}
				}
				else 
					System.out.println("le compte emmetteur n'a pas l'argent suffisant !");
			}
			// emmetteur.getDevise() != devise
			else if ( devise == '$' && emmetteur.getDevise() == '€') {
				
				if (emmetteur.retraitPossible(montant * 0.84f)) {		

					emmetteur.retirer(montant * 0.84f);
					
					if (receveur.getDevise() == devise) { // rec = $
						receveur.alimenter(montant);
					}

					else if (receveur.getDevise() == '€') { // emmetteur.getDevise() = '€'
						receveur.alimenter(montant * 0.84f);
					}
				}
				else 
					System.out.println("le compte emmetteur n'a pas l'argent suffisant !");
			}
		}
	}
	
	
	
	
	
	

	

}
