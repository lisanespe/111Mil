/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package integradordecadenas;

import java.util.Scanner;

/**
 *
 * @author 111mil
 */
public class Integradordecadenas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
            //Variables:
            short operacion;
            String oracion;
            String palabra;
            //String entradateclado;
            String subcadena;
            int inicio, fin;
            int i;
            oracion="";
            Scanner s=new Scanner(System.in);
            concatenadorintegrador c=new concatenadorintegrador();
            subcadenadorintegrador p=new subcadenadorintegrador();
            //Preguntas al usuario y posibles respuestas
            System.out.println("Qué operación desea realizar?");
            System.out.println("1- Concatenar");
            System.out.println("2- Subcadenar");
            //El planteo de las opciones
            operacion=s.nextShort();
            
            switch(operacion){
                case 1:                
                    for(i=0;i<4;i++){
                        System.out.println("Ingrese una palabra para concatenar:");
                        palabra=s.next();
                        c.setPalabra(palabra);
                        c.setOracion(oracion);
                        oracion=c.getOracion();//debe esar fuera del for?
                    }//fin for
                    System.out.println(oracion);
                    break;
                case 2:
                    System.out.println("Ingrese una cadena:");
                    palabra=s.nextLine();
                    System.out.println("longitud de entrada: "+palabra.length());
                    System.out.println("ingrese donde comienza la subcadena");
                    inicio=s.nextInt();
                    System.out.println("ingrese donde finaliza la subcadena");
                    fin=s.nextInt();
                    if(palabra.length() >= fin){
                        p.setPalabra(palabra);
                        p.setInicio (inicio);
                        p.setFin (fin);        
                        p.setSubcadena ();
                        subcadena=p.getSubcadena();
                        System.out.println("la subcadena es "+subcadena); 
                    }else{
                        System.out.println("error de parametro"); 
                    }
                    break;
                default:
                    System.out.println("Error de tipeo");
                    // TODO code application logic here
            }
    
}
}
