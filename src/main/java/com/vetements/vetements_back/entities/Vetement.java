package com.vetements.vetements_back.entities;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
public class Vetement {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idVetement;
    private String nomVetement;
    private Double prixVetement;
    private String taille;
    private String couleur;
    private Date dateCreation;

    @ManyToOne
    private Type type;

    public Vetement() {
        super();
    }

    public Vetement(String nomVetement, Double prixVetement, String taille, String couleur, Date dateCreation) {
        super();
        this.nomVetement = nomVetement;
        this.prixVetement = prixVetement;
        this.taille = taille;
        this.couleur = couleur;
        this.dateCreation = dateCreation;
    }

    public Long getIdVetement() {
        return idVetement;
    }

    public void setIdVetement(Long idVetement) {
        this.idVetement = idVetement;
    }

    public String getNomVetement() {
        return nomVetement;
    }

    public void setNomVetement(String nomVetement) {
        this.nomVetement = nomVetement;
    }

    public Double getPrixVetement() {
        return prixVetement;
    }       

    public void setPrixVetement(Double prixVetement) {
        this.prixVetement = prixVetement;
    }

    public String getTaille() {
        return taille;
    }

    public void setTaille(String taille) {
        this.taille = taille;
    }

    public String getCouleur() {
        return couleur;
    }

    public void setCouleur(String couleur) {
        this.couleur = couleur;
    }

    public Date getDateCreation() {
        return dateCreation;
    }

    public void setDateCreation(Date dateCreation) {
        this.dateCreation = dateCreation;
    }
    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Vetement [idVetement=" + idVetement + ", nomVetement=" + nomVetement
                + ", prixVetement=" + prixVetement + ", taille=" + taille
                + ", couleur=" + couleur + ", dateCreation=" + dateCreation + "]";
    }
}
