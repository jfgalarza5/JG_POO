/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.poo_22_leerficheros;
import java.io.*;

/**
 *
 * @author johng
 */
public class POO_22_LeerFicheros {

    public static void main(String[] args) {
        try(BufferedReader br=new BufferedReader(new FileReader("C:\\archivos de programacion\\Aldo.txt"))){
            BufferedWriter bw = new BufferedWriter(new FileWriter("C:\\archivos de programacion\\Aldo.txt"));
            
            bw.write("Esto es una palabra usando Buffered");
            bw.newLine();
            bw.write("Seguimos usando Buffered");
            bw.newLine();
            bw.write("Hola a todos");
            
            bw.flush();
            
            
            String linea=br.readLine();
            while(linea!=null){
                System.out.println(linea);
                linea=br.readLine();
            }
        }catch(IOException e){
            System.out.println(e);
        }
    }
}
