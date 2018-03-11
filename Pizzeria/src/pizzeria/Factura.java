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
public class Factura {
    private Date fechaHoraEmision;
    private long numero;
    private EstadoFactura estadoFactura;
    private ArrayList<DetallePedido> detallePedido;
    
    public Factura(Date fechaHoraEmision, long numero, EstadoFactura estadoFactura, ArrayList<DetallePedido> detallePedido) {
        this.fechaHoraEmision = fechaHoraEmision;
        this.numero = numero;
        this.estadoFactura = estadoFactura;
        this.detallePedido = detallePedido;

    }
    
    public Factura(ArrayList<DetallePedido> detallePedido)
    {
        this.detallePedido = detallePedido;
    }
    

    public Date getFechaHoraEmision() {
        return fechaHoraEmision;
    }

    public void setFechaHoraEmision(Date fechaHoraEmision) {
        this.fechaHoraEmision = fechaHoraEmision;
    }

    public long getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public EstadoFactura getEstadoFactura() {
        return estadoFactura;
    }

    public void setEstadoFactura(EstadoFactura estadoFactura) {
        this.estadoFactura = estadoFactura;
    }

    public ArrayList<DetallePedido> getDetallePedido() {
        return detallePedido;
    }

    public void setDetallePedido(ArrayList<DetallePedido> detallePedido) {
        this.detallePedido = detallePedido;
    }

}