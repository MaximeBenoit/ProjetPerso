/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package metier;

import java.sql.ResultSet;
import java.util.List;
import metier.Emprunt;
import metier.Livre;

/**
 *
 * @author maxime
 */
public interface LivreService {
    public Livre newLivre(String auteur, String titre)throws Exception;
    public void add(Livre livre)throws Exception;
    public void remove(Livre livre)throws Exception;
    public void update(Livre livre)throws Exception;
    public Emprunt getByAuteur(String auteur)throws Exception;
    public List<Livre> getByTitre(String titre)throws Exception;
    public List<Livre> getByMotsClefs(List<String> motClefs)throws Exception;
    public List<Livre> getAll()throws Exception;
}
