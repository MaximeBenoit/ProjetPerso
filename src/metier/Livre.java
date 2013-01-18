/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package metier;

/**
 *
 * @author maxime
 */
public class Livre {
    private int id;
    private String auteur;
    private String titre;
    private boolean disponibilite;
    
    public Livre(String auteur, String titre){
        this.auteur=auteur;
        this.titre=titre;
        
    }

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }
    public String getAuteur() {
        return auteur;
    }

    /**
     * @param auteur the auteur to set
     */
    public void setAuteur(String auteur) {
        this.auteur = auteur;
    }

    /**
     * @return the titre
     */
    public String getTitre() {
        return titre;
    }

    /**
     * @param titre the titre to set
     */
    public void setTitre(String titre) {
        this.titre = titre;
    }

    /**
     * @return the disponibilite
     */
    public boolean isDisponibilite() {
        return disponibilite;
    }

    /**
     * @param disponibilite the disponibilite to set
     */
    public void setDisponibilite(boolean disponibilite) {
        this.disponibilite = disponibilite;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 19 * hash + this.id;
        hash = 19 * hash + (this.auteur != null ? this.auteur.hashCode() : 0);
        hash = 19 * hash + (this.titre != null ? this.titre.hashCode() : 0);
        return hash;
    }
 public boolean equals(Object o){
         boolean eq = false;
    if(o instanceof Livre){
        eq = (this.hashCode()==o.hashCode());
    }
    return eq;
    }
    
   
    @Override
    public String toString() {
        return "auteur: " + this.auteur + " titre : " + this.titre;

    }
}
