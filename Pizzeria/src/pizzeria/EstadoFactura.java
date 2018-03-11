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
class EstadoFactura {
    private String nombre;
    private String descripcion; 
    
     public EstadoFactura(String nombre,String descripcion) {
        this.nombre = nombre;
        this.descripcion = descripcion;
    }
    
          
    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    
    public void setNombre(String nombre)
    {
        this.nombre=nombre;
    }
    
    public String getNombre() {
        return nombre;
    }

    public boolean esGenerada(){
         return nombre.equals ("Generada");
    }

    
    public boolean esPteFacturacion(){
        return nombre.equals("es Pendiente de Facturacion");
    }
    
}
