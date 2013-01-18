/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package physique.data;

import java.sql.Statement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import metier.Adherent;
import physique.data.ServiceAdherent;

/**
 *
 * @author maxime
 */
public class ServiceAdherentImpl implements ServiceAdherent {

    public Statement st=null;
    String nom;

    public void getStatment() throws Exception {
        ConnectionService c = ConnectionService.getInstance("mysql", "localhost", "test", "org.gjt.mm.mysql.Driver", "root", "0107");
       // ConnectionService c = ConnectionService.getInstance("mysql", "localhost", "test", "org.gjt.mm.mysql.Driver", "saturne", "titan");
        this.st = c.getStatement();
    }

    public Adherent newAdherent(String prenom, String nom) throws Exception {
        Adherent adherent = null;
        //int id = rs.getInt("idadherent");
        //String prenom = rs.getString("prenom");
        //String nom = rs.getString("nom");
        //Boolean bibliothecaire = rs.getBoolean("bibliothecaire");
        adherent = new Adherent(nom, prenom);
        //adherent.setId(id);
        return adherent;
    }

    public void add(Adherent adherent) throws Exception {
        this.getStatment();

        String query = "INSERT INTO adherent (prenom,nom,login,mdp,discriminant) VALUES ('"
                + adherent.getPrenom()
                + "','"
                + adherent.getNom()
                +"','"
                +"0,0,a"
                + "')";
        System.out.println(query);

        st.executeUpdate(query);

    }

    /*
     * public Bibliothecaire newBibliothecaire(String prenom, String nom, String
     * mdp) throws Exception { throw new UnsupportedOperationException("Not
     * supported yet.");
    }
     */
    public void remove(Adherent adherent) throws Exception {
        this.getStatment();
        String query = "DELETE FROM adherent WHERE nom='" + adherent.getNom()+"' AND prenom='"+ adherent.getPrenom() + "'";
        System.out.println(query);
        st.executeUpdate(query);

    }

    public void update(Adherent adherent) throws Exception {
        this.getStatment();
        String query = "UPDATE adherent SET nom='"+ adherent.getNom()+"'AND prenom='"+adherent.getPrenom()+"'";
        System.out.println(query);
        st.executeUpdate(query);


    }

    /*
     * public List<Adherent> getByld(int id) throws Exception { List<Adherent>
     * adherents=new ArrayList<Adherent>(); this.getstatment(); Adherent
     * adherent=null; ResultSet rs=st.executeQuery("SELECT * FROM adherent WHERE
     * id ='"+ id +"'"); while (rs.next()) { adherent = this.newAdherent(rs);
     * adherents.add(adherent); } return adherents;
    }
     */
    public List<Adherent> getByNom(String nom) throws Exception {
        List<Adherent> adherents = new ArrayList<Adherent>();
        this.getStatment();
        Adherent adherent = null;
        ResultSet rs = st.executeQuery("SELECT * FROM adherent WHERE nom ='" + nom + "'");
        while (rs.next()) {
            adherent = this.newAdherent(rs.getString("prenom"),rs.getString("nom"));
            adherents.add(adherent);
        }
        return adherents;
    }

    public List<Adherent> getByPrenom(String prenom) throws Exception {
        List<Adherent> adherents = new ArrayList<Adherent>();
        this.getStatment();
        Adherent adherent = null;
        ResultSet rs = st.executeQuery("SELECT * FROM ami WHERE prenom ='" + prenom + "'");
        while (rs.next()) {
           adherent = this.newAdherent(rs.getString("nom"),rs.getString("prenom"));
            adherents.add(adherent);
        }
        return adherents;
    }

    public List<Adherent> getAll() throws Exception {
        List<Adherent> adherents = new ArrayList<Adherent>();
        this.getStatment();
        Adherent adherent = null;
        ResultSet rs = st.executeQuery("SELECT * FROM adherent");
        while (rs.next()) {
            String nom= rs.getString("nom");
            String prenom =rs.getString("prenom");
            int id=rs.getInt("idadherent");
            adherent= new Adherent(nom, prenom);
            adherent.setId(id);
            adherents.add(adherent);
        }
        return adherents;
    }

    /*
     * public Bibliothecaire newBibliothecaire(String prenom, String nom, String
     * mdp) throws Exception { throw new UnsupportedOperationException("Not
     * supported yet."); }
     */
    public Adherent getByld(int id) throws Exception {
        throw new UnsupportedOperationException("Not supported yet.");
    }

        public Adherent getBiblio(String login, String mdp) throws Exception {
        //List<Adherent> adherents = new ArrayList<Adherent>();
        this.getStatment();
        Adherent adherent = null;
        ResultSet rs = st.executeQuery("SELECT * FROM adherent WHERE login ='" + login +"' AND mdp='"+ mdp +"'");
        while (rs.next()) {
           adherent = this.newAdherent(rs.getString("nom"),rs.getString("prenom"));
            //adherents.add(adherent);
        }
       return adherent;
        }
}
