/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package flavialisandro.mails;

/**
 *
 * @author 111mil
 */
public class Mails {

private String usuario;
private String dominio;
private int arroba;
private String correo_electronico;

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getDominio() {
        return dominio;
    }

    public void setDominio(String dominio) {
        this.dominio = dominio;
    }

    public int getArroba() {
        return arroba;
    }

    public void setArroba(int arroba) {
        this.arroba = arroba;
    }

    public String getCorreo_electronico() {
        return correo_electronico;
    }

    public void setCorreo_electronico(String correo_electronico) {
        this.correo_electronico = correo_electronico;
        for(int i=0;i<correo_electronico.length();i++){
            if(correo_electronico.charAt(i)=='@'){
                arroba = i;
            }
        }  
         this.usuario= correo_electronico.substring(0,arroba);
         this.dominio= correo_electronico.substring (arroba+1, correo_electronico.length());        
    }

}