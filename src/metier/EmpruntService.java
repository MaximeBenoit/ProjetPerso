/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package metier;

import java.util.Date;
import java.util.List;
import metier.Adherent;
import metier.Adherent;
import metier.Adherent;
import metier.Emprunt;
import metier.Emprunt;
import metier.Emprunt;
import metier.Livre;
import metier.Livre;
import metier.Livre;


/**
 *
 * @author saturne
 */
public interface EmpruntService {
    public Emprunt newEmprunt(Livre livre, Adherent adherent)throws Exception;
    public void add(Emprunt emprunt)throws Exception;
    public void remove(Emprunt emprunt)throws Exception;
    public void update(Emprunt emprunt)throws Exception;
    public Emprunt getByld(long id)throws Exception;
    public List<Emprunt> getByLivre(Livre livre)throws Exception;
    public List<Emprunt> getByAdherent(Adherent adherent)throws Exception;
    public List<Emprunt> getByDate(Date date)throws Exception;
    public List<Emprunt> getAll()throws Exception;
    }


