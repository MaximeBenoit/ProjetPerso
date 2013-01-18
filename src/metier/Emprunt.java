/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package metier;

import java.util.Date;
import metier.Adherent;
import metier.Livre;

/**
 *
 * @author saturne
 */

public class Emprunt {
    private int id;
    private String dateEmprunt;
    private Livre Livre;
    private Adherent Adherent;
    private int idAdherent;
    private int  idLivre;
    /**
     * @return the id
     */
    public Emprunt(){}
     public Emprunt(Livre livre, Adherent adherent, String dateEmprunt){
        this.idAdherent=adherent.getId();
        this.idLivre=livre.getId();
        this.dateEmprunt= dateEmprunt;

     }

    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    public Livre getLivre() {
        return Livre;
    }
    public Adherent getAdherent(){
        return this.Adherent;
    }
    public String getDateEmprunt() {
        return this.dateEmprunt;
    }

    @Override
    public boolean equals(Object o) {
        boolean eq = false;
    if(o instanceof Emprunt){
        eq = (this.hashCode()==o.hashCode());
    }
    return eq;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 23 * hash + (this.getDateEmprunt() != null ? this.getDateEmprunt().hashCode() : 0);
        hash = 23 * hash + (this.getLivre() != null ? this.getLivre().hashCode() : 0);
        return hash;
    }

    

    
    @Override
    public String toString(){
        return "date :" +this.getDateEmprunt()+"Livre:"+this.getLivre();

    }

    /**
     * @param dateEmprunt the dateEmprunt to set
     */
    public void setDateEmprunt(String dateEmprunt) {
        this.dateEmprunt = dateEmprunt;
    }

    /**
     * @param Livre the Livre to set
     */
    public void setLivre(Livre Livre) {
        this.Livre = Livre;
    }

    /**
     * @param Adherent the Adherent to set
     */
    public void setAdherent(Adherent Adherent) {
        this.Adherent = Adherent;
    }

    /**
     * @return the idAdherent
     */
    public int getIdAdherent() {
        return idAdherent;
    }

    /**
     * @param idAdherent the idAdherent to set
     */
    public void setIdAdherent(int idAdherent) {
        this.idAdherent = idAdherent;
    }

    /**
     * @return the idLivre
     */
    public int getIdLivre() {
        return idLivre;
    }

    /**
     * @param idLivre the idLivre to set
     */
    public void setIdLivre(int idLivre) {
        this.idLivre = idLivre;
    }







}
