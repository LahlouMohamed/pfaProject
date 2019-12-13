package com.emsi.pfaProject;

import com.emsi.pfaProject.entities.Marque;
import com.emsi.pfaProject.entities.Model;
import com.emsi.pfaProject.repositories.IMarqueRepository;
import com.emsi.pfaProject.repositories.IModelRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(exclude = {
		org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration.class}
)
public class PfaProjectApplication implements ApplicationRunner {
	@Autowired
	private IMarqueRepository iMarqueRepository;
	@Autowired
	private IModelRepository iModelRepository;
	public static void main(String[] args) {
		SpringApplication.run(PfaProjectApplication.class, args);
	}

	@Override
	public void run(ApplicationArguments args) throws Exception {
		this.insertMarquesModels();
	}

	public void insertMarquesModels(){
		Marque marque=new Marque();
		Model model=new Model();

		//Marque & Model insert
		marque.setDesignation("Peugeot");
		iMarqueRepository.saveAndFlush(marque);
		model.setMarque(marque);model.setDesignation("207");
		model.setBoiteVitesse("M");model.setVersion("1.4HDI SPROTIUM");
		model.setPuissFiscal(7);model.setEnergie("Diesel");
		iModelRepository.saveAndFlush(model);
		//Marque & Model insert
		marque=new Marque();
		model=new Model();
		//Marque & Model insert
		marque.setDesignation("BMW");
		iMarqueRepository.saveAndFlush(marque);
		model.setMarque(marque);model.setDesignation("114");
		model.setBoiteVitesse("A");model.setVersion("2.0");
		model.setPuissFiscal(9);model.setEnergie("Diesel");
		iModelRepository.saveAndFlush(model);
		//Marque & Model insert
	}
}
