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
public class TipoPizza {

   
 private String descripcion;
 private String nombre;
 
 public TipoPizza(){
     
 }
 
 public TipoPizza(String descripcion, String nombre) {
        this.descripcion = descripcion;
        this.nombre = nombre;
    }
  public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return this.nombre;
    }

}
