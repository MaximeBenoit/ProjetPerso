package client;

import java.awt.BorderLayout;

import javax.swing.*;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;
import java.awt.event.ActionEvent;
import java.util.Arrays;


public class AnnuaireAdherent extends JFrame {
    
    private ModeleModifiableAdherent modele1 = new ModeleModifiableAdherent();
    private JTable tableau1;
    private TableRowSorter<TableModel> sorter;

    public AnnuaireAdherent() {
        super();
        setSize(300, 300);
        setTitle("bibliotheque");
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        tableau1 = new JTable(modele1);

       
        tableau1.setRowSorter(sorter);

        getContentPane().add(new JScrollPane(tableau1), BorderLayout.CENTER);




    
    }

    public static void main(String[] args) {
        new AnnuaireAdherent().setVisible(true);
    }

   
    }

