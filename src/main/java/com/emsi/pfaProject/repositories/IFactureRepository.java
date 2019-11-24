package com.emsi.pfaProject.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.emsi.pfaProject.entities.Facture;

public interface IFactureRepository extends JpaRepository<Facture, Long>{

}
