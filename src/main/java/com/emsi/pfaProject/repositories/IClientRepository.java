package com.emsi.pfaProject.repositories;

import com.emsi.pfaProject.entities.Client;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IClientRepository extends JpaRepository<Client, Long>{

}
