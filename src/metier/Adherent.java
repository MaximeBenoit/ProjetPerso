/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package metier;

import physique.data.ServiceAdherentImpl;
import java.awt.*;

/**
 *
 * @author saturne
 */
public class Adherent {

    private int id;
    private String nom;
    private String prenom;
    private ServiceAdherentImpl impl;

    /**
     * @return the id
     */
    public Adherent(String nom, String prenom) throws Exception {
        this.nom = nom;
        this.prenom = prenom;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }

    @Override
    public String toString() {
        return "nom: " + this.nom + " prenom : " + this.prenom;

    }

    @Override
    public boolean equals(Object o) {
        boolean eq = false;
        if (o instanceof Adherent) {
            eq = (this.hashCode() == o.hashCode());
        }
        return eq;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 59 * hash + this.id;
        hash = 59 * hash + (this.nom != null ? this.nom.hashCode() : 0);
        hash = 59 * hash + (this.prenom != null ? this.prenom.hashCode() : 0);
        return hash;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }
}
