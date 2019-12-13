package com.emsi.pfaProject.controlers;

import java.io.Serializable;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.emsi.pfaProject.entities.Intervention;
import com.emsi.pfaProject.repositories.IInterventionRepository;

@RestController
@RequestMapping(value = "/interventions/")
@CrossOrigin(origins = "http://localhost:4200")
public class InterventionControler implements Serializable{
	@Autowired
	private IInterventionRepository interventionRepository;
	
	@PostMapping(value="new")
	public Intervention newIntervention(@RequestBody Intervention intervention) {
		return interventionRepository.save(intervention);
	}

	@GetMapping("all")
	public List<Intervention> findAll(){
		return interventionRepository.findAll();
	}
	
	@DeleteMapping(value="delete/{id}")
	public boolean deleteIntervention(@PathVariable Long id) {
		interventionRepository.deleteById(id);
		return true;
	}
}
