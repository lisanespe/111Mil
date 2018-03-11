/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package productoyprecio;

import java.util.ArrayList;

/**
 *
 * @author capacitacion
 */
public class productos {
    private String Producto;
    private float precio;
    private ArrayList<String> presentacion;

    public productos(String Producto, float precio, ArrayList presentacion) {
        this.Producto = Producto;
        this.precio = precio;
        this.presentacion = presentacion;
    }

    public String getProducto() {
        return Producto;
    }

    public void setProducto(String Producto) {
        this.Producto = Producto;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public ArrayList<String> getPresentacion() {
        return presentacion;
    }

    public void setPresentacion(ArrayList<String> presentacion) {
        this.presentacion = presentacion;
    }
    
    
    
    
}
