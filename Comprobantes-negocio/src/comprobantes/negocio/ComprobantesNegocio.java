/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package comprobantes.negocio;

/**
 *
 * @author Lau
 */
public class ComprobantesNegocio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Fecha hoy=new Fecha(4,8,2017);
        Producto pro1=new Producto(1,"Café", (float) 8.5);
        Producto pro2=new Producto(2,"Media Luna",10);
        Producto pro3=new Producto(3,"Torta de manzana",20);
        Cliente cliente=new Cliente(1,"Juana Bernardez");
        Factura f1=new Factura('A',1,hoy,cliente);
        f1.agregarProducto(pro3);
        f1.agregarProducto(pro1);
        f1.mostrar();
    }
    
}
