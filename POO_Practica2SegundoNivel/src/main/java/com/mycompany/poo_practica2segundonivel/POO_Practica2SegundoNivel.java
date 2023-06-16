/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.poo_practica2segundonivel;

/**
 *
 * @author johng
 */
public class POO_Practica2SegundoNivel {

    public static void main(String[] args) {
        int numero[]=new int[5];
        try{
            numero[7]=0;
        }
        catch(java.lang.ArrayIndexOutOfBoundsException Error){
            System.out.println("Hola");
        }
    }
}