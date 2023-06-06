package com.mycompany.sistemacampeonato;
import java.util.ArrayList;
import java.util.Scanner;
/**
 *
 * @author johng
 */
public class Agenda {
    int opc,indice;
    Scanner in = new Scanner(System.in);
    String fechaPartido,nombreEquipo1,nombreEquipo2,enfrentamiento;
    ArrayList<String> fecha = new ArrayList<>();
    ArrayList<String> partido = new ArrayList<>();
    Equipos equipo;
    
    public Agenda(Equipos equipo){
        this.equipo=equipo;
    }
    
    public void menuAgenda(){
        do{
            System.out.println("====Menu Agenda====");
            System.out.println("1. Crear nueva Agenda");
            System.out.println("2. Mostrar Agenda");
            System.out.println("3. Salir");
            opc=in.nextInt();
            in.nextLine();
            switch(opc){
                case 1:
                    nuevaAgenda();
                    break;
                case 2:
                    mostrarAgenda();
                    break;
                case 3:
                    break;
            } 
        }while(opc!=3);
    }
    
    public void nuevaAgenda(){
        fecha.clear();
        partido.clear();
        for(int i=0;i<4;i++){
            System.out.println("===FECHA "+(i+1)+"===");
            for(int j=0;j<2;j++){
                System.out.println("Ingresar la fecha del partido "+(j+1)+" (DD/MM/AAAA)");
                fechaPartido=in.nextLine();
                fecha.add(fechaPartido);
                System.out.println("Ingresar los equipos que debutaran");
                do{
                    System.out.print("Equipo 1: ");
                    nombreEquipo1=in.nextLine();
                    indice=equipo.equipo.indexOf(nombreEquipo1);
                    if(indice==-1){
                        System.out.println("Equipo no existente");
                    }
                }while(indice==-1);
                do{
                    System.out.print("Equipo 2: ");
                    nombreEquipo2=in.nextLine();
                    indice=equipo.equipo.indexOf(nombreEquipo2);
                    if(indice==-1){
                        System.out.println("Equipo no existe");
                    }
                }while(indice==-1);
                enfrentamiento=nombreEquipo1+" vs "+nombreEquipo2;
                partido.add(enfrentamiento);
            }
        }
    }
    public void mostrarAgenda(){
        int count=0;
        System.out.println("===AGENDA===");
        for(String e:fecha){
            count++;
            indice=fecha.indexOf(e);
            System.out.println("Partido "+count+"     Fecha: "+e+"    Encuentro: "+partido.get(indice));
        }
    }
}
