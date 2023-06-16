/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sistemacampeonato;
import java.util.Scanner;
import java.util.ArrayList;

public class Equipos {
    int numEquipo,numCarrera,indice;
    String nombreEquipo,nombreJugador;
    Scanner in = new Scanner(System.in);
    ArrayList<String> equipo = new ArrayList<>();
    ArrayList<String> jugador = new ArrayList<>();
    ArrayList<String> carrera = new ArrayList<>();
    
    public void ingresarEquipos(){
        System.out.println("Ingresa el numero de equipos: ");
        numEquipo=in.nextInt();
        in.nextLine();
        for(int i=0;i<numEquipo;i++){
            System.out.println("Ingresa el equipo "+(i+1));
            nombreEquipo=in.nextLine();
            equipo.add(nombreEquipo);
        }
    }
    public void ingresarJugadores(){
        for(int i=0;i<numEquipo;i++){
           nombreEquipo=equipo.get(i);
           System.out.println("Ingresar los jugadores del equipo "+nombreEquipo); 
           for(int j=0;j<8;j++){
               System.out.println("Ingrese el nombre del jugador "+(j+1));
               nombreJugador=in.nextLine();
               jugador.add(nombreJugador);
               System.out.println("Ingrese la carrera del jugador "+nombreJugador);
               System.out.println("1. ITIN");
               System.out.println("2. Biotecnologia");
               System.out.println("3. Agropecuaria");
               numCarrera=in.nextInt();
               in.nextLine();
               switch(numCarrera){
                   case 1:
                       carrera.add("ITIN");
                       break;
                   case 2:
                       carrera.add("Biotecnologia");
                       break;
                   case 3:
                       carrera.add("Agropecuaria");
                       break;
               }
           }
        }
    }
    public void listaEquipos(){
        int c=1;
        for(String e:equipo){
            System.out.println("Equipo "+c+" "+e);
            c++;
        }
    }
    public void listaJugadores(){
        System.out.println("Escriba el nombre del equipo para visualizar sus jugadores");
        nombreEquipo=in.nextLine();
        indice=equipo.indexOf(nombreEquipo);
        if(indice!=-1){
            int aux=indice*8,c=1;
            for(int i=aux;i<=aux+7;i++){
                System.out.println("Jugador "+c+": "+jugador.get(i)+" - Carrera: "+carrera.get(i));
                c++;
            }
        }else{
            System.out.println("Equipo no encontrado");
        }
        
    }
}
