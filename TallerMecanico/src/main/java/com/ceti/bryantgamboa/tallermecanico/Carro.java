/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ceti.bryantgamboa.tallermecanico;

/**
 *
 * @author Rumyn
 */
public class Carro extends Vehiculo {
    
    public Carro(){
        inicializarValores();
    }
    
    private void inicializarValores(){
        costoCambioBujia = 200;
        costoCambioCarburador = 3500;
        costoCambioLlanta = 200;
        costoLimpiezaCarburador = 350;
        costoAfinacion = 300;
        tipoVehiculo = "Carro";
        tiempoPromedioReparacion = 2;
    }
    
    public void asignarPropietario(String nombrePropietario){
        this.nombrePropietario = nombrePropietario;
        
    }
    

}
