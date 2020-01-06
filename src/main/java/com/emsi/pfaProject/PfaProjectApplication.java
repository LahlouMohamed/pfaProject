package com.emsi.pfaProject;

import com.emsi.pfaProject.entities.Garagiste;
import com.emsi.pfaProject.entities.Marque;
import com.emsi.pfaProject.entities.Model;
import com.emsi.pfaProject.entities.Utilisateur;
import com.emsi.pfaProject.repositories.IGaragisteRepository;
import com.emsi.pfaProject.repositories.IMarqueRepository;
import com.emsi.pfaProject.repositories.IModelRepository;
import com.emsi.pfaProject.repositories.IUtilisateurRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Date;
import java.util.Random;

@SpringBootApplication
public class PfaProjectApplication implements ApplicationRunner {
    @Autowired
    private IMarqueRepository iMarqueRepository;
    @Autowired
    private IModelRepository iModelRepository;
    @Autowired
    private IGaragisteRepository iGaragisteRepository;

    public static void main(String[] args) {
        SpringApplication.run(PfaProjectApplication.class, args);
    }

    @Override
    public void run(ApplicationArguments args) throws Exception {
        // à décommenter pour auto insert Marque&Model de test (update application.properties)
    	this.insertMarquesModels();
    }

    public void insertMarquesModels() {
        Garagiste g1=new Garagiste("admin", "admin", null, null, null,
                null, 2, null, null);
        iGaragisteRepository.save(g1);
        Marque marque = new Marque();
        Model model = new Model();
        Random r = new Random();
        //Marque & Model insert
        for (int i = 1; i <= 8; i++) {
            marque.setDesignation("Voiture" + i);
            iMarqueRepository.saveAndFlush(marque);
            for (int j = 1; j <= 3; j++) {
                model.setMarque(marque);
                model.setDesignation("Mod" + j+" V"+i);
                model.setBoiteVitesse("Manuelle");
                model.setVersion("1.4HDI SPROTIUM");
                model.setPuissFiscal(r.nextInt(16) + 1);
                model.setEnergie("Diesel");
                iModelRepository.saveAndFlush(model);
                model = new Model();
            }
            marque = new Marque();

        }
        //Marque & Model insert
    }
}
