package com.emsi.pfaProject.entities;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;


@Entity
@Data
@NoArgsConstructor
@ToString
@Inheritance(strategy = InheritanceType.JOINED)
public class Utilisateur {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String login;

    private String pwd;

    private String nom;

    private String prenom;

    private String email;

    public Utilisateur(String login, String pwd, String nom, String prenom, String email) {
        this.login = login;
        this.prenom = prenom;
        this.nom = nom;
        this.pwd = pwd;
        this.email = email;
    }
}
