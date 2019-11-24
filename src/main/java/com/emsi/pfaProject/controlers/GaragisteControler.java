package com.emsi.pfaProject.controlers;

import com.emsi.pfaProject.repositories.IEtatRepository;
import com.emsi.pfaProject.repositories.IGaragisteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/garagistes/")
@CrossOrigin(origins = "http://localhost:4200")
public class GaragisteControler {
	@Autowired
	private IGaragisteRepository garagisteRepository;
}
