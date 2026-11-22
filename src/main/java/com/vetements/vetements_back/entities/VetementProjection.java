package com.vetements.vetements_back.entities;

import java.util.Date;

import org.springframework.data.rest.core.config.Projection;

@Projection(name = "vetementsType", types = { Vetement.class })
public interface VetementProjection {

    Long getIdVetement();

    String getNomVetement();

    Double getPrixVetement();

    String getTaille();

    String getCouleur();

    Date getDateCreation();

    Type getType();
}