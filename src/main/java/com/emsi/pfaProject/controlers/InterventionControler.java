package com.emsi.pfaProject.controlers;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.web.bind.annotation.*;

import com.emsi.pfaProject.entities.Etat;
import com.emsi.pfaProject.entities.Facture;
import com.emsi.pfaProject.entities.Intervention;
import com.emsi.pfaProject.repositories.IEtatRepository;
import com.emsi.pfaProject.repositories.IFactureRepository;
import com.emsi.pfaProject.repositories.IInterventionRepository;

@RestController
@RequestMapping(value = "/interventions/")
@CrossOrigin(origins = "http://localhost:4200")
public class InterventionControler implements Serializable{
	@Autowired
	private IInterventionRepository interventionRepository;
	
	@Autowired IEtatRepository etatRepository;
	@Autowired IFactureRepository factureRepository;
	
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
		/*System.out.println("-------------------");
		long idEtat = Long.parseLong(params.getFirst("id_etat"));
		long idInterv = Long.parseLong(params.getFirst("id_interv"));
		System.out.println("---------"+idEtat+"----------");
		Intervention inter = interventionRepository.findById(idInterv).get();
		Etat etat = etatRepository.findById(idEtat).get();
		
		inter.getEtats().add(etat);
		interventionRepository.saveAndFlush(inter);*/
	}
	@GetMapping("nbInterv")
	public ArrayList<Integer> getStatCorrel() {
		ArrayList<Intervention> interventions = (ArrayList<Intervention>)interventionRepository.findAll();
		ArrayList<Integer> nbInterventionsParMois = new ArrayList<Integer>();
		nbInterventionsParMois.add(0);
		for(int mois = 1; mois<=12; mois++) {
			nbInterventionsParMois.add(0);
			for(Intervention intervention : interventions) {
				if(mois == intervention.getDateDebut().getMonth()) {
					nbInterventionsParMois.set(mois, nbInterventionsParMois.get(mois)+1);
				}
			}
		}	
		nbInterventionsParMois.remove(nbInterventionsParMois.size()-1);
		return nbInterventionsParMois;
	}
	@GetMapping("beneficeParMois")
	public ArrayList<Double> getBeneficeParMois(){
		ArrayList<Facture> factures = (ArrayList<Facture>)factureRepository.findAll();
		ArrayList<Double> beneficeParMois = new ArrayList<Double>();
		beneficeParMois.add(0.0);
		for(int mois = 1; mois<=12; mois++) {
			beneficeParMois.add(0.0);
			for(Facture facture : factures) {
				if(mois == facture.getDate().getMonth()) {
					beneficeParMois.set(mois, (beneficeParMois.get(mois)+facture.getMontant())/1000);//divide per 1000 to get a clear correlation in chart
				}
			}
		}
		
		return beneficeParMois;
	}
}
