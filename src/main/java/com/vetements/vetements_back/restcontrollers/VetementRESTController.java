package com.vetements.vetements_back.restcontrollers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vetements.vetements_back.entities.Vetement;
import com.vetements.vetements_back.service.VetementService;
import org.springframework.web.bind.annotation.PathVariable;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
@RestController
@RequestMapping("/api")
@CrossOrigin
public class VetementRESTController {

    @Autowired
    VetementService vetementService;

    @GetMapping()
    public List<Vetement> getAllVetements() {
        return vetementService.getAllVetements();
    }

     @GetMapping("/{id}")
    public Vetement getVetementById(@PathVariable("id") Long id) {
        return vetementService.getVetement(id);
    }
    @PostMapping()
    public Vetement createVetement(@RequestBody Vetement vetement) {
        return vetementService.saveVetement(vetement);
    }
     @PutMapping()
    public Vetement updateVetement(@RequestBody Vetement vetement) {
        return vetementService.updateVetement(vetement);
    }
    @DeleteMapping("/{id}")
    public void deleteVetement(@PathVariable("id") Long id) {
        vetementService.deleteVetementById(id);
    }
    @GetMapping("/vetstype/{idType}")
    public List<Vetement> getVetementsByTypeId(@PathVariable("idType") Long idType) {
        return vetementService.findByTypeIdType(idType);
    }
}