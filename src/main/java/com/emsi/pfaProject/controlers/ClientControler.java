package com.emsi.pfaProject.controlers;

import com.emsi.pfaProject.repositories.IClientRepository;
import com.emsi.pfaProject.repositories.IEtatRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/clients/")
@CrossOrigin(origins = "http://localhost:4200")
public class ClientControler {
	@Autowired
	private IClientRepository clientRepository;
}
