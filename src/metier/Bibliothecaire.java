/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package metier;
import physique.data.ServiceAdherentImpl;
import java.awt.*;

/**
 *
 * @author maxime
 */
public class Bibliothecaire {
    private String mdp;
    private String login;
    
     public Bibliothecaire(String mdp,String login) throws Exception{
         this.mdp=mdp;
         this.login=login;
     }

    /**
     * @return the mdp
     */
    public String getMdp() {
        return mdp;
    }

    /**
     * @param mdp the mdp to set
     */
    public void setMdp(String mdp) {
        this.mdp = mdp;
    }

    /**
     * @return the login
     */
    public String getLogin() {
        return login;
    }

    /**
     * @param login the login to set
     */
    public void setLogin(String login) {
        this.login = login;
    }
    public String toString(){
        return "mdp: "+this.mdp+" login:  "+this.login;

    }
    
}
