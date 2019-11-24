package com.emsi.pfaProject.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import java.util.Date;


@Entity
@Data @NoArgsConstructor @AllArgsConstructor @ToString
@PrimaryKeyJoinColumn(name = "id")
public class Garagiste extends Utilisateur {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Date dateNaissance;

    private int anneesExperience;

    private String specialite;

    private Date dateEmbauche;

}
