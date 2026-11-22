package com.vetements.vetements_back;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;

import com.vetements.vetements_back.entities.Type;
import com.vetements.vetements_back.entities.Vetement;
import org.springframework.web.bind.annotation.CrossOrigin;

@SpringBootApplication
public class VetementsBackApplication implements CommandLineRunner {

    @Autowired
    private RepositoryRestConfiguration repositoryRestConfiguration;

    public static void main(String[] args) {
        SpringApplication.run(VetementsBackApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        repositoryRestConfiguration.exposeIdsFor(Vetement.class, Type.class);
    }
}