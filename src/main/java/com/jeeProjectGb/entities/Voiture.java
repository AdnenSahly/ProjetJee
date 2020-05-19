package com.jeeProjectGb.entities;

import java.sql.Date;


import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;


@Entity
public class Voiture {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	private String matricule;
    private float price;
    private String picture;
    private float kilometrage;
    private Date miseEnCirculation;
    private boolean vondu;
    private String marque;
    private String modele;
    
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
	@JoinColumn(name = "categorie_id", nullable = false)
	@OnDelete(action = OnDeleteAction.CASCADE)
    private Categorie categorie;
	public Voiture() {
	}
	public long getId() {
		return id;
	}
	
	
	
	public Voiture(String matricule, float price, String picture, float kilometrage, Date miseEnCirculation,
			boolean vondu, String marque, String modele) {
		super();
		this.matricule = matricule;
		this.price = price;
		this.picture = picture;
		this.kilometrage = kilometrage;
		this.miseEnCirculation = miseEnCirculation;
		this.vondu = vondu;
		this.marque = marque;
		this.modele = modele;
	}
	public String getMatricule() {
		return matricule;
	}
	public void setMatricule(String matricule) {
		this.matricule = matricule;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public String getPicture() {
		return picture;
	}
	public void setPicture(String picture) {
		this.picture = picture;
	}
	public float getKilometrage() {
		return kilometrage;
	}
	public void setKilometrage(float kilometrage) {
		this.kilometrage = kilometrage;
	}
	public Date getMiseEnCirculation() {
		return miseEnCirculation;
	}
	public void setMiseEnCirculation(Date miseEnCirculation) {
		this.miseEnCirculation = miseEnCirculation;
	}
	public boolean isVondu() {
		return vondu;
	}
	public void setVondu(boolean vondu) {
		this.vondu = vondu;
	}
	public String getMarque() {
		return marque;
	}
	public void setMarque(String marque) {
		this.marque = marque;
	}
	public String getModele() {
		return modele;
	}
	public void setModele(String modele) {
		this.modele = modele;
	}

	
}
