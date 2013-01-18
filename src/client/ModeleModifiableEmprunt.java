package client;

import javax.swing.table.AbstractTableModel;
import java.util.ArrayList;
import java.util.List;

import metier.Emprunt;

import physique.data.ServiceEmpruntImpl;

public class ModeleModifiableEmprunt extends AbstractTableModel {
    //private AdherentService amiSrv = physique.data.PhysiqueDataFactory.getAmiService();
    private List<Emprunt> amis = new ArrayList<Emprunt>();
    private final String[] entetes = {"idlivre", "idadherent","date"};
    private ServiceEmpruntImpl implSrv =new ServiceEmpruntImpl();
    public ModeleModifiableEmprunt() {
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
                return amis.get(rowIndex).getIdAdherent();
            case 1:
                return amis.get(rowIndex).getIdLivre();
            case 2:
                return amis.get(rowIndex).getDateEmprunt();
            default:
                return null; //Ne devrait jamais arriver
        }
    }
}
