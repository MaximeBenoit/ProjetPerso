package metier;



import java.sql.ResultSet;
import metier.Bibliotheque;
import java.util.List;
import metier.Adherent;
import metier.Adherent;
import metier.Adherent;



public interface AdherentService {
    public void add(Adherent adherent) throws Exception;
    public Adherent newAdherent(String prenom, String nom)throws Exception;
  //  public Bibliothecaire newBibliothecaire(String prenom, String nom,String mdp)throws Exception;
    public void remove(Adherent adherent)throws Exception;
    public void update(Adherent adherent)throws Exception;
    public Adherent getByld(int id)throws Exception;
    public List<Adherent> getByNom(String nom)throws Exception;
    public List<Adherent> getByPrenom(String nom)throws Exception;
    public List<Adherent> getAll()throws Exception;
    public Adherent getBiblio(String login, String mdp)throws Exception;
}
