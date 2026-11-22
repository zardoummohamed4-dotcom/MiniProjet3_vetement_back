package com.vetements.vetements_back.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.vetements.vetements_back.entities.Type;

@RepositoryRestResource(path = "types")
@CrossOrigin("http://localhost:4200/")
public interface TypeRepository extends JpaRepository<Type, Long> {
}