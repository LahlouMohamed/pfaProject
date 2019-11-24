package com.emsi.pfaProject.entities;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;

@Entity
@Data
@NoArgsConstructor
@ToString
@PrimaryKeyJoinColumn(name = "id")
public class Client extends Utilisateur {

    private String cin;

    public Client(String login, String pwd, String nom, String prenom, String email, String cin) {
        super(login, pwd, nom, prenom, email);
        this.cin = cin;
    }
}
