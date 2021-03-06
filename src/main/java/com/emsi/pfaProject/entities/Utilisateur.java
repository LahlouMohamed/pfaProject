package com.emsi.pfaProject.entities;

import javax.persistence.*;
import java.util.List;


@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public class Utilisateur {

    @Id
    private String login;

    private String pwd;

    private String nom;

    private String prenom;

    private String email;

    @ManyToMany
    private List<Role> roles;

    public Utilisateur(String login, String pwd, String nom, String prenom, String email) {
        this.login = login;
        this.prenom = prenom;
        this.nom = nom;
        this.pwd = pwd;
        this.email = email;
    }

    public Utilisateur() {
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
