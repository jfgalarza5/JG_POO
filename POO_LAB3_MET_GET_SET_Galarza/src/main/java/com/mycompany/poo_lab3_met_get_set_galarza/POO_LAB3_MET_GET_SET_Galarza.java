package com.mycompany.poo_lab3_met_get_set_galarza;
import java.util.Scanner;
import javax.swing.*;
/**
 *
 * @author johng
 */
public class POO_LAB3_MET_GET_SET_Galarza {

    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in); //Creando un objeto para ingresar valores
        String nombre, apellido;
        int edad;
        //Capturando valores
        System.out.println("Ingresar nombre");
        nombre=teclado.nextLine();
        System.out.println("Ingresar apellido");
        apellido=teclado.nextLine();
        System.out.println("Ingresar edad");
        edad=teclado.nextInt();
        
        //creamos un objeto
        Persona persona1=new Persona();
        persona1.setNombre(nombre);
        persona1.setApellido(apellido);
        persona1.setEdad(edad);
        //Mostrar los valores almacenados
        System.out.println("El nombre es: "+persona1.getNombre());
        System.out.println("El apellido es: "+persona1.getApellido());
        System.out.println("La edad es: "+persona1.getEdad());
    }
}
