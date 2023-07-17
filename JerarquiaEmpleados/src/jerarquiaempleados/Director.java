package jerarquiaempleados;

//Metodos que heredan de la clase abstracta empleado
public class Director extends Empleado{
    //Se crean los atributos
    String departamento;
    int personal;
    //Constructor que toma como parametros los datos de un director
    public Director(String nombre, int edad, String fechaIngresado, double salario, int personal, String departamento) {
        super(nombre, edad, fechaIngresado, salario);
        this.departamento=departamento;
        this.personal=personal;
    }
    //Sobreescritura del metodo abstracto incentivar
    @Override
    public void incentivar() {
        if(diferenciaFecha().toTotalMonths()>30 && personal>20){
            setSalario(getSalario()+2*BONO);
        }else{
            if(diferenciaFecha().toTotalMonths()>30 || personal>20){
                setSalario(getSalario()+BONO);
            }
        }
    }
    //Metodo que muestra los datos ingresados
    public void mostrar(){
        System.out.println("Nombre: "+getNombre());
        System.out.println("Edad: "+getEdad());
        System.out.println("Fecha Ingresado: "+getFechaIngresado());
        System.out.println("Salario: "+getSalario());
        System.out.println("Meses en la empresa: "+(diferenciaFecha().toTotalMonths()));
        System.out.println("Personal: "+personal);
        System.out.println("Departamento: "+departamento);
    }
}
