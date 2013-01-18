package client;


import javax.swing.table.AbstractTableModel;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;
import metier.Livre;
import metier.LivreService;
import physique.data.ServiceLivreImpl;

public class ModeleModifiableLivre extends AbstractTableModel {
    //private AdherentService amiSrv = physique.data.PhysiqueDataFactory.getAmiService();
    private List<Livre> amis = new ArrayList<Livre>();
    private final String[] entetes = {"auteur", "titre"};
    private ServiceLivreImpl implSrv =new ServiceLivreImpl();
    public ModeleModifiableLivre() {
        super();
        try {
             
             
            this.amis = implSrv.getAll();
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }

    @Override
    public int getRowCount() {
        return amis.size();
    }

    @Override
    public int getColumnCount() {
        return entetes.length;
    }

    @Override
    public String getColumnName(int columnIndex) {
        return entetes[columnIndex];
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        switch (columnIndex) {
            case 0:
                return amis.get(rowIndex).getAuteur();
            case 1:
                return amis.get(rowIndex).getTitre();
            default:
                return null; //Ne devrait jamais arriver
        }
    }
}


    
   

    /*@Override
    public void setValueAt(Object aValue, int rowIndex, int columnIndex) {
        if (aValue != null) {
            Adherent adherent = amis.get(rowIndex);

            switch (columnIndex) {
                case 0:
                    return adherent.setPrenom((String) aValue);
                    break;
                case 1:
                    adherent.setNom((String) aValue);
                    break;
                
            }

            try {
                adherentSrv.update(adherent);
            } catch (Exception ex) {
                System.out.println(ex.getMessage());
            }
        }
    }

    public void addAmi(Adherent adherent) {        
        try {
            // ajout dans BDD
            this.adhernetSrv.add(adherent);
            this.amis.add(adherent);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }

        // mise a jour table
        fireTableRowsInserted(this.amis.size() - 1, this.amis.size() - 1);
    }

    public Adherent removeAdherent(int rowIndex) {
        Adherent adherent = this.amis.get(rowIndex);
        try {
            // suppression dans BDD
            this.adherentSrv.remove(adherent);
            this.amis.remove(adherent);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }

        // mise a jour table
        fireTableRowsDeleted(rowIndex, rowIndex);

        return adherent;
    }

    public void getBy(String criteria, Object value) throws Exception {
        if ("nom".equals(criteria)) {
            this.amis = this.adherentSrv.getByNom((String)value);
        }

        if ("prenom".equals(criteria)) {
            this.amis = this.adherentSrv.getByPrenom((String)value);
        }

       
        
        // mise a jour table
        this.fireTableDataChanged();
    }
}*/