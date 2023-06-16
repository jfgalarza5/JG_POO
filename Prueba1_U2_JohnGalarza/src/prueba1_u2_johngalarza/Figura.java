/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prueba1_u2_johngalarza;
import java.util.Scanner;

/**
 *
 * @author johng
 */
public class Figura {
    public void menu(){
        Scanner in = new Scanner(System.in);
        System.out.println("==MENU==");
        System.out.println("1. Calcular area");
        System.out.println("2. Calcular perimetro");
        System.out.println("3. Salir");
        int opc=in.nextInt();
    }
}
