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
class DetallePedido {

   
 private int cantidad;
    private float precio;
    private EstadoPedido estadoPedido;
    private Pizza pizza;
    
    public DetallePedido(){
        
    }
   
    public DetallePedido(int cantidad, float precio, EstadoPedido estadoPedido, Pizza pizza) {
        this.cantidad = cantidad;
        this.precio = precio;
        this.estadoPedido = estadoPedido;
        this.pizza = pizza;
    }
       
     public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public EstadoPedido getEstadoPedido() {
        return estadoPedido;
    }

    public void setEstadoPedido(EstadoPedido estadoPedido) {
        this.estadoPedido = estadoPedido;
    }

    public Pizza getPizza() {
        return pizza;
    }

    public void setPizza(Pizza pizza) {
        this.pizza = pizza;
    }
    
    public float CalcTotalItem (){
        return (cantidad*precio);    
    }
    
    public void cancelar(){
        estadoPedido.esPteFacturacion();
    }
    
   
  
}    

