package com.emsi.pfaProject.controlers;

import com.emsi.pfaProject.entities.Marque;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import com.emsi.pfaProject.repositories.IMarqueRepository;

import java.awt.*;
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

	@PostMapping("add")
	public Marque add(@RequestBody Marque marque){
		return marqueRepository.save(marque);
	}
}
