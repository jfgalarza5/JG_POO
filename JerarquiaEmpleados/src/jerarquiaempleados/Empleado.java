package jerarquiaempleados;

import java.time.*;
import java.time.format.DateTimeFormatter;

//Clase padre abstracta 
public abstract class Empleado {
    //Se declaran las variables a utilizar 
    private String nombre;
    private int edad;
    private String fechaIngresado;
    private double salario;
    double BONO=200;
    String fechaHoy="2023-07-14";
    
    //Constructor que obtiene como parametros todos los datos de un empleado
    public Empleado(String nombre, int edad, String fechaIngresado, double salario) {
        this.nombre = nombre;
        this.edad = edad;
        this.fechaIngresado = fechaIngresado;
        this.salario = salario;
    }
    
    //Metodos getters y setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getFechaIngresado() {
        return fechaIngresado;
    }

    public void setMesesIngresado(String fechaIngresado) {
        this.fechaIngresado = fechaIngresado;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
    
    //Metodo que devuelve la diferencia de entre dos fechas
    public Period diferenciaFecha(){
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        LocalDate fecha1 = LocalDate.parse(fechaHoy,formatter);
        LocalDate fecha2 = LocalDate.parse(fechaIngresado,formatter);
        Period periodo = Period.between(fecha2, fecha1);
        return periodo;
    }
    //Metodo abstracto incentivar
    public abstract void incentivar();
}