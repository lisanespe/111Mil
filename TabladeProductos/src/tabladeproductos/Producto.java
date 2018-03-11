/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tabladeproductos;

import java.util.ArrayList;

/**
 *
 * @author 111mil
 */
public class Producto {
    private String Nombre;
    private int precio;
    private ArrayList<String> presentacion;

    public Producto(String Nombre, int precio, ArrayList<String> presentacion) {
        this.Nombre = Nombre;
        this.precio = precio;
        this.presentacion = presentacion;
    }



    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public ArrayList<String> getPresentacion() {
        return presentacion;
    }

    public void setPresentacion(ArrayList<String> presentacion) {
        this.presentacion = presentacion;
    }

    
    
    
    
    
    
}
