/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package physique.data;

import metier.LivreService;
import java.sql.Statement;

/**
 *
 * @author maxime
 */

import java.sql.Statement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import metier.Adherent;
import metier.Emprunt;
import metier.Livre;
import client.test;
import metier.LivreService;

/**
 *
 * @author maxime
 */
public class ServiceLivreImpl implements ServiceLivre {

    public Statement st;
    String nom;
    

    public void getStatment() throws Exception {
        //ConnectionService c = ConnectionService.getInstance("mysql", "localhost", "test", "org.gjt.mm.mysql.Driver", "root", "0107");
        ConnectionService c = ConnectionService.getInstance("mysql", "localhost", "test", "org.gjt.mm.mysql.Driver", "saturne", "titan");
        this.st = c.getStatement();
    }

    public Livre newLivre(String auteur,String titre) throws Exception {
        Livre livre = null;
        //int id = rs.getInt("idLivre");
       // String auteur = rs.getString("auteur");
       // String titre = rs.getString("titre");
        //Boolean bibliothecaire = rs.getBoolean("bibliothecaire");
        livre = new Livre(auteur, titre);
        //adherent.setId(id);
        return livre;
    }

    public void add(Livre livre) throws Exception {
        this.getStatment();

        String query = "INSERT INTO livre (auteur,titre) VALUES ('"
                + livre.getAuteur()
                + "','"
                + livre.getTitre()
                + "')";
        System.out.println(query);

        st.executeUpdate(query);
    }

    public void remove(Livre livre) throws Exception {
             this.getStatment();
        String query = "DELETE FROM livre WHERE auteur='" + livre.getAuteur()+"' AND titre='"+ livre.getTitre() + "'";
        System.out.println(query);
        st.executeUpdate(query);
    }

    public void update(Livre livre) throws Exception {
        
    }

    public Emprunt getByAuteur(String auteur) throws Exception {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public List<Livre> getByTitre(String titre) throws Exception {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public List<Livre> getByMotsClefs(List<String> motClefs) throws Exception {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public List<Livre> getAll() throws Exception {  
        List<Livre> livres = new ArrayList<Livre>();
        this.getStatment();
        Livre livre ;
        ResultSet rs = st.executeQuery("SELECT * FROM livre");
        while (rs.next()) {
            String auteur =rs.getString("auteur");
            String titre =rs.getString("titre");
            int id =rs.getInt("idlivre");
            livre=new Livre(auteur, titre);
            livre.setId(id);
            livres.add(livre);
        }
        return livres;
    }
  
    
}
