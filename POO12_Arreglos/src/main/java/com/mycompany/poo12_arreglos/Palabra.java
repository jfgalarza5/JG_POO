package com.mycompany.poo12_arreglos;
import java.util.Scanner;
/**
 *
 * @author johng
 */
public class Palabra {
    //Se declaran las variables
    String p;
    //Se declaran los arreglos
    String [] palabras = new String[5];
    Scanner in = new Scanner (System.in);
    
    //Metodo que ingresa las palabras al arreglos
    public void ingresoPalabra(){
        System.out.println("Ingresa 5 palabras");
        
        //Bucle for para ingresar 5 palabras 
        for (int a=0;a<5;a++){
            System.out.println("Ingresa la palabra "+(a+1));
            p=in.nextLine();
            palabras[a]=p;
        }
    }
    
    //Metodo que muestra las palabras del arreglo
    public void mostrarPalabra(){
        System.out.println("Las palabras ingresadas son:");
        //Bucle for each para mostrar las palabras
        for(String e:palabras){
            System.out.println(e);
        }
    }
}
