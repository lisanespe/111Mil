/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculosbylucas;

import java.util.Scanner;

/**
 *
 * @author capacitacion
 */
public class Calculosbylucas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        float uno,dos;
        float suma;
        float resta;
        float multiplicacion;
        float division;
        int operacion;
        Scanner s=new Scanner(System.in);
        //se crea un objeto de la clase Scanner para tomar los datos de teclado
        System.out.println("Ingrese el primer número:");
        uno=s.nextFloat();
        System.out.println("Ingrese el segundo número:");
        dos=s.nextFloat();
        System.out.println("¿Que operación desea realizar?:");
        System.out.println("1)Sumar");
        System.out.println("2)Restar");
        System.out.println("3)Multiplicar");
        System.out.println("4)Dividir");
        operacion=s.nextInt();
        Calculadora p=new Calculadora();
        switch(operacion){
            case 1:                
        p.setUno(uno);
        p.setDos(dos);
        
        p.setSuma();
        suma=p.getSuma();
        System.out.println("El resultado de la suma es:"+suma);
                break;
            case 2:        
        p.setUno(uno);
        p.setDos(dos);
        
        p.setResta();
        resta=p.getResta();
        System.out.println("El resultado de la resta es:"+resta);
                break;
            case 3:
                p.setUno(uno);
        p.setDos(dos);
        
        p.setMultiplicacion();
        multiplicacion=p.getMultiplicacion();
        System.out.println("El resultado de la multiplicacion es:"+multiplicacion);
                break;
            case 4:
        p.setUno(uno);
        p.setDos(dos);
        
        p.setDivision();
        division=p.getDivision();
        System.out.println("El resultado de la division es:"+division);
                break;
            default:
                System.out.println ("ERROR");
                break;
        }
           
    }
    
}
