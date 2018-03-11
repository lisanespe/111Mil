/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package facturacion;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author Lisandro
 */
public class Factura extends Comprobante {
    
    private float total;
    private ArrayList<Producto> mproducto=new ArrayList<>();
    private Cliente mcliente;
    
    
    
    public Factura(char tipo, int numero, Fecha fecha, Cliente mcliente) {
        super(tipo, numero, fecha);
        setMcliente (mcliente);
        setTotal(0);
    }

    public ArrayList<Producto> getMproducto() {
        return mproducto;
    }

    public void setMproducto(ArrayList<Producto> mproducto) {
        this.mproducto = mproducto;
    }

    
    public Cliente getMcliente() {
        return mcliente;
    }

    public void setMcliente(Cliente mcliente) {
        this.mcliente = mcliente;
    }
  

    public float getTotal() {
        return total;
    }

    public void setTotal(float total) {
        this.total = total;
    }
    
    public void agregarproducto (Producto producto){
        mproducto.add(producto);
        setTotal(getTotal()+producto.getPrecio());
       
}
    public void mostrar(){
    System.out.printf("Tipo:%c Numero:%d Fecha:%d/%d/%d", getTipo(), getNumero(), getFecha().getDia(), getFecha().getMes(), getFecha().getAnio());
    System.out.printf("Codigo:%d Razon social:%s", mcliente.getCodigo(), mcliente.getRazonSocial());
    mostrarProductos();
    System.out.printf("Total: %f", getTotal());
        }
    
    public void mostrarProductos(){
        Iterator<Producto> it= mproducto.iterator();
            while(it.hasNext()){
            Producto pro;
            pro=it.next();
           
            System.out.printf("Codigo:%d Descripción:%s Precio:%5.2f\n", pro.getCodigo(), pro.getDescripcion(), pro.getPrecio());
                              
            }
             
    }
}