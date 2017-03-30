/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programa.hotel;

import java.util.Scanner;

/**
 *
 * @author tatan
 */
public class Hotel {
    Scanner leer = new Scanner(System.in);
    
    
    
    public void llenarHabitaciones(){
        int noches;
        Habitacion arrayHabitaciones[] = new Habitacion [10];
        for (int i = 0; i < arrayHabitaciones.length; i++) {
            arrayHabitaciones[i]= new Habitacion();
            
            
            if (Habitacion.setEstado() ==1){
                Habitacion.setNoches();
            }
        }
       
    }
    public int calculoNoches(){
        
    }
    
}
