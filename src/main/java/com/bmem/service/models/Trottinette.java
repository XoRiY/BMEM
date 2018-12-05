package com.bmem.service.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Trottinette {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="ID_TROTTINETTE")
	private Long id;
	
	@Column(name="REFERENCE_TROTTINETTE")
	private String reference;
	
	@Column(name="VITESSE")
	private short vitesse;
	
	@Column(name="NOM")
	private String nom;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getReference() {
		return reference;
	}

	public void setReference(String reference) {
		this.reference = reference;
	}

	public short getVitesse() {
		return vitesse;
	}

	public void setVitesse(short vitesse) {
		this.vitesse = vitesse;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	@Override
	public String toString() {
		return "Trottinette [id=" + id + ", reference=" + reference + ", vitesse=" + vitesse + ", nom=" + nom
				+ ", getId()=" + getId() + ", getReference()=" + getReference() + ", getVitesse()=" + getVitesse()
				+ ", getNom()=" + getNom() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}

	public Trottinette(Long id, String reference, short vitesse, String nom) {
		super();
		this.id = id;
		this.reference = reference;
		this.vitesse = vitesse;
		this.nom = nom;
	}

	public Trottinette() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
}

