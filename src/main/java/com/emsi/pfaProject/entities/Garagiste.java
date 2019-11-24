package com.emsi.pfaProject.entities;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import java.util.Date;


@Entity
@Data
@NoArgsConstructor
@ToString
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

}
