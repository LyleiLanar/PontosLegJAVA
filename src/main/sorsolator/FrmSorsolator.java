package main.sorsolator;

import javax.swing.*;

public class FrmSorsolator extends JFrame{

    private Sorsolator sorsolator;
    private JTextField txtNevek;
    private JButton btnGetList;

    public FrmSorsolator() {
        sorsolator = new Sorsolator();
    }

    public Sorsolator getSorsolator() {
        return sorsolator;
    }
}

/*
        int ertek = metódus();
 */


