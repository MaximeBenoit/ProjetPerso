/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package physique.data;

/**
 *
 * @author saturne
 */
public class PhysiqueFactory {

    public PhysiqueFactory() {
    }
    public static ServiceAdherent adherentSrv = new ServiceAdherentImpl();
    public static ServiceLivre livreSrv = new ServiceLivreImpl();
    public static ServiceEmprunt empruntSrv = new ServiceEmpruntImpl();

    public static ServiceAdherent getAdherentService() {
        return adherentSrv;
    }

    public static ServiceLivre getLivreService() {
        return livreSrv;
    }

    public static ServiceEmprunt getEmpruntService() {
        return empruntSrv;
    }
}
