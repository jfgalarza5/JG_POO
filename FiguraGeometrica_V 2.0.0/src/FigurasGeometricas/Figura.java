/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package FigurasGeometricas;
/**
 *
 * @author johng
 */
public class Figura {
    float lado;
    public void area(){
        System.out.println("El area de la figura es: "+(lado*lado));
    }
    public void perimetro(){
        System.out.println("El perimetro de la figura es: "+(lado*4));
    }
}
