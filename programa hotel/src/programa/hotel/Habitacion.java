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
public class Habitacion {
   
   int precio = 40000;
   static int estado;
   static int noches;
  
  public static int setEstado(){
      Scanner leer = new Scanner(System.in);
      System.out.println("ingrese estado habitacion");
      estado=leer.nextInt();
     return estado;
}
  public static int setNoches(){
      Scanner leer = new Scanner(System.in);
      System.out.println("ingrese estado habitacion");
      noches=leer.nextInt();
      return noches;
  }
  public int getNoches(){
      return noches;
  }
   
    
}
