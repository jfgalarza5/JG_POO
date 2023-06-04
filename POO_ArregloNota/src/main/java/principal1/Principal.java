/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package principal1;
import java.util.Scanner;
import notas.GestionNotas;

/**
 *
 * @author johng
 */
public class Principal {
    public static void main(String[] args){
         GestionNotas gnotas=new GestionNotas();
        int op = 0;
        Scanner sc=new Scanner(System.in);
        double nota;
        do{
            System.out.println("1. Añadir Nota");
            System.out.println("2. Ver Media");
            System.out.println("3. Ver Aprobado");
            System.out.println("4. Salir");
            op=Integer.parseInt(sc.nextLine());
        }while(op!=4);
        switch(op){
            case 1 -> {
                System.out.println("Ingresa nota");
                nota=Double.parseDouble(sc.nextLine());
                gnotas.guardarNota(nota);
            }
            case 2 -> System.out.println("La media es: "+ gnotas.media());
            case 3 -> System.out.println("Aprobados"+gnotas.aprovados());
        }           
    }
}
