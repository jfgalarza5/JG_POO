package jerarquiaempleados;

//Metodos que heredan de la clase abstracta empleado
public class Operario extends Empleado{
    //Atributos
    int Nivel;
    //Constructor que toma como atributo todos los datos de un operario
    public Operario(String nombre, int edad, String fechaIngresado, double salario, int Nivel) {
        super(nombre, edad, fechaIngresado, salario);
        this.Nivel=Nivel;
    }

    //Sobreescritura del metodo abstracto incentivar
    @Override
    public void incentivar() {
        if(diferenciaFecha().toTotalMonths()/12>30 && Nivel>2){
            setSalario(getSalario()+2*BONO);
        }else{
            if(diferenciaFecha().toTotalMonths()/12>30 || Nivel>20){
                setSalario(getSalario()+BONO);
            }
        }
    }
    //Metodo que actualiza el nivel del operario
    public void actualizarNivel(){
        if(Nivel<5&&diferenciaFecha().toTotalMonths()/12>2){
            Nivel++;
        }
    }
    //Metodo que muestra los datos
    public void mostrar(){
        System.out.println("Nombre: "+getNombre());
        System.out.println("Edad: "+getEdad());
        System.out.println("Fecha Ingresado: "+getFechaIngresado());
        System.out.println("Salario: "+getSalario());
        System.out.println("Meses en la empresa: "+diferenciaFecha().toTotalMonths());
        System.out.println("Nivel: "+Nivel);
    }
}
