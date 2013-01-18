/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package metier;

import java.util.List;
import physique.data.PhysiqueFactory;
import physique.data.ServiceAdherent;

/**
 *
 * @author saturne
 */
public class AdherentServiceImpl implements AdherentService {
    
    private ServiceAdherent adherentsrv= PhysiqueFactory.getAdherentService();

    public void add(Adherent adherent) throws Exception {
        adherentsrv.add(adherent);
        
    }

    public Adherent newAdherent(String prenom, String nom) throws Exception {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public void remove(Adherent adherent) throws Exception {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public void update(Adherent adherent) throws Exception {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public Adherent getByld(int id) throws Exception {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public List<Adherent> getByNom(String nom) throws Exception {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public List<Adherent> getByPrenom(String nom) throws Exception {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public List<Adherent> getAll() throws Exception {
        List<Adherent> a =null;
        return a;
    }

    public Adherent getBiblio(String login, String mdp) throws Exception {
        return(adherentsrv.getBiblio(login, mdp));
    }

}
