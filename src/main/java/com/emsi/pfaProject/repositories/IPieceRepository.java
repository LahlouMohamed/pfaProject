package com.emsi.pfaProject.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.emsi.pfaProject.entities.Piece;

public interface IPieceRepository extends JpaRepository<Piece, Long>{

}
