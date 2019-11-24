package com.emsi.pfaProject.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import java.util.Date;


@Entity
@Data @NoArgsConstructor  @ToString
@PrimaryKeyJoinColumn(name = "id")
public class Client extends Utilisateur {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String cin;

    public Client(String login,String pwd,String nom,String prenom,String email,String cin){
        super(login,pwd,nom,prenom,email);
        this.cin=cin;
    }

}
