package com.emsi.pfaProject.repositories;

import com.emsi.pfaProject.entities.Utilisateur;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IUtilisateurRepository extends JpaRepository<Utilisateur, Long>{

}
