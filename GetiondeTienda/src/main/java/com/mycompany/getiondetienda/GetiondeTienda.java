package com.mycompany.getiondetienda;

/**
 *
 * @author johng
 */
public class GetiondeTienda {

    public static void main(String[] args) {
        Menu menu = new Menu(); // Crea la instancia menu de la clase Menu
        menu.clean();  // Limpia la pantalla
        // Presentacion del proyecto
        System.out.println("=========Universidad de las Fuerzas Armadas ESPE=========");
        System.out.println("            Programacion Orientada a Objetos              ");
        System.out.println("=============Sistema de Gestion de Tienda=================");
        System.out.println("Integrantes: John Galarza,  Juan Jimenez, Andres Pantoja, Sahid Bosquez");
        System.out.println("Grupo: 1."); 
        menu.esperar(4);
        menu.clean(); 
        menu.menu_Cuenta(); 
        System.out.println(".....Cerrando"); 
        menu.esperar(3); 
        System.out.println("Hasta pronto....."); 
    }
}

