/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pizzeria;

/**
 *
 * @author 111mil
 */
public class Pizza {
    private String nombre;
    private float precio;
    private TipoPizza tipoPizza;

    public TipoPizza getTipoPizza() {
        return tipoPizza;
    }

    public void setTipoPizza(TipoPizza tipoPizza) {
        this.tipoPizza = tipoPizza;
    }
    private VariedadPizza variedad;
    private TamañoPizza tamaño;

    public Pizza(){
        
    }
    
    public Pizza(String nombre, float precio, TipoPizza tipo, VariedadPizza variedad, TamañoPizza tamaño) {
        this.nombre = nombre;
        this.precio = precio;
        this.tipoPizza = tipo;
        this.variedad = variedad;
        this.tamaño = tamaño;
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    

  

 

    public VariedadPizza getVariedad() {
        return variedad;
    }

    public void setVariedad(VariedadPizza variedad) {
        this.variedad = variedad;
    }

    public TamañoPizza getTamaño() {
        return tamaño;
    }

    public void setTamaño(TamañoPizza tamaño) {
        this.tamaño = tamaño;
    }

    @Override
    public String toString() {
        return "Pizza{" + "nombre=" + nombre + ", precio=" + precio + ", tipoPizza=" + tipoPizza + ", variedad=" + variedad + ", tama\u00f1o=" + tamaño + '}';
    }

  
    
}
