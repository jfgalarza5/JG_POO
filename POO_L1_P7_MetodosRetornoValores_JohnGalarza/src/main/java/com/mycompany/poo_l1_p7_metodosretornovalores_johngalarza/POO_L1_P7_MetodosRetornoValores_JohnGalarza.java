/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.poo_l1_p7_metodosretornovalores_johngalarza;

import javax.swing.JOptionPane;
/**
 *
 * @author ESPE
 */
public class POO_L1_P7_MetodosRetornoValores_JohnGalarza {

    public static void main(String[] args) {
        Operaciones op1 = new Operaciones();
        //Se pide al usuario dos numeros
        int num1 = Integer.parseInt(JOptionPane.showInputDialog("Deme el primer numero"));
        int num2 = Integer.parseInt(JOptionPane.showInputDialog("Deme el segundo numero"));
        op1.resultados(op1.sumar(num1, num2),op1.restar(num1, num2),op1.multiplicar(num1, num2),op1.dividir(num1, num2));
        
    }
}
