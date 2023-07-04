package gestion.de.horarios.laboratorios;
import java.util.ArrayList;
import java.util.Collections;
//Clase padre o base de los laboratorios
public class Laboratorios {
    //Definir los atributos 
    String nombreLab, encargado;
    int capacidad;
    String[] equipoList;
    int horaCerrar;
    //Arreglo dinamico que inicia con 24 espacios vacios, que representan las 24 horas del dia
    //que seran llenadas por consola
    ArrayList<String> horario = new ArrayList<>(Collections.nCopies(24, null));
    //Constructor con sobrecarga que inicializa los atributos
    public Laboratorios(String nombreLab, int capacidad, String[] equipoList, int horaCerrar, String encargado){
        this.capacidad=capacidad;
        this.equipoList=equipoList;
        this.nombreLab=nombreLab;
        this.horaCerrar=horaCerrar;
        this.encargado=encargado;
    }
    
    public Laboratorios(ArrayList<String> horario){
        this.horario=horario;
    }
    
    //Metodo que verifica la disponibilidad del laboratorio
    public boolean disponibilidad(int hora, String asignatura){
        if(horario.get(hora)==null && hora<horaCerrar){
            horario.add(hora, asignatura);
            return true;
        }else{
            return false;
        }
    }
}