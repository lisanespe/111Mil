/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package flavialisandro.mails;

import java.util.Scanner;

/**
 *
 * @author 111mil
 */
public class FlavialisandroMails {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    String usuario;
    String dominio;
    String correo_electronico;
    int arroba;
    Scanner s=new Scanner(System.in);
    Mails M=new Mails ();
    System.out.println("Ingrese su correo electrónico:");
    correo_electronico=s.nextLine();
    M.setCorreo_electronico(correo_electronico);
    usuario=M.getUsuario();
    dominio=M.getDominio();
    System.out.println ("el usuario es: " +usuario+" El dominio es:" +dominio);
    
    
    
// TODO code application logic here
    }
    
}
