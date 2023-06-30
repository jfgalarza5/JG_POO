
package gestion.de.horarios.laboratorios;
//Clase para las asignaturas de los laboratorios quimicos
public class AsignaturaComputo {
    //Declaracion de los atributos
    String nombre;
    int hora;
    Laboratorios laboratorio;
    
    //Constructor 
    public AsignaturaComputo(String nombre,int hora,Lab_Computacion laboratorio){
        this.nombre=nombre;
        this.hora=hora;
        this.laboratorio=laboratorio;
    }
}
