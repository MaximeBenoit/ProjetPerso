/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package physique.data;

import java.util.List;
import metier.Adherent;

/**
 *
 * @author saturne
 */
public interface ServiceAdherent {

    public Adherent newAdherent(String prenom, String nom) throws Exception;

    public void add(Adherent adherent) throws Exception;

    public void remove(Adherent adherent) throws Exception;

    public void update(Adherent adherent) throws Exception;

    public List<Adherent> getByNom(String nom) throws Exception;

    public List<Adherent> getByPrenom(String prenom) throws Exception;

    public List<Adherent> getAll() throws Exception;

    public Adherent getByld(int id) throws Exception;

    public Adherent getBiblio (String login, String mdp)throws Exception;
}
