package com.programacion;

import javax.swing.*;

public class Nota {

    public void amosarProbasEscritas(){
        float probasEscrita1,probasEscrita2;
        float probaEscrita;
        float calificacion= (float) 0.4;
        probasEscrita1 = (float) Integer.parseInt(JOptionPane.showInputDialog("Introduce la nota del primer examen teórico"));
        probasEscrita2 = (float) Integer.parseInt(JOptionPane.showInputDialog("Introduce la nota del segundo examen teórico"));
        probaEscrita = (((probasEscrita1+probasEscrita2)/2)*calificacion);
        JOptionPane.showMessageDialog(null, " Tienes un " + probaEscrita + " en las pruebas escritas");
    }
    public void amosarProbaPractica(){
        float probaPracticaNota;
        float probraPractica;
        float calificacion = (float) 0.4;
        probaPracticaNota = (float) Integer.parseInt(JOptionPane.showInputDialog(" Introduce la nota del examen práctico"));
        probraPractica = probaPracticaNota*calificacion;
        JOptionPane.showMessageDialog(null, " Tienes un " + probraPractica + " en la prueba práctica");
    }
    public void amosarBoletines(){
        int puntos;
        float boletines;
        boletines = (float) Integer.parseInt(JOptionPane.showInputDialog(" Introduces el porcentaje de boletines que tienes"));
        if ( boletines >90 ){
            JOptionPane.showMessageDialog(null, " Tienes " + (puntos=2) + " puntos ");
        }
        else if ( boletines>70 & boletines<90){
            JOptionPane.showMessageDialog(null, " Tienes " + (puntos=1) + " puntos ");
        }
        else if ( boletines < 70){
            JOptionPane.showMessageDialog(null, "Tines " + (puntos=0) + " puntos");
        }

    }
    public void amosarNotaTotal(){

    }




}
