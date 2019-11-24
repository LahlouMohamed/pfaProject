package com.emsi.pfaProject.controlers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.emsi.pfaProject.repositories.ITypeRepository;

@RestController
@RequestMapping(value = "/types/")
@CrossOrigin(origins = "http://localhost:4200")
public class TypeControler {
	@Autowired
	private ITypeRepository typeRepository;
}
