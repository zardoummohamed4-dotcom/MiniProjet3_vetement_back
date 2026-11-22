package com.vetements.vetements_back.repos;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.vetements.vetements_back.entities.Type;
import com.vetements.vetements_back.entities.Vetement;
import org.springframework.web.bind.annotation.CrossOrigin;

@RepositoryRestResource(path = "rest")
@CrossOrigin("http://localhost:4200")
public interface VetementRepository extends JpaRepository<Vetement, Long> {
    List<Vetement> findByNomVetement(String nom);

    List<Vetement> findByNomVetementContains(String nom);

    @Query("select v from Vetement v where v.nomVetement like concat('%', :nom) and v.prixVetement > :prix")
    List<Vetement> findByNomPrix(@Param("nom") String nom, @Param("prix") Double prix);

    @Query("select v from Vetement v where v.type = ?1")
    List<Vetement> findByType(Type type);

    List<Vetement> findByTypeIdType(Long id);

    List<Vetement> findByOrderByNomVetementAsc();

    @Query("select v from Vetement v order by v.nomVetement ASC, v.prixVetement DESC")
    List<Vetement> trierVetementsNomsPrix();
}