/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ceti.bryantgamboa.tallermecanico;

/**
 *
 * @author DELL
 */
public class Camioneta extends Vehiculo {
     
    public Camioneta(){
        inicializarValores();
    }
    
    private void inicializarValores(){
        costoCambioBujia = 320;
        costoCambioCarburador = 4000;
        costoCambioLlanta = 300;
        costoLimpiezaCarburador = 500;
        costoAfinacion = 300;
        tipoVehiculo = "Camioneta";
        tiempoPromedioReparacion = 3;
    }
    
}
