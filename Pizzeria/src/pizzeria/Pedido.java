/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pizzeria;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author 111mil
 */
public class Pedido {
 
    private Date fechaHoraCreacion;
    private Date fechaHoraEntrega;
    private String nombreCliente;
    private int numero;
    private Factura factura;
    private EstadoPedido estado;
    private ArrayList<DetallePedido>detallesPedido;
    
    public Pedido (){
        detallesPedido= new ArrayList();
    }
    
    public Pedido(Date fechaHoraCreacion, Date fechaHoraEntrega, String nombreCliente, int numero, Factura factura, EstadoPedido estado, ArrayList<DetallePedido> detallesPedido) {
        this.fechaHoraCreacion = fechaHoraCreacion;
        this.fechaHoraEntrega = fechaHoraEntrega;
        this.nombreCliente = nombreCliente;
        this.numero = numero;
        this.factura = factura;
        this.estado = estado;
        this.detallesPedido = detallesPedido;
    }

    public Date getFechaHoraCreacion() {
        return fechaHoraCreacion;
    }

    public void setFechaHoraCreacion(Date fechaHoraCreacion) {
        this.fechaHoraCreacion = fechaHoraCreacion;
    }

    public Date getFechaHoraEntrega() {
        return fechaHoraEntrega;
    }

    public void setFechaHoraEntrega(Date fechaHoraEntrega) {
        this.fechaHoraEntrega = fechaHoraEntrega;
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public Factura getFactura() {
        return factura;
    }

    public void setFactura(Factura factura) {
        this.factura = factura;
    }

    public EstadoPedido getEstado() {
        return estado;
    }

    public void setEstado(EstadoPedido estado) {
        this.estado = estado;
    }

    public ArrayList<DetallePedido> getDetallesPedido() {
        return detallesPedido;
    }

    public void setDetallesPedido(ArrayList<DetallePedido> detallesPedido) {
        this.detallesPedido = detallesPedido;
    }
 
    
    
    public float calcTotalPedido(){
        float total = 0;
     
     for (DetallePedido detalle:detallesPedido){
         total+=detalle.CalcTotalItem();
     }    
      return total;    
     }
 
     public void facturar (Factura factura, EstadoPedido facturado){
         this.factura=factura;
         
         this.estado=facturado;
     }
    
    @Override
    public String toString() {
        return "Pedido{" + "fechaHoraCreacion=" + fechaHoraCreacion + ", fechaHoraEntrega=" + fechaHoraEntrega + ", nombreCliente=" + nombreCliente + ", numero=" + numero + ", factura=" + factura + ", estado=" + estado + ", detallesPedido=" + detallesPedido + '}';
    }
     
    public String dameFecha(){
       int año = fechaHoraCreacion.getYear() + 1900;
       String fecha= fechaHoraCreacion.getDay() + "/" + fechaHoraCreacion.getMonth() + "/" + año;
        return fecha;
    }
    
    public String dameHora(){
        return fechaHoraEntrega.getHours()+ ":" + fechaHoraEntrega.getMinutes();
        
    }

    void setDetallesPedido(DetallePedido detPedido1) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    void setEstado(DetallePedido detPedido2) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
