/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase_arraylist;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author capacitacion
 */
public class Clase_ArrayList {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList<Integer> lista=new ArrayList<>();
        
        //Agregado de elementos
        lista.add(24);
        lista.add(2);
        lista.add(3);
        lista.add(24);
        lista.add(30);
        lista.add(24);

        
        System.out.println("Elementos agregados:");
        System.out.println(lista);
        //System.out.println(lista.toString());
        
        //Para remover el tercer elemento de la lista
        lista.remove(2);
        
        System.out.println("Lista final con elemento de indice 2 removido:");
        System.out.println(lista);
        
        //Obtener un elemento del ArrayList
        
        System.out.println("Obtener el elemento puntual de indice 0 de la lista");
        System.out.println(lista.get(0));
        
        //Para recorrer un ArrayList se utiliza un iterador
        System.out.println("Recorrer toda la lista:");
        Iterator<Integer> it=lista.iterator();
        int num;
        while(it.hasNext()){
            num=it.next();
            System.out.println(num);
        }
        
        int contador=0;
        Iterator<Integer> it2= lista.iterator();
        while(it2.hasNext()){
            num=it2.next();
            if(num==24){
              System.out.println("Posiciones indice del elemento con numero 24");
              System.out.println(contador);
              
            }
            
            contador++;
        }
        
        //Metodo indexOf, para saber la posición de un elemento
        System.out.println("Posición indice del elemento con numero 24");
        System.out.println(lista.indexOf(24));
        
        //Metodo Clear, para eliminar todos los elementos
        System.out.println("Metodo Clear, para eliminar todos los elementos");
        lista.clear();
        System.out.println(lista);
        
        //Metodo is Empty, indica si un ArrayList esta vacio o no
        System.out.println("Metodo is Empty, indica si un ArrayList esta vacio o no");
        System.out.println(lista.isEmpty());
        
        //Crear una función que recorra la lista y me diga todas las posiciones de un elemento que se repite
       
        
    }
}
