package com.emsi.pfaProject.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.emsi.pfaProject.entities.Intervention;

public interface IInterventionRepository extends JpaRepository<Intervention, Long>{

}
