package com.interfaces.todoList;

import java.util.ArrayList;

public class Dossier implements Enveloppant {

	private long id;
	private String nom;
	private ArrayList<Tache> listeDeTaches;

	public Dossier() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Dossier(long id, String nom, ArrayList<Tache> listeDeTaches) {
		super();
		this.id = id;
		this.nom = nom;
		this.listeDeTaches = listeDeTaches;
	}

	public long getId() {
		return id;
	}

	public void setId(long idDossier) {
		this.id = idDossier;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public ArrayList<Tache> getListeDeTaches() {
		return listeDeTaches;
	}

	public void setListeDeTaches(ArrayList<Tache> listeDeTaches) {
		this.listeDeTaches = listeDeTaches;
	}

	@Override
	public String toString() {
		return "Dossier [idDossier=" + id + ", nom=" + nom + ", listeDeTaches=" + listeDeTaches + "]";
	}
	
	@Override
	public void ajouterTache(Tache tache) {
		
		if (this.listeDeTaches == null) {
			this.listeDeTaches = new ArrayList<Tache>();
		}
		
		String prefix = "Dossier " + this.getNom() + " : " ;
		tache.setDescription(prefix + tache.getDescription());
		
		this.listeDeTaches.add(tache);
	}

	@Override
	public void ajouterTache(String descTache) {
		
		if (this.listeDeTaches == null) {
			this.listeDeTaches = new ArrayList<Tache>();
		}
			
		String prefix = "Dossier " + this.getNom() + " : " ;
		Tache t = new Tache(this.listeDeTaches.size() + 1 , prefix + descTache);
		this.listeDeTaches.add(t);
	}

}
