/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package facturas;

/**
 *
 * @author capacitacion
 */
public class Cliente {
    
    private int codigo;
    private String razonSocial;

    public Cliente(int codigo, String razonSocial) {
        setCodigo (codigo);
        setRazonSocial (razonSocial);
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getRazonSocial() {
        return razonSocial;
    }

    public void setRazonSocial(String razonSocial) {
        this.razonSocial = razonSocial;
    }
    
    
    
}
