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
public class VariedadPizza {
    private String ingredientes;
    private String nombre;


    public VariedadPizza(String ingredientes, String nombre) {
        this.ingredientes = ingredientes;
        this.nombre = nombre;
    }

    public String getIngredientes() {
        return ingredientes;
    }

    public void setIngredientes(String ingreientes) {
        this.ingredientes = ingreientes;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public String toString(){
                return this.nombre;
    }
}