package com.emsi.pfaProject.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Etat {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private int dureeEstime;
	private String commentaire;
	
	@ManyToOne
	private Intervention intervention;

	public Etat() {
		super();
	}

	public Etat(Long id, int dureeEstime, String commentaire, Intervention intervention) {
		super();
		this.id = id;
		this.dureeEstime = dureeEstime;
		this.commentaire = commentaire;
		this.intervention = intervention;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public int getDureeEstime() {
		return dureeEstime;
	}

	public void setDureeEstime(int dureeEstime) {
		this.dureeEstime = dureeEstime;
	}

	public String getCommentaire() {
		return commentaire;
	}

	public void setCommentaire(String commentaire) {
		this.commentaire = commentaire;
	}

	public Intervention getIntervention() {
		return intervention;
	}

	public void setIntervention(Intervention intervention) {
		this.intervention = intervention;
	}
}
