/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package desafio.del.conocimiento;

import java.util.Scanner;

/**
 *
 * @author capacitacion
 */
public class DesafioDelConocimiento {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int puntaje;
        puntaje=0;
        String respuesta;
        Scanner s=new Scanner (System.in);
        System.out.println ("Hola, este es el juego de las preguntas");
        System.out.println ("¿Estas listo para comenzar?(s:inicio)");
        respuesta=s.nextLine();
        if (("S".equals(respuesta))||("Si".equals(respuesta))||("s".equals(respuesta))||("si".equals(respuesta))){
             System.out.println ("¿Cual es la {ultima letra del alfabeto griego? Las opciones son las siguientes: a) Omega b) Alpha c)Zeta");
             System.out.println ("Ingrese una opcion");
             respuesta=s.nextLine();
             if (("a".equals(respuesta))||("A".equals(respuesta))){
                puntaje ++;
             }
             System.out.println ("¿Cual es el reptil cuya piel cambia de color? Las opciones son las siguientes: a) Cobra b) Iguana c)Camaleon");
             System.out.println ("Ingrese una opcion");
             respuesta=s.nextLine();
             if (("c".equals(respuesta))||("C".equals(respuesta))){
                puntaje=(puntaje+2);
             }
             System.out.println ("¿Cual es la ciudad italiana conocida como la novia del mar? Las opciones son las siguientes: a) Roma b) Venecia c)Florencia");
             System.out.println ("Ingrese una opcion");
             respuesta=s.nextLine();
             if (("b".equals(respuesta))||("B".equals(respuesta))){
                puntaje=(puntaje+2);
             }
             System.out.println ("¿Cual es el número de años que debes tener de casado para fesejar tus bodas de oro? a)25  b) 50 c)60");
             System.out.println ("Ingrese una opcion");
             respuesta=s.nextLine();
             if (("b".equals(respuesta))||("B".equals(respuesta))){
                puntaje ++;
             }
             System.out.println ("¿cuantas horas duerme en promedio al al día un gato? a)12  b) 13 c)14");
             System.out.println ("Ingrese una opcion");
             respuesta=s.nextLine();
             if (("c".equals(respuesta))||("C".equals(respuesta))){
                puntaje ++;
             }
             
             System.out.println ("¿cuál es el organo del cuerpo que produce la bilis? a)higado  b) pancreas c)riñon");
             System.out.println ("Ingrese una opcion");
             respuesta=s.nextLine();
             if (("a".equals(respuesta))||("A".equals(respuesta))){
                puntaje ++;
             }
             
             System.out.println ("¿En que década se termino de construir el Empire State? a)50  b) 40 c)30");
             System.out.println ("Ingrese una opcion");
             respuesta=s.nextLine();
             if (("c".equals(respuesta))||("C".equals(respuesta))){
                puntaje ++;
             }
             System.out.println ("¿Cuál es la bebida mas importante de Japon? a)Umeshu  b) Sake c)Awamori");
             System.out.println ("Ingrese una opcion");
             respuesta=s.nextLine();
             if (("b".equals(respuesta))||("B".equals(respuesta))){
                puntaje ++;
             }
             if ((puntaje>=0)&&(puntaje<=3)){
                System.out.println ("Debes seguir estudiando");
             }else if ((puntaje>=4)&&(puntaje<=7)){
                System.out.println ("Tu nivel es medio, puedes mejorar");
             }else if ((puntaje>=8)&&(puntaje<=9)){
                System.out.println ("Tienes muy buenos conocimientos");
             }else{
                  System.out.println ("Sos crack");
             }     
        }else{
             System.out.println ("Adios");
                
        }
            
        // TODO code application logic here
    }
    
}
