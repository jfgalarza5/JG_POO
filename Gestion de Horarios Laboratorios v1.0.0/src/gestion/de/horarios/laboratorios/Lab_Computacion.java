package gestion.de.horarios.laboratorios;
import java.util.ArrayList;
//Clase hija que hereda sus objetos y metodos de la clase padre Laboratorios
public class Lab_Computacion extends Laboratorios{
    //Declaracion de atributos
    String lugar;
    int numComputadoras;
    
    //Constructor
    public Lab_Computacion(String nombreLab, int capacidad, String[] equipoList, int horaCerrar, ArrayList<String> horario, String encargado, String lugar,int numComputadoras) {
        super(nombreLab, capacidad, equipoList, horaCerrar, encargado, horario);
        this.lugar=lugar;
        this.numComputadoras=numComputadoras;
    }
}