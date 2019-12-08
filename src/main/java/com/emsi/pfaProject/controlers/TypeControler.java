package com.emsi.pfaProject.controlers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.emsi.pfaProject.entities.Type;
import com.emsi.pfaProject.repositories.ITypeRepository;


@RestController
@RequestMapping(value = "/types/")
@CrossOrigin(origins = "http://localhost:4200")
public class TypeControler {
	@Autowired
	private ITypeRepository typeRepository;
	
	@PostMapping(value="new")
	public Type newType(@RequestBody Type type) {
		return typeRepository.save(type);
	}
	
	@GetMapping("all")
	private List<Type> getAll(){
		return typeRepository.findAll();
	}
}
