/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package metier;

import metier.Adherent;
import metier.Livre;

/**
 *
 * @author saturne
 */
public class Bibliotheque {
public void emprunter(Livre livre, Adherent adherent){
        return;
    }
public boolean rendre(Livre livre, Adherent adherent){
        return true;
    }
public Bibliotheque authentifier(Livre livre, Adherent adherent){
        return this.authentifier(livre, adherent);
    }
public void deconnecter(){
        return;
    }
}
