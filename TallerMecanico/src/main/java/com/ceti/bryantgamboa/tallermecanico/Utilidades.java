/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ceti.bryantgamboa.tallermecanico;

import javax.swing.JOptionPane;

/**
 *
 * @author Rumyn
 */
public class Utilidades {
    
    
    static void mensaje(String texto){
        JOptionPane.showMessageDialog(null, texto, "", 1);
    }
    
    static void mensajeFac(String texto){
        JOptionPane.showMessageDialog(null, texto, "FACTURA", 1);
    }
    
    static String leer(String pregunta){
        return JOptionPane.showInputDialog(pregunta);
    }
    /*static void numReparacion(int texto){
        return 
    }*/
    
}
