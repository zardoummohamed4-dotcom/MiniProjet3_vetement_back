package com.vetements.vetements_back.service;

import java.util.List;

import com.vetements.vetements_back.entities.Vetement;
import com.vetements.vetements_back.entities.Type;
public interface VetementService {

    Vetement saveVetement(Vetement v);

    Vetement updateVetement(Vetement v);

    void deleteVetement(Vetement v);

    void deleteVetementById(Long id);

    Vetement getVetement(Long id);

    List<Vetement> getAllVetements();

    List<Vetement> findByNomVetement(String nom);

    List<Vetement> findByNomVetementContains(String nom);

    List<Vetement> findByNomPrix(String nom, Double prix);

    List<Vetement> findByType(Type type);

    List<Vetement> findByTypeIdType(Long id);

    List<Vetement> findByOrderByNomVetementAsc();

    List<Vetement> trierVetementsNomsPrix();
}