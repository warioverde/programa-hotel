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
    int estado=0;
    int noches=0;

    public Habitacion(int estado, int noches) {
        this.estado=estado;
        this.noches=noches;
        if(estado==0)
        {
            noches=0;
        }
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }

    public int getNoches() {
        return noches;
    }

    public void setNoches(int noches) {
        this.noches = noches;
    }
   
   


   
    
}
