/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package comprobantes.negocio;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author Lau
 */
public class Factura extends Comprobante{
    //el ArrayList siguiente se debe a la multiplicidad 1..* en el extremo de la agregacion con la clase Producto
    private ArrayList<Producto> mProducto=new ArrayList<>();
    private float total;
    //mCliente se debe a la multiplicidad 1 en la relacion con la clase CLiente
    private Cliente mCliente;

    public Factura(char tipo, int numero, Fecha fecha, Cliente mCliente) {
        super(tipo,numero,fecha);
        setmCliente(mCliente);
        setTotal(0);
    }

    public ArrayList<Producto> getmProducto() {
        return mProducto;
    }

    public void setmProducto(ArrayList<Producto> mProducto) {
        this.mProducto = mProducto;
    }

    public float getTotal() {
        return total;
    }

    public void setTotal(float total) {
        this.total = total;
    }

    public Cliente getmCliente() {
        return mCliente;
    }

    public void setmCliente(Cliente mCliente) {
        this.mCliente = mCliente;
    }
    
    public void agregarProducto(Producto p){
        mProducto.add(p);
        setTotal(getTotal()+p.getPrecio());
    }
    
    public void mostrar(){
        System.out.printf("Tipo:%c Numero:%d Fecha:%d/%d/%d\n", getTipo(),getNumero(),getFecha().getDia(), getFecha().getMes(),getFecha().getAnio());
        System.out.printf("Cliente: \n");
        System.out.printf("Código: %d  Razón Social: %s \n", mCliente.getCodigo(), mCliente.getRazonSocial());
        System.out.printf("Productos: \n");
        mostrarProductos();
        System.out.printf("Total: %6.2f \n", getTotal());
    }

    private void mostrarProductos() {
        Iterator<Producto> iter=mProducto.iterator();
        while(iter.hasNext()){
            Producto p=iter.next();
            System.out.printf("Código: %d  Descripción: %s  Precio: %5.2f \n", p.getCodigo(),p.getDescripcion(),p.getPrecio());
        }
    }
    
}
