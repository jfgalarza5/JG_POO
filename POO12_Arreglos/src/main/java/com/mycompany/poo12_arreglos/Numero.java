package com.mycompany.poo12_arreglos;
import java.util.Scanner;
/**
 *
 * @author johng
 */
public class Numero {
    //Se declaran variables
    int num;
    int [] numeros=new int[5];
    //Creamos nuestro objeto que almacena valores en variables
    Scanner in = new Scanner(System.in);
    
    //Metodo que permite el ingreso de numeros
    public void ingresoNumero(){
        System.out.println("Ingrese cinco numeros");
        //Bucle for para el ingreso los numeros
        for (int i=0;i<5;i++){
            System.out.println("Escriba el valor del numero "+(i+1));
            num=in.nextInt();
            numeros[i]=num;
        }
    }
    //Metodo que muestra los numeros ingresados
    public void mostrarNumero(){
        System.out.println("Los numeros ingresados son:");
        //Bucle for each para mostrar los numeros
        for(int numero:numeros){
            System.out.println(numero);
        }
    }
    //Metodo que verifica si el quinto numero es mayor a diez
    public void mayorquediez(){
        if(numeros[4]>10){
            System.out.println("El numero "+numeros[4]+" es mayor que diez");
        }else{
            System.out.println("El numero "+numeros[4]+" no es mayor que diez");
        }
    }
}
