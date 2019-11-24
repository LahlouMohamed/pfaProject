package com.emsi.pfaProject.controlers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.emsi.pfaProject.repositories.IEtatRepository;

@RestController
@RequestMapping(value = "/etats/")
@CrossOrigin(origins = "http://localhost:4200")
public class EtatControler {
	@Autowired
	private IEtatRepository etatRepository;
}
