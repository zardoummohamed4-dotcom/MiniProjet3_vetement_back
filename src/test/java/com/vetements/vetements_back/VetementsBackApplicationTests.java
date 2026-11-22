package com.vetements.vetements_back;
import java.util.Date;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.vetements.vetements_back.entities.Type;
import com.vetements.vetements_back.entities.Vetement;
import com.vetements.vetements_back.repos.TypeRepository;
import com.vetements.vetements_back.repos.VetementRepository;

@SpringBootTest
class VetementsBackApplicationTests {

    @Autowired
    private VetementRepository vetementRepository;
    
    @Test
    public void testCreateVetement() {
        Vetement vet = new Vetement("T-shirt ", 80.0, "M", "Noir", new Date());
        vetementRepository.save(vet);
    }

    @Test
    public void testFindVetement() {
        Vetement v = vetementRepository.findById(1L).get();
        System.out.println(v);
    }

    @Test
    public void testUpdateVetement() {
        Vetement v = vetementRepository.findById(1L).get();
        v.setPrixVetement(100.0);
        vetementRepository.save(v);
    }

    @Test
    public void testDeleteVetement() {
        vetementRepository.deleteById(1L);
    }

    @Test
    public void testListerTousVetements() {
        List<Vetement> vets = vetementRepository.findAll();
        for (Vetement v : vets) {
            System.out.println(v);
        }
    }
        @Autowired
    private TypeRepository typeRepository;

    @Test
    public void testCreateVetementAvecType() {
        Type t = typeRepository.save(new Type(null, "T-shirt", null));
        Vetement v = new Vetement("Polo Lacoste", 120.0, "M", "Blanc", new Date());
        v.setType(t);
        vetementRepository.save(v);
    }
    @Test
    public void testFindByNomVetement() {
        List<Vetement> vets = vetementRepository.findByNomVetement("T-shirt ");
        for (Vetement v : vets) {
            System.out.println(v);
        }
    }

    @Test
    public void testFindByNomVetementContains() {
        List<Vetement> vets = vetementRepository.findByNomVetementContains("shirt");
        for (Vetement v : vets) {
            System.out.println(v);
        }
    }
        @Test
    public void testFindByNomPrix() {
        List<Vetement> vets = vetementRepository.findByNomPrix("shirt ", 50.0);
        for (Vetement v : vets) {
            System.out.println(v);
        }
    }
        @Test
    public void testFindByType() {
        Type t = new Type();
        t.setIdType(1L);
        List<Vetement> vets = vetementRepository.findByType(t);
        for (Vetement v : vets) {
            System.out.println(v);
        }
    }
     @Test
    public void testFindByTypeIdType() {
        List<Vetement> vets = vetementRepository.findByTypeIdType(1L);
        for (Vetement v : vets) {
            System.out.println(v);
        }
    }

    @Test
    public void testFindByOrderByNomVetementAsc() {
        List<Vetement> vets = vetementRepository.findByOrderByNomVetementAsc();
        for (Vetement v : vets) {
            System.out.println(v);
        }
    }
     @Test
    public void testTrierVetementsNomsPrix() {
        List<Vetement> vets = vetementRepository.trierVetementsNomsPrix();
        for (Vetement v : vets) {
            System.out.println(v);
        }
    }
}