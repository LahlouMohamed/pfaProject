package com.emsi.pfaProject.controlers;

import com.emsi.pfaProject.entities.Marque;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
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
	public Page<Marque> findAll(@RequestParam("page") int page , @RequestParam("size")int size){
		Sort sort = Sort.by(new Sort.Order(Sort.Direction.ASC, "designation"));
		Pageable pageable = PageRequest.of(page, size, sort);
		return marqueRepository.findAll(pageable);
	}

	@PostMapping("add")
	public Marque add(@RequestBody Marque marque){
		return marqueRepository.save(marque);
	}
}
