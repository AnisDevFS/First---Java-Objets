package com.banque;

public class Carte {
	


	private long idCarte;
	private String numero;
	private String type;
	
	public Carte() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	public Carte(long idCarte, String numero, String type) {
		super();
		this.idCarte = idCarte;
		this.numero = numero;
		this.type = type;
	}
	
	
	public long getIdCarte() {
		return idCarte;
	}
	public void setIdCarte(long idCarte) {
		this.idCarte = idCarte;
	}
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	@Override
	public String toString() {
		return "Carte [idCarte=" + idCarte + ", numero=" + numero + ", type=" + type + "]";
	}
	
	

}
