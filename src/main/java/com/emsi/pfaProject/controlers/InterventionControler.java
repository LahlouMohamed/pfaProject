package com.emsi.pfaProject.controlers;

import java.io.Serializable;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.web.bind.annotation.*;

import com.emsi.pfaProject.entities.Etat;
import com.emsi.pfaProject.entities.Intervention;
import com.emsi.pfaProject.repositories.IEtatRepository;
import com.emsi.pfaProject.repositories.IInterventionRepository;

@RestController
@RequestMapping(value = "/interventions/")
@CrossOrigin(origins = "http://localhost:4200")
public class InterventionControler implements Serializable{
	@Autowired
	private IInterventionRepository interventionRepository;
	
	@Autowired IEtatRepository etatRepository;
	
	@PostMapping(value="new")
	public Intervention newIntervention(@RequestBody Intervention intervention) {
		return interventionRepository.save(intervention);
	}

	@GetMapping("all")
	public List<Intervention> findAll(){
		return interventionRepository.findAll();
	}
	@PutMapping(value="update")
	public Intervention updateIntervention(@RequestBody Intervention intervention) {
		//etatRepository.save(intervention.getEtats())
		return interventionRepository.save(intervention);
	}
	
	@DeleteMapping(value="delete/{id}")
	public boolean deleteIntervention(@PathVariable Long id) {
		interventionRepository.deleteById(id);
		return true;
	}
	
	@PostMapping("/newEtat")
	public void newEtat(@RequestBody LinkedMultiValueMap<String, String> params) {
		
		/*long idEtat = Long.parseLong(params.getFirst("id_etat"));
		long idInterv = Long.parseLong(params.getFirst("id_interv"));
		System.out.println("---------"+idEtat+"----------");
		Intervention inter = interventionRepository.findById(idInterv).get();
		Etat etat = etatRepository.findById(idEtat).get();
		
		inter.getEtats().add(etat);
		interventionRepository.saveAndFlush(inter);*/
	}
}
