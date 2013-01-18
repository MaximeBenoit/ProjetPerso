package client;

import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.*;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;
import java.awt.event.ActionEvent;
import java.util.Arrays;


public class AnnuaireLivre extends JFrame {
    
    private ModeleModifiableLivre modele = new ModeleModifiableLivre();
    private JTable tableau;
    private TableRowSorter<TableModel> sorter;

    public AnnuaireLivre() {
        super();
        setSize(300, 300);
        setTitle("bibliotheque");
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        tableau = new JTable(modele);

       
        tableau.setRowSorter(sorter);

        getContentPane().add(new JScrollPane(tableau), BorderLayout.CENTER);
    }

    public static void main(String[] args) {
        new AnnuaireLivre().setVisible(true);
    }

   
    }

