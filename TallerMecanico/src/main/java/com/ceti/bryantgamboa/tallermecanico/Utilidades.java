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
        JOptionPane.showMessageDialog(null, texto, "Atencion", 1);
    }
    
    static String leer(String pregunta){
        return JOptionPane.showInputDialog(pregunta);
    }
}
