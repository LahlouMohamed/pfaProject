package com.emsi.pfaProject.repositories;

import com.emsi.pfaProject.entities.Utilisateur;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface IUtilisateurRepository extends JpaRepository<Utilisateur, Long>{
    @Query("SELECT u FROM Utilisateur u where u.login = :username")
    public Utilisateur GetUserByUsername(String username);
}
