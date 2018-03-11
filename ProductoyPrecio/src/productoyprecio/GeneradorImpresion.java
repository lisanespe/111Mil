/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package productoyprecio;

/**
 *
 * @author capacitacion
 */
public class GeneradorImpresion {
    
    private String[][]matrizDetalle;
    private int numero;
    private PantallaImpresion p;
    
    public GeneradorImpresion(String[][] matrizDetalle, int numero){
        
        this.matrizDetalle=matrizDetalle;
        this.numero=numero;
        this.p = new PantallaImpresion(matrizDetalle, numero);
    }

    public String[][] getMatrizDetalle() {
        return matrizDetalle;
    }

    public void setMatrizDetalle(String[][] matrizDetalle) {
        this.matrizDetalle = matrizDetalle;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }
    
    public PantallaImpresion getP(){
        return p;
        
    }
    
    public void crearPantallaImpresion(){
        p.setVisible (true);
    }
    
}
