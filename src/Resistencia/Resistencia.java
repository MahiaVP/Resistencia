package Resistencia;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;

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
    private JLabel maxi;

    public Resistencia(){
        comboBox1B.setModel(new DefaultComboBoxModel<>(Colors.values()));
        comboBox2B.setModel(new DefaultComboBoxModel<>(Colors.values()));
        comboBox3B.setModel(new DefaultComboBoxModel<>(Colors.values()));
        comboBox4B.setModel(new DefaultComboBoxModel<>(Colors.values()));
        comboBox4B.setModel(new DefaultComboBoxModel<>(Colors.values()));

        final int[] v1 = new int[4];
        final String[] v2 = new String[1];
        v2[0]="";
        final int[] n = new int[1];
        comboBox1B.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Colors selected= (Colors)comboBox1B.getSelectedItem();
                switch (selected){
                    case NEGRO -> v1[0]=0;
                    case MARRON -> v1[0]=1;
                    case ROJO -> v1[0]=2;
                    case NARANJA -> v1[0]=3;
                    case AMARILLO -> v1[0]=4;
                    case VERDE -> v1[0]=5;
                    case AZUL -> v1[0]=6;
                    case VIOLETA -> v1[0]=7;
                    case GRIS -> v1[0] =8;
                    case BLANCO -> v1[0]=9;
                }

                Total.setText(String.valueOf(v1[0])+String.valueOf(v1[1])+String.valueOf(v2[0]));
            }
        });

        comboBox2B.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Colors selected= (Colors)comboBox2B.getSelectedItem();
                switch (selected){
                    case NEGRO -> v1[1]=0;
                    case MARRON ->v1[1]=1;
                    case ROJO -> v1[1]=2;
                    case NARANJA -> v1[1]=3;
                    case AMARILLO ->v1[1]=4;
                    case VERDE -> v1[1]=5;
                    case AZUL -> v1[1]=6;
                    case VIOLETA -> v1[1]=7;
                    case GRIS -> v1[1]=8;
                    case BLANCO -> v1[1]=9;
                }
                Total.setText(String.valueOf(v1[0])+String.valueOf(v1[1])+String.valueOf(v2[0]));
            }
        });
        comboBox3B.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Colors selected= (Colors)comboBox3B.getSelectedItem();
                switch (selected){
                    case NEGRO -> v2[0]="";
                    case MARRON ->v2[0]="0";
                    case ROJO -> v2[0]="00";
                    case NARANJA -> v2[0]="k";
                    case AMARILLO ->v2[0]="0k";
                    case VERDE -> v2[0]="00k";
                    case AZUL -> v2[0]="M";
                    case VIOLETA -> v2[0]="0M";
                    case GRIS -> v2[0]="00M";
                    case BLANCO -> v2[0]="G";
                }
                Total.setText(String.valueOf(v1[0])+String.valueOf(v1[1])+String.valueOf(v2[0]));
            }
        });
        comboBox4B.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String num = String.valueOf(v1[0])+String.valueOf(v1[1])+v2[0];
                Colors selected= (Colors)comboBox4B.getSelectedItem();
                switch (selected){
                    case NEGRO -> v2[0]="0";
                    case MARRON -> n[0] =Integer.parseInt(num);
                    case ROJO -> v2[0]="00";
                    case NARANJA -> v2[0]="k";
                    case AMARILLO ->v2[0]="0k";
                    case VERDE -> v2[0]="00k";
                    case AZUL -> v2[0]="M";
                    case VIOLETA -> v2[0]="0M";
                    case GRIS -> v2[0]="00M";
                    case BLANCO -> v2[0]="G";
                }
                maxi.setText(String.valueOf(n));
            }
        });
    }

    public JPanel getMainPanel()
    {
        return mainPanel;
    }
}
