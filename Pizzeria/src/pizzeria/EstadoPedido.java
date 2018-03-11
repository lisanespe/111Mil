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
public class EstadoPedido {
    
    private String nombre;
    private String descripcion;
    
    public EstadoPedido(String nombre, String descripcion)
    {
        this.nombre=nombre;
        this.descripcion=descripcion;
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
 
    public boolean esFacturado(){
     return nombre.equals("Facturado");
    }

    public boolean esPteFacturacion(){
     return nombre.equals("Pendiente de Facturación");
    }
    
  /*  public boolean esGenerada(){
     return nombre.equals("Generada");
    }
*/
}
