package com.emsi.pfaProject.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Etat {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private int dureeEstime;
	private String commentaire;
	private boolean faite;
	
	public boolean isFaite() {
		return faite;
	}

	public void setFaite(boolean faite) {
		this.faite = faite;
	}	

	public Etat() {
		super();
	}

	public Etat(Long id, int dureeEstime, String commentaire, boolean faite) {
		super();
		this.id = id;
		this.dureeEstime = dureeEstime;
		this.commentaire = commentaire;
		
		this.faite = faite;
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

}
