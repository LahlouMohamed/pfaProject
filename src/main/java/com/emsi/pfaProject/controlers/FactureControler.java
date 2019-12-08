package com.emsi.pfaProject.controlers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.emsi.pfaProject.entities.Facture;
import com.emsi.pfaProject.entities.Type;
import com.emsi.pfaProject.repositories.IFactureRepository;

@RestController
@RequestMapping(value = "/factures/")
@CrossOrigin(origins = "http://localhost:4200")
public class FactureControler {
	@Autowired
	private IFactureRepository factureRepository;
	
	@PostMapping(value="new")
	public Facture newType(@RequestBody Facture facture) {
		return factureRepository.save(facture);
	}
}
