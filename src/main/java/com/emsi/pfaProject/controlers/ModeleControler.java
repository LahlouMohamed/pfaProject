package com.emsi.pfaProject.controlers;

import com.emsi.pfaProject.entities.Model;
import com.emsi.pfaProject.repositories.IModelRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/modeles/")
@CrossOrigin(origins = "http://localhost:4200")
public class ModeleControler {
	@Autowired
	private IModelRepository modeleRepository;

	@GetMapping("/all")
	public Page<Model> findAll(@RequestParam("page") int page , @RequestParam("size")int size){
		Sort sort = Sort.by(new Sort.Order(Sort.Direction.ASC, "designation"));
		Pageable pageable = PageRequest.of(page, size, sort);
		return modeleRepository.findAll(pageable);
	}

	@PostMapping("/add")
	public Model add(@RequestBody Model model){
		return modeleRepository.save(model);
	}
}
