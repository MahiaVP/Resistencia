package Resistencia;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Resistencia {
    private JPanel mainPanel;
    private JComboBox<Colors>comboBox1B;
    private JComboBox<Colors>comboBox2B;
    private JComboBox<Colors>comboBox3B;
    private JComboBox<Colors>comboBox4B;
    private JComboBox<Colors>comboBox5B;
    private JCheckBox a5BandsCheckBox;
    private JLabel Total;
    private JLabel Max;
    private JLabel Min;

    public Resistencia(){
        comboBox1B.setModel(new DefaultComboBoxModel<>(Colors.values()));
        comboBox2B.setModel(new DefaultComboBoxModel<>(Colors.values()));
        comboBox3B.setModel(new DefaultComboBoxModel<>(Colors.values()));
        comboBox4B.setModel(new DefaultComboBoxModel<>(Colors.values()));
        comboBox4B.setModel(new DefaultComboBoxModel<>(Colors.values()));
        int v2=0,v3=0,v4=0;
        comboBox1B.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Colors selected= (Colors)comboBox1B.getSelectedItem();
                int v1=0;
                switch (selected){
                    case NEGRO -> v1=0;
                    case MARRON -> v1=1;
                    case ROJO -> v1=2;
                    case NARANJA -> v1=3;
                    case AMARILLO -> v1=4;
                    case VERDE -> v1=5;
                    case AZUL -> v1=6;
                    case VIOLETA -> v1=7;
                    case GRIS -> v1=8;
                    case BLANCO -> v1=9;
                }
                Total.setText(""+String.valueOf(v1));
            }
        });

    }

    public JPanel getMainPanel()
    {
        return mainPanel;
    }
}
