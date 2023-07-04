package gestion.de.horarios.laboratorios;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
//Clase menu donde se ejecuta la mayor parte del codigo
public class Menu {
    //Declaracion de atributos
    Scanner in = new Scanner(System.in);
    int opc,count, countC=1, countQ=1,countA=1;
    int numLab,capacidadLab, horaCerrar, numComputadoras, numMicrooscopios;
    int numAsig, horaAsig;
    String nombreLab, equipoLab, lugarLab, encargadoLab;
    String nombreAsig;
    String [] equipoList; 
    Lab_Computacion lab_computacion;
    Lab_Quimica lab_quimica;
    ArrayList<Lab_Computacion> LabComputacion = new ArrayList<>();
    ArrayList<Lab_Quimica> LabQuimica = new ArrayList<>();
    ArrayList<String> horario = new ArrayList<>(Collections.nCopies(24, null));
    ArrayList<AsignaturaQuimica> AsignaturaQuimica = new ArrayList<>();
    ArrayList<AsignaturaComputo> AsignaturaComputo = new ArrayList<>();
    
    //Metodo principal menu
    public void menu(){
        do{
            System.out.println("=====SISTEMA DE GESTION DE HORARIOS DE LABORATORIOS=====");
            System.out.println("============MENU============");
            System.out.println("1. Agregar laboratorios");
            System.out.println("2. Asignar horarios");
            System.out.println("3. Informacion de laboratorios");
            System.out.println("4. Salir");
            opc=in.nextInt();
            in.nextLine();
            switch(opc){
                case 1:
                    agregarLabs();
                    break;
                case 2:
                    agregarAsignatura();
                    break;
                case 3:
                    informacionLabs();
                    break;
            }
        }while(opc!=4);        
    }
    
    //Metodo que permite agregar un nuevo laboratorio
    public void agregarLabs(){
        System.out.println("===Agregar Laboratorios===");
        System.out.println("1. Laboratorio de Computacion");
        System.out.println("2. Laboratorio de Quimica");
        opc=in.nextInt();
        System.out.println("¿Cuantos laboratorios va a ingresar?");
        numLab=in.nextInt();
        in.nextLine();
        switch(opc){
            case 1:
                
                for(int i=0;i<numLab;i++){
                    System.out.println(" ");
                    System.out.println("====LAB "+(countC++)+"====");
                    System.out.println("Ingresa el nombre del laboratorio");
                    nombreLab=in.nextLine();
                    System.out.println("Ingresa la capacidad del laboratorio");
                    capacidadLab=in.nextInt();
                    in.nextLine();
                    System.out.println("Ingresa los equipos del laboratorio (separando con una coma)");
                    equipoLab=in.nextLine();
                    equipoList=equipoLab.split(", ");
                    System.out.println("Ingrese la hora a la que cierra el laboratorio");
                    horaCerrar=in.nextInt();
                    in.nextLine();
                    System.out.println("Ingrese el nombre del encargado de este laboratorio");
                    encargadoLab=in.nextLine();
                    System.out.println("Ingrese el lugar donde se ubica el laboratorio");
                    lugarLab=in.nextLine();
                    System.out.println("Ingrese el numero de computadoras disponibles");
                    numComputadoras=in.nextInt();
                    in.nextLine();
                    LabComputacion.add(new Lab_Computacion(nombreLab,capacidadLab, equipoList, horaCerrar, horario,encargadoLab,lugarLab,numComputadoras));
                }
                break;
            case 2:
                
                for(int i=0;i<numLab;i++){
                    System.out.println("====LAB "+(countQ++)+"====");
                    System.out.println("Ingresa el nombre del laboratorio");
                    nombreLab=in.nextLine();
                    System.out.println("Ingresa la capacidad del laboratorio");
                    capacidadLab=in.nextInt();
                    in.nextLine();
                    System.out.println("Ingresa los equipos del laboratorio (separando con una coma)");
                    equipoLab=in.nextLine();
                    equipoList=equipoLab.split(", ");
                    System.out.println("Ingrese la hora a la que cierra el laboratorio");
                    horaCerrar=in.nextInt();
                    in.nextLine();
                    System.out.println("Ingrese el nombre del encargado de este laboratorio");
                    encargadoLab=in.nextLine();
                    System.out.println("Ingrese el lugar donde se ubica el laboratorio");
                    lugarLab=in.nextLine();
                    System.out.println("Ingrese el numero de microoscopios disponibles");
                    numMicrooscopios=in.nextInt();
                    in.nextLine();
                    LabQuimica.add(new Lab_Quimica(nombreLab,capacidadLab,equipoList,horaCerrar,horario,encargadoLab,lugarLab,numMicrooscopios));
                }
                break;
        }
    }
    
    //Metodo que permite agregar una nueva asignatura y asignarla a un laboratorio
    public void agregarAsignatura(){
        System.out.println("¿Cuantas asignaturas va a ingresar?");
        numAsig=in.nextInt();
        in.nextLine();
        for(int i=0;i<numAsig;i++){
            System.out.println("====ASIGNATURA "+(countA++)+"====");
            System.out.println("Nombre: ");
            nombreAsig=in.nextLine();
            System.out.println("Escoja el laboratorio");
            System.out.println("1. Computacion");
            System.out.println("2. Quimica");
            opc=in.nextInt();
            in.nextLine();
            switch(opc){
                case 1:
                    System.out.println("Ingrese el numero del laboratorio: ");
                    numLab=in.nextInt();
                    in.nextLine();
                   if(LabComputacion.size()>=numLab){
                       lab_computacion=LabComputacion.get(numLab-1);
                       System.out.println("Ingrese la hora que solicitara este laboratorio");
                       horaAsig=in.nextInt();
                       in.nextLine();
                       if(lab_computacion.disponibilidad(horaAsig, nombreAsig)){
                           AsignaturaComputo.add(new AsignaturaComputo(nombreAsig,horaAsig,lab_computacion));
                           LabComputacion.set(numLab-1, lab_computacion);
                           System.out.println("Ingresado con exito");
                       }else{
                           System.out.println("Hora ocupada o Laboratorio cerrado");
                           countA--;
                       }
                    }else{
                       System.out.println("Laboratorio no encontrado");
                       countA--;
                   }
                    break;
                case 2:
                    System.out.println("Ingrese el numero del laboratorio: ");
                    numLab=in.nextInt();
                    in.nextLine();
                    if(LabComputacion.size()>=numLab){
                        lab_quimica=LabQuimica.get(numLab-1);
                        System.out.println("Ingrese la hora que solicitara este laboratorio");
                        horaAsig=in.nextInt();
                        in.nextLine();
                        if(lab_quimica.disponibilidad(horaAsig, nombreAsig)){
                            AsignaturaQuimica.add(new AsignaturaQuimica(nombreAsig,horaAsig,lab_quimica));
                            LabQuimica.set(numLab-1, lab_quimica);
                            System.out.println("Ingresado con exito");
                        }else{
                            System.out.println("Hora ocupada o Laboratorio cerrado");
                            countA--;
                        }
                     }else{
                        System.out.println("Laboratorio no encontrado");
                        countA--;
                    }
                    break;
            }
        }
    }
    
    //Metodo que imprime todos los laboratorios ingresados
    public void informacionLabs(){
        count=1;
        System.out.println("====Laboratorios de computacion====");
        for(Lab_Computacion laboratorio:LabComputacion){
            System.out.println("=========LAB "+(count++)+"=========");
            System.out.println("Nombre:         "+laboratorio.nombreLab);
            System.out.println("Capacidad:      "+laboratorio.capacidad);
            System.out.println("Equipos:      ");
            for(String e: laboratorio.equipoList){
                System.out.println("* "+e);
            }
            System.out.println("Hora de cerrar: "+laboratorio.horaCerrar);
            System.out.println("Encargado:      "+laboratorio.encargado);
            System.out.println("Lugar:          "+laboratorio.lugar);
            System.out.println("Num. computadoras: "+laboratorio.numComputadoras);
        }
        count=1;
        System.out.println("====Laboratorios de quimica====");
        for(Lab_Quimica laboratorio:LabQuimica){
            System.out.println("=========LAB "+(count++)+"=========");
            System.out.println("Nombre:         "+laboratorio.nombreLab);
            System.out.println("Capacidad:      "+laboratorio.capacidad);
            System.out.println("Equipos: ");
            for(String e: laboratorio.equipoList){
                System.out.println("* "+e);
            }
            System.out.println("Hora de cerrar: "+laboratorio.horaCerrar);
            System.out.println("Encargado:      "+laboratorio.encargado);
            System.out.println("Lugar:          "+laboratorio.lugar);
            System.out.println("Num. computadoras: "+laboratorio.numMicrooscopios);
        }
    }
}