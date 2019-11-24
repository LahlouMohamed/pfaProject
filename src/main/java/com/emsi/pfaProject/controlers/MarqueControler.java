package com.emsi.pfaProject.controlers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.emsi.pfaProject.repositories.IMarqueRepository;

@RestController
@RequestMapping(value = "/marques/")
@CrossOrigin(origins = "http://localhost:4200")
public class MarqueControler {
	@Autowired
	private IMarqueRepository marqueRepository;
}
