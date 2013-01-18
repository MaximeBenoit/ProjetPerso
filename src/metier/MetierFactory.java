

package metier;

/**
 *
 * @author saturne
 */
public class MetierFactory {
private MetierFactory() {
    }
    public static AdherentService adherentSrv = new AdherentServiceImpl();
    public static LivreService livreSrv = new LivreServiceImpl();
    public static EmpruntService empruntSrv = new EmpruntServiceImpl();

    public static AdherentService getAdherentService() {
        return adherentSrv;
    }

    public static LivreService getLivreService() {
        return livreSrv;
    }

    public static EmpruntService getEmpruntService() {
        return empruntSrv;
    }
}
