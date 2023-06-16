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
public class Cuadrado extends Figura{
    Scanner in =  new Scanner(System.in);
    float lado;
    public Cuadrado(float lado){
        this.lado=lado;
    }
    int opc;
    public void menuCuadrado(){
        do{
            System.out.println("==CUADRADO==");
            System.out.println("1. Calcular area");
            System.out.println("2. Calcular perimetro");
            System.out.println("3. Salir");
            opc=in.nextInt();
            in.nextLine();
            switch(opc){
                case 1:
                    area();
                    break;
                case 2:
                    perimetro();
                    break;
            }            
        }while(opc!=3);

    }
    
    public void area(){
        System.out.println("El area del cuadrado es: "+(lado*lado)+"cm");
    }
    
    public void perimetro(){
        System.out.println("El perimetro del cuadrado es "+(lado*4)+"cm");
    }
}
