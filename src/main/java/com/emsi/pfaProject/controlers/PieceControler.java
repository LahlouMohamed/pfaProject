package com.emsi.pfaProject.controlers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.emsi.pfaProject.entities.Intervention;
import com.emsi.pfaProject.entities.Piece;
import com.emsi.pfaProject.repositories.IPieceRepository;

@RestController
@RequestMapping(value = "/pieces/")
@CrossOrigin(origins = "http://localhost:4200")
public class PieceControler {
	@Autowired
	private IPieceRepository pieceRepository;
	
	@PostMapping(value="new")
	public Piece newPiece(@RequestBody Piece piece) {
		return pieceRepository.save(piece);
	}

	@GetMapping("all")
	public List<Piece> findAll(){
		return pieceRepository.findAll();
	}
	
	@DeleteMapping(value="delete/{id}")
	public boolean deletePiece(@PathVariable Long id) {
		pieceRepository.deleteById(id);
		return true;
	}
}
