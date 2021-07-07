package com.serialisation.exercice;

import java.io.Serializable;
import java.util.Date;

public class Commande implements Serializable {

	private long id;
	private float prixTotal;
	private Date date;

	public Commande(long id, float prixTotal, Date date) {
		super();
		this.id = id;
		this.prixTotal = prixTotal;
		this.date = date;
	}

	public Commande() {
		super();
		// TODO Auto-generated constructor stub
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public float getPrixTotal() {
		return prixTotal;
	}

	public void setPrixTotal(float prixTotal) {
		this.prixTotal = prixTotal;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	@Override
	public String toString() {
		return "Commande [id=" + id + ", prixTotal=" + prixTotal + ", date=" + date + "]";
	}

}
