/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.poo_l1_p6_metodos_johngalarza;
import javax.swing.JOptionPane;
/**
 *
 * @author ESPE
 */
public class Operaciones {
    
    //Se declara las variables de los numeros
    int num1;
    int num2;
    //Se declara las variables de las operaciones
    int suma,resta,multiplicacion,division; 
       
    //Declaracion de las metodos
    
    public void capturarnumeros(){
        //Codigo para pedir numeros
        num1=Integer.parseInt(JOptionPane.showInputDialog("Deme su primer numero"));
        num2=Integer.parseInt(JOptionPane.showInputDialog("Deme su segundo numero"));
    }
    //creacion de metodos suma,resta,multiplicacion y division
    
    //Metodo para sumar dos numeros
    public void sumar(){
        suma=num1+num2;
    }
    
    //creamos un metodo para restar
    public void restar(){
        resta=num1-num2;
    }
 
    //metodo que multiplica
    public void multiplicacion(){
        multiplicacion=num1*num2;
    }
    
    //metodo que divide
    public void division(){
        division=num1/num2;
    }
    
    //metodo que muestra los resultado
    public void resultado(){
        System.out.println("El resultado de la suma es: "+suma);
        System.out.println("El resultado de la resta es: "+resta);
        System.out.println("El resultado de la multiplicacion es: "+multiplicacion);
        System.out.println("El resultado de la division es: "+division);
    }
}

