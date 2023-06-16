/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package prueba1_u2_johngalarza;
import java.util.Scanner;
/**
 *
 * @author johng
 */
public class Prueba1_U2_JohnGalarza {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Menu menu = new Menu();
        System.out.println("Ingrese el numero de figuras a calcular: ");
        int numFigura=in.nextInt();
        
        menu.menu(numFigura);
    }
    
}
