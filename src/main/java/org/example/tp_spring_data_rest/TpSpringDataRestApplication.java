package org.example.tp_spring_data_rest;

import org.example.tp_spring_data_rest.Repositories.EtudiantRepository;
import org.example.tp_spring_data_rest.enums.Genre;
import org.example.tp_spring_data_rest.model.Etudiant;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TpSpringDataRestApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(TpSpringDataRestApplication.class, args);
    }

    @Autowired
    EtudiantRepository etudiantRepository;

    @Override
    public void run(String... args) throws Exception {
        Etudiant et1 = Etudiant.builder()
                .nom("Adnani")
                .prenom("Morad")
                .genre(Genre.Homme)
                .build();
        etudiantRepository.save(et1);
        Etudiant et2 = Etudiant.builder()
                .nom("ahmed")
                .prenom("ahmed")
                .genre(Genre.Homme)
                .build();
        etudiantRepository.save(et2);
    }
}

