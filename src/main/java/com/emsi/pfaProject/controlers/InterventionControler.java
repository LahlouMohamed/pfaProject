package com.emsi.pfaProject.controlers;

import java.io.Serializable;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
}
