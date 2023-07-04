package gestion.de.horarios.laboratorios;
//Clase para las asignaturas de los laboratorios quimicos
public class AsignaturaQuimica {
    //Declaracion de los atributos
    String nombre;
    int hora;
    Lab_Quimica laboratorio;
    
    //Constructor 
    public AsignaturaQuimica (String nombre,int hora,Lab_Quimica laboratorio){
        this.nombre=nombre;
        this.hora=hora;
        this.laboratorio=laboratorio;
    }
}
