/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ceti.bryantgamboa.tallermecanico;

/**
 *
 * @author Rumyn
 */
public class Menu {
    
    String nombre, tVehiculo;
    int tipoV;
    public Menu(){
        iniciarMenu();
    }
    
    private void iniciarMenu(){
        pedirDatos();
        mostrarReparaciones(tipoV);
    }
    
    private void pedirDatos(){
        boolean correcto = true;
        do{
            Utilidades.mensaje("Bienvenido al taller Ramirez");
            nombre = Utilidades.leer("Por favor ingrese su nombre");
            tVehiculo = Utilidades.leer("Por favor ingrese el tipo de vehiculo: Carro, Camioneta, Motocicleta");
            switch(tVehiculo){

                case "Carro":
                    tipoV = 0;
                    correcto = false;
                break;

                case "Camioneta":
                    tipoV = 1;
                    correcto = false;
                break;

                case "Motocicleta":
                    tipoV = 2;
                    correcto = false;
                break;

                default:
                    Utilidades.mensaje("Porfavor, introduce un vehiculo correcto");
                    correcto = true;
                break;    
            }
        } while (correcto);
    } 
    
    private void mostrarReparaciones(int tipoVehiculo){
        switch(tipoVehiculo){
            
            case 0:
                Carro carro = new Carro();
                carro.nombrePropietario = nombre;
            break;
            
            case 1:
            break;
            
            case 2:
            break;
            
        }
    }
    
    
}
