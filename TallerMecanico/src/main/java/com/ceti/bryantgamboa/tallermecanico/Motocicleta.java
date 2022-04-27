/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ceti.bryantgamboa.tallermecanico;

/**
 *
 * @author DELL
 */
public class Motocicleta extends Vehiculo{
    
    public Motocicleta(){
        inicializarValores();
    }
    
    private void inicializarValores(){
        costoCambioBujia = 200;
        costoCambioCarburador = 1000;
        costoCambioLlanta = 200;
        costoLimpiezaCarburador = 350;
        costoAfinacion = 300;
        tipoVehiculo = "Motocicleta";
        tiempoPromedioReparacion = 1;
    }
    
    
    
    
}
