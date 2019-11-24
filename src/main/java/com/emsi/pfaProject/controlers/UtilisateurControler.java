package com.emsi.pfaProject.controlers;

import com.emsi.pfaProject.repositories.IEtatRepository;
import com.emsi.pfaProject.repositories.IUtilisateurRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/utilisateurs/")
@CrossOrigin(origins = "http://localhost:4200")
public class UtilisateurControler {
	@Autowired
	private IUtilisateurRepository UtilisateurRepository;
}
