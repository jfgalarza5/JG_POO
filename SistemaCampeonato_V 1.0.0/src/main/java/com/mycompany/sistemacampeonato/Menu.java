/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sistemacampeonato;
import java.util.Scanner;
public class Menu {
    Scanner in = new Scanner(System.in);
    int opc;
    Equipos equipo=new Equipos();
    Agenda agenda=new Agenda(equipo);
    
    public void menu_campeonato(){
        do{
            System.out.println("====Gestion Campeonato===");
            System.out.println("1. Ingresar Equipos");
            System.out.println("2. Ingresar Jugadores");
            System.out.println("3. Agenda");
            System.out.println("4. Salir");
            opc=in.nextInt();
            in.nextLine();
            switch(opc){
                case 1:
                    equipo.ingresarEquipos();
                    break;
                case 2:
                    equipo.ingresarJugadores();
                    break;
                case 3:
                    agenda.menuAgenda();
                    break;
                case 4:
                    break;
            }
        }while(opc!=4);
    }
}
