
package com.ceti.bryantgamboa.tallermecanico;

import javax.swing.JOptionPane;


public class Menu {
    
    String nombre, tVehiculo;
    int tipoV, reparacion, a;
    float costo=0;
    public Menu(){
        iniciarMenu();
    }
    
    private void iniciarMenu(){
        pedirDatos();
        mostrarReparaciones(tipoV);
        
    }
    
    private void pedirDatos(){
        boolean correcto = true;
        Utilidades.mensaje("Bienvenido al taller Ramirez");
        nombre = Utilidades.leer("Por favor ingrese su nombre");
        
        do{
            
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
               reparacion = Integer.parseInt (JOptionPane.showInputDialog("Selecciona la reparacion: \n1. Cambio de bujias \n2. Cambio de carburador \n3. Cambio de llantas \n4. Limpieza de carburador \n5. Afinación" )); 
               repCarro(reparacion);
            break;
            
            
            case 1:
               reparacion = Integer.parseInt (JOptionPane.showInputDialog("Selecciona la reparacion: \n1. Cambio de bujias \n2. Cambio de carburador \n3. Cambio de llantas \n4. Limpieza de carburador \n5. Afinación" )); 
               repCamioneta(reparacion);
            break;
            
            case 2:
                reparacion = Integer.parseInt (JOptionPane.showInputDialog("Selecciona la reparacion: \n1. Cambio de bujias \n2. Cambio de carburador \n3. Cambio de llantas \n4. Limpieza de carburador \n5. Afinación" )); 
                repMoto(reparacion);  
            break;
            
        }
    }

    
    private void repCarro (int reparacion){
        
        Carro carro = new Carro();
        carro.nombrePropietario = nombre; 

            switch (reparacion){
                case 1:
                    costo+=carro.costoCambioBujia;
                        break;
                case 2:    
                    costo+=carro.costoCambioCarburador;
                        break;
                case 3:      
                    costo+=carro.costoCambioLlanta;
                        break;
                case 4:       
                    costo+=carro.costoLimpiezaCarburador;
                        break;
                case 5:       
                    costo+=carro.costoAfinacion;
                        break; 

                default:
                    Utilidades.mensaje("Porfavor, introduce el número de reparacion correcto");
                    mostrarReparaciones(tipoV);    
                        break;         
            }
            end(nombre, costo);

    }
    private void repCamioneta (int reparacion){
        
        Camioneta camioneta = new Camioneta();
        camioneta.nombrePropietario = nombre; 

            switch (reparacion){
                case 1:
                    costo+=camioneta.costoCambioBujia;
                        break;
                case 2:    
                    costo+=camioneta.costoCambioCarburador;
                        break;
                case 3:      
                    costo+=camioneta.costoCambioLlanta;
                        break;
                case 4:       
                    costo+=camioneta.costoLimpiezaCarburador;
                        break;
                case 5:       
                    costo+=camioneta.costoAfinacion;
                        break; 

                default:
                    Utilidades.mensaje("Porfavor, introduce el número de reparacion correcto");
                    mostrarReparaciones(tipoV);    
                        break;         
            }
            end(nombre, costo);

    }
    
    
    private void repMoto (int reparacion){
        
        Motocicleta moto = new Motocicleta();
        moto.nombrePropietario = nombre; 

            switch (reparacion){
                case 1:
                    costo+=moto.costoCambioBujia;
                        break;
                case 2:    
                    costo+=moto.costoCambioCarburador;
                        break;
                case 3:      
                    costo+=moto.costoCambioLlanta;
                        break;
                case 4:       
                    costo+=moto.costoLimpiezaCarburador;
                        break;
                case 5:       
                    costo+=moto.costoAfinacion;
                        break; 

                default:
                    Utilidades.mensaje("Porfavor, introduce el número de reparacion correcto");
                    mostrarReparaciones(tipoV);    
                        break;         
            }
            end(nombre, costo);

    }
    
    
    
    private void end (String nombre, float costo){
      int estancia;
      estancia = Integer.parseInt(Utilidades.leer("Desea agregar una reparación mas? \n1. SI \n2. NO"));
      if (estancia==1){   
           mostrarReparaciones(tipoV);
      }else{
           Utilidades.mensajeFac("Cliente: " + nombre + "\nCosto: " +costo);
      }     
    }
    
}
 
