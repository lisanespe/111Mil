/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pizzeria;

import java.util.ArrayList;

/**
 *
 * @author capacitacion
 */
public class GeneradorImpresion {
    
    private Object[][]matrizDetalle;
    private int numero;
    private pantallafactura p;
    private String cliente;
    private String fecha;
    private String hora;
    private String resultadof;
    
  public GeneradorImpresion(Object[][] matrizDetalle, int numero){
        
        this.matrizDetalle=matrizDetalle;
        this.numero=numero;
        this.p = new pantallafactura(matrizDetalle, numero);
        
    }

    public GeneradorImpresion(Object[][] matrizDetalle, int numero, String cliente, String fecha, String hora, String resultadof) {
        this.matrizDetalle = matrizDetalle;
        this.numero = numero;
        this.cliente = cliente;
        this.fecha = fecha;
        this.hora = hora;
        this.resultadof= resultadof;
        this.p = new pantallafactura(matrizDetalle, numero, cliente, fecha, hora, resultadof);
    }

    public String getResultadof() {
        return resultadof;
    }

    public void setResultadof(String resultadof) {
        this.resultadof = resultadof;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    

    public Object[][] getMatrizDetalle() {
        return matrizDetalle;
    }

    public void setMatrizDetalle(Object[][] matrizDetalle) {
        this.matrizDetalle = matrizDetalle;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public pantallafactura getP() {
        return p;
    }

    public void setP(pantallafactura p) {
        this.p = p;
    }
   public void crearPantallaImpresion(){
        p.setVisible (true);
    }

  
    
    
    
}
