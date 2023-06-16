/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.poo_practica13.excepciones_galarza;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author johng
 */
public class POO_Practica13Excepciones_Galarza {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try{
            String nombre = br.readLine();
            int div=8/0;
        }
        catch(IOException e){
            e.printStackTrace();
        }
        catch(ArithmeticException e){
            System.out.println("NO SE PUEDE DIVIDIR PARA CERO");
        }
    }
}
