package com.emsi.pfaProject.entities;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import java.util.Date;


@Entity
@PrimaryKeyJoinColumn(name = "id")
public class Garagiste extends Utilisateur {

    private Date dateNaissance;

    private int anneesExperience;

    private String specialite;

    private Date dateEmbauche;

    public Garagiste(String login, String pwd, String nom, String prenom, String email, Date dateNaissance, int anneesExperience, String specialite, Date dateEmbauche) {
        super(login, pwd, nom, prenom, email);
        this.dateEmbauche = dateEmbauche;
        this.dateNaissance = dateNaissance;
        this.specialite = specialite;
        this.anneesExperience = anneesExperience;
    }

    public Garagiste() {
    }

    public Date getDateNaissance() {
        return dateNaissance;
    }

    public void setDateNaissance(Date dateNaissance) {
        this.dateNaissance = dateNaissance;
    }

    public int getAnneesExperience() {
        return anneesExperience;
    }

    public void setAnneesExperience(int anneesExperience) {
        this.anneesExperience = anneesExperience;
    }

    public String getSpecialite() {
        return specialite;
    }

    public void setSpecialite(String specialite) {
        this.specialite = specialite;
    }

    public Date getDateEmbauche() {
        return dateEmbauche;
    }

    public void setDateEmbauche(Date dateEmbauche) {
        this.dateEmbauche = dateEmbauche;
    }
}
