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

import com.emsi.pfaProject.entities.Etat;
import com.emsi.pfaProject.repositories.IEtatRepository;

@RestController
@RequestMapping(value = "/etats/")
@CrossOrigin(origins = "http://localhost:4200")
public class EtatControler {
	@Autowired
	private IEtatRepository etatRepository;

	@PostMapping(value="new")
	public Etat newEtat(@RequestBody Etat etat) {
		return etatRepository.save(etat);
	}

	@GetMapping("all")
	public List<Etat> findAll(){
		return etatRepository.findAll();
	}
	
	@DeleteMapping(value="delete/{id}")
	public boolean deleteEtat(@PathVariable Long id) {
		etatRepository.deleteById(id);
		return true;
	}
}
