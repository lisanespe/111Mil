/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pizzeria;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author 111mil
 */
public class Pizzeria {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
      /*  TipoPizza TPizza = new TipoPizza ("A la Parrilla","crocante y alta");
        TipoPizza TPizza2 = new TipoPizza ("Al Molde", "Angosta y más pequeña");
        TipoPizza TPizza3 = new TipoPizza ("A la Piedra", "Ancha y Crocante");
        
        VariedadPizza VPizza = new VariedadPizza ("Salsa de tomate, muzzarella, jamón y morrones", "Especial");
        VariedadPizza VPizza2 = new VariedadPizza ("Salsa de tomate, muzzarella, longaniza, aji molido", "Calabresa");
        VariedadPizza VPizza3 = new VariedadPizza ("Salsa de tomate, muzzarella, rodajas de tomate, orégano", " Napolitana");
        
        TamañoPizza TamPizza = new TamañoPizza (8, "Chica");
        TamañoPizza TamPizza2 = new TamañoPizza (12,"Grande");
        
        Pizza pizza1=new Pizza("Calabreza",120,TPizza,VPizza,TamPizza);
        Pizza pizza2=new Pizza("Palmitos",160,TPizza2,VPizza2,TamPizza2);
        
        
        
        Date fechCreaPedi1=new Date(117,9,6,18,30,0);
        Date fechEntregaPedi1=new Date(117,9,6,19,30,0);
        
        Date fechEmiFact1=new Date(117,9,6,19,15,0);
        
        EstadoFactura estFact1=new EstadoFactura("Es Pendiente de Facturacion", "vamos a no aflojar");
        
        
        EstadoPedido estPed1 = new EstadoPedido("Pendiente de Facturacion", "lalala");
        
        
        DetallePedido detPedido1= new DetallePedido(2, 200, estPed1, pizza1);
        DetallePedido detPedido2= new DetallePedido(1, 150, estPed1, pizza2);
        
        ArrayList<DetallePedido> detsPedidos1=new ArrayList<DetallePedido>();
        detsPedidos1.add(detPedido1);
        detsPedidos1.add(detPedido2);
        
        Factura fact1=new Factura(detsPedidos1);
        Pedido pedido1=new Pedido(fechCreaPedi1, fechEntregaPedi1, "Rolo", 1, fact1, estPed1, detsPedidos1);
        
        fact1.setFechaHoraEmision(fechEmiFact1);
        fact1.setNumero(1);
        fact1.setEstadoFactura(estFact1);
        fact1.setDetallePedido(detsPedidos1);
        estFact1.setNombre("Generada");
        
        estPed1.setNombre("Generada");
        pedido1.setEstado(estPed1);
        
        System.out.println(pizza1.toString());
        System.out.println(pedido1.toString());
        System.out.println(fact1.toString()); 
                                                */
        
     TablaPedidos tp= new TablaPedidos();
        tp.setVisible(true);
        
        
    }
    
}
