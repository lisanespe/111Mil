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
public class TamañoPizza {
    private int cantPorciones;
    private String nombre;

    public TamañoPizza(){
    
    }
    
    public TamañoPizza(int cantPorciones, String nombre) {
        this.cantPorciones = cantPorciones;
        this.nombre = nombre;
    }
    public int getCantPorciones() {
        return cantPorciones;
    }

    public void setCantPorciones(int cantPorciones) {
        this.cantPorciones = cantPorciones;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }    
    
    public String toString(){
                return "" + this.cantPorciones;
    }
}    

   

