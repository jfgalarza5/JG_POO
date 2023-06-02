package com.mycompany.getiondetienda;

import java.util.Scanner;

public class Menu {
    // Creacion de los objetos a utilizar en el codigo
    Scanner in = new Scanner(System.in);
    Cajero cajero;
    Menu menu;
    Administrador admin = new Administrador();
    int opc;
    String nombreTienda;
    
    public Menu() {
        cajero = new Cajero(admin); // Crea una instancia de la clase Cajero pasando admin como parametro
    }
    //Menu principal
    public void menu_Cuenta() {
        System.out.println("Ingrese el nombre de su Tienda:"); 
        nombreTienda=in.nextLine(); 
        clean(); // Limpia la pantalla
        do {
            System.out.println("======MENÚ DE OPCIONES======"); 
            System.out.println("Tienda "+nombreTienda); 
            System.out.println(" ");
            System.out.println("Elija como desea ingresar: ");
            System.out.println("1. Administrador");
            System.out.println("2. Cajero");
            System.out.println("3. Salir");
            opc = in.nextInt(); 
            //Switch con la llamada a los respectivos metodos
            switch (opc) {
                case 1:
                    admin.menuAdministrador(); 
                    break;
                case 2:
                    cajero.ingreso_cajero(); 
                    cajero.menu_cajero(); 
                    break;
                case 3:
                    break;
                default:
                    System.out.println("Opción no válida"); 
                    break;
            }
        } while (opc != 3); 
    }
    // Pausa el programa durante el número de segundos especificado
    public void esperar(int segundos){
        try {
            Thread.sleep(segundos*1000); 
        } catch (Exception e) {
            System.out.println(e);
        }
    }
    // Limpia la pantalla utilizando espacios en blanco
    public void clean(){
        for(int i=0;i<10;i++){
            System.out.println(" ");
        }
    }
}
