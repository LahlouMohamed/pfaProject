package com.emsi.pfaProject.entities;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;

@Entity
@PrimaryKeyJoinColumn(name = "id")
public class Client extends Utilisateur {

    private String cin;

    public Client(String login, String pwd, String nom, String prenom, String email, String cin) {
        super(login, pwd, nom, prenom, email);
        this.cin = cin;
    }

    public Client() {
    }

    public String getCin() {
        return cin;
    }

    public void setCin(String cin) {
        this.cin = cin;
    }
}
