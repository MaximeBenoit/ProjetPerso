/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package physique.data;
import java.sql.Statement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import metier.Adherent;
import metier.Emprunt;
import metier.Livre;
import metier.EmpruntService;

/**
 *
 * @author saturne
 */
public class ServiceEmpruntImpl implements ServiceEmprunt {
    public Statement st=null;
    String nom;

    public void getStatment() throws Exception {
        //ConnectionService c = ConnectionService.getInstance("mysql", "localhost", "test", "org.gjt.mm.mysql.Driver", "root", "0107");
        ConnectionService c = ConnectionService.getInstance("mysql", "localhost", "test", "org.gjt.mm.mysql.Driver", "saturne", "titan");
        this.st = c.getStatement();
    }
   /* public Emprunt newEmprunt(ResultSet rs) throws Exception {
        Emprunt emprunt = null;
        int id = rs.getInt("idEmprunt");
        int Adherent = rs.getInt("idAdherent");
        int Livre = rs.getInt("idLivre");
        int Date=rs.getInt("date");
        //Boolean bibliothecaire = rs.getBoolean("bibliothecaire");
        //emprunt = new emprunt(idEmprunt, idAdherent, idLivre, date);
        //adherent.setId(id);
        return emprunt;

    }*/
    public void add(Emprunt emprunt)throws Exception{
        this.getStatment();
          String query = "INSERT INTO emprunt (idAdherent,idLivre,date) VALUES ('"
                + emprunt.getIdAdherent()
                + "','"
                + emprunt.getIdLivre()
                + "','"
                + emprunt.getDateEmprunt()
                + "')";
        System.out.println(query);

        st.executeUpdate(query);
    }

    public Emprunt newEmprunt(Livre livre, Adherent adherent) throws Exception {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public void remove(Emprunt emprunt) throws Exception {
        this.getStatment();
        String query = "DELETE FROM emprunt WHERE idadherent='" + emprunt.getIdAdherent()+"' AND livre='"+ emprunt.getIdLivre() + "'AND date'"+emprunt.getDateEmprunt()+"'";
        System.out.println(query);
        st.executeUpdate(query);
    }

    public void update(Emprunt emprunt) throws Exception {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public Emprunt getByld(long id) throws Exception {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public List<Emprunt> getByLivre(Livre livre) throws Exception {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public List<Emprunt> getByAdherent(Adherent adherent) throws Exception {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public List<Emprunt> getByDate(Date date) throws Exception {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public List<Emprunt> getAll() throws Exception {
        List<Emprunt> emprunts = new ArrayList<Emprunt>();
        this.getStatment();
        Emprunt emprunt = null;
        Adherent adherent=null;
        Livre livre=null;
        ResultSet rs = st.executeQuery("SELECT * FROM emprunt");
        while (rs.next()) {
            int idAdherent= rs.getInt("idAdherent");
            int idLivre =rs.getInt("idLivre");
            String date = rs.getString("date");
            adherent=new Adherent(null, null);
            livre=new Livre(null, null);

            adherent.setId(idAdherent);
            livre.setId(idLivre);
            emprunt=new Emprunt(livre, adherent, date);
            emprunts.add(emprunt);
    }
        return emprunts;

}
}
