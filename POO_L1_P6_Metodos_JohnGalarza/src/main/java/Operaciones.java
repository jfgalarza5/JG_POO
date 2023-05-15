/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ESPE
 */
import javax.swing.JOptionPane;
public class Operaciones {
    //Se declara las variables de los numeros
    int num1;
    int num2;
    //Se declara las variables de las operaciones
    int suma,resta,multiplicaion,division; 
       
    //Declaracion de las metodos
    
    Public void capturarnumeros(){
        //Codigo para pedir numeros
        num1=Integer.parseInt(JOptionPane.showInputDialog("Deme su primer numero"));
        num2=Integer.parseInt(JOptionPane.showInputDialog("Deme su segundo numero"));
    }
    
}
