package com.emsi.pfaProject.controlers;

import com.emsi.pfaProject.entities.Marque;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.emsi.pfaProject.repositories.IMarqueRepository;

import java.util.List;

@RestController
@RequestMapping(value = "/marques/")
@CrossOrigin(origins = "http://localhost:4200")
public class MarqueControler {
	@Autowired
	private IMarqueRepository marqueRepository;

	@GetMapping("/all")
	public List<Marque> findAll(){
		return marqueRepository.findAll();
	}
}
