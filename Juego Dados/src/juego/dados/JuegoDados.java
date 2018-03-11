/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package juego.dados;

import java.util.Scanner;

/**
 *
 * @author capacitacion
 */
public class JuegoDados {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     int resultado1;
     int resultado2;
     int resultadofinal;
     int apuestainicial;
     String jugar;
     int dinero = 1000;
     Scanner s = new Scanner (System.in);
     Dado d1 = new Dado();
     Dado d2 = new Dado();
            
     System.out.println ("Bienvenido al juego de los dados. Usted tiene $1000 para su apuesta inicial");
     System.out.println ("¿Queres jugar?");
     jugar = s.nextLine();
     while ("s".equals(jugar.toLowerCase())){
         System.out.println ("¿Cual es la apuesta inicial?");
         apuestainicial = s.nextInt();
         if (apuestainicial>=dinero) {
            System.out.println("Debe elegir un monto menor que no supere los "+dinero);
            jugar = s.nextLine();
            System.out.println ("¿Queres seguir jugando?");
            jugar = s.nextLine();     
         }else{
                d1.setResultado();
                d2.setResultado();
                resultado1=d1.getResultado();
                resultado2=d2.getResultado();
                resultadofinal = resultado1+resultado2;
                System.out.println ("DADO 1: "+resultado1);
                System.out.println ("DADO 2: "+resultado2);
                System.out.println ("Usted saco un "+resultadofinal);
                
                if ((resultadofinal==7) || (resultadofinal==11)){
                    dinero= dinero + (apuestainicial*2);
                    System.out.println ("Usted ganó "+dinero);
                    
                   
                }else if ((resultadofinal==2) || (resultadofinal==3)|| (resultadofinal==12)) {
                     dinero= dinero - apuestainicial;
                     System.out.println ("Usted perdió "+dinero);
                } else{
                    System.out.println ("Usted conserva la apuesta");
                }
     }                     
         
     } 
                    
     
     
    
     
    }
    
}
