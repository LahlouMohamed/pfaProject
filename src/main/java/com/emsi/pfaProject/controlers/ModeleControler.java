package com.emsi.pfaProject.controlers;

import com.emsi.pfaProject.entities.Model;
import com.emsi.pfaProject.repositories.IModelRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/modeles/")
@CrossOrigin(origins = "http://localhost:4200")
public class ModeleControler {
	@Autowired
	private IModelRepository modeleRepository;

	@GetMapping("/all")
	public List<Model> findAll(){
		return modeleRepository.findAll();
	}

	@PostMapping("/add")
	public Model add(@RequestBody Model model){
		return modeleRepository.save(model);
	}
}
