package client;

import javax.swing.table.AbstractTableModel;
import java.util.ArrayList;
import java.util.List;
import metier.Adherent;
import physique.data.ServiceAdherentImpl;

public class ModeleModifiableAdherent extends AbstractTableModel {
    //private AdherentService amiSrv = physique.data.PhysiqueDataFactory.getAmiService();
    private List<Adherent> amis = new ArrayList<Adherent>();
    private final String[] entetes = {"id","nom", "prenom"};
    private ServiceAdherentImpl implSrv =new ServiceAdherentImpl();
    public ModeleModifiableAdherent() {
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
                return amis.get(rowIndex).getId();
            case 1:
                return amis.get(rowIndex).getNom();

            case 2:
                 return amis.get(rowIndex).getPrenom();
            default:
                return null; //Ne devrait jamais arriver
        }
    }
}
