/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.poo_p4_u2_leerfichero_galarza;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author johng
 */
public class POO_P4_U2_leerfichero_Galarza {

    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\johng\\OneDrive\\ESPE\\Segundo Semestre\\Taller\\POO\\POO1.txt"));
        String linea;
        try{
            while((linea=br.readLine())!=null){
                System.out.println(linea);
            }
        }catch(IOException ex){
            ex.printStackTrace();
        }
    }
}
