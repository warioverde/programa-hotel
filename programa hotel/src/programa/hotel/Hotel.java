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
    Habitacion array[]=new Habitacion[10];
    
    public void llenarPiezas(){
        int noches;
        int estado;
        
        for (int i = 0; i < array.length; i++) {
            
            
            System.out.println("Ingrese la cantidad de noches de la habitacion "+i+1);
            noches=leer.nextInt();
            System.out.println("ingrese estado de la habitacion"+i+1);
            estado=leer.nextInt();
            array[i]=new Habitacion(estado,noches);
            //objeto no puede ser igual a un atributo.
        }
    }
    public void consulta(){
        int estado;
        
        System.out.println("ingrese habitacion en la que quiere saber estado");
        estado=leer.nextInt();
        System.out.println(array[estado].getEstado());
}
    public void modificar(){
        int mod;
        System.out.println("ingrese habitacion a modificar");
        mod=leer.nextInt();
        System.out.println("ingrese estado que desea");
        int est = leer.nextInt();
        array[mod].setEstado(est);
    }
//    public void llenarHabitaciones(){
//        int noches;
//        Habitacion arrayHabitaciones[] = new Habitacion [10];
//        for (int i = 0; i < arrayHabitaciones.length; i++) {
//            arrayHabitaciones[i]= new Habitacion();
//            
//            
//            if (Habitacion.setEstado() ==1){
//                Habitacion.setNoches();
//            }
//        }
//       
//    }
    
}
