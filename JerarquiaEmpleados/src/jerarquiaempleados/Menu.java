package jerarquiaempleados;

import java.util.Scanner;

//Clase encargada de mostrar el menu principal
public class Menu {
    
    //Se declaran los atributso necesarios para la reocleccion de los datos
    String nombre;
    int edad,personal;
    String fecha,departamento;
    double salario;
    int nivel;
    Scanner in = new Scanner(System.in);
    //Metodo que muestra el menu principal
    public void menu(){
        System.out.println("==JERARQUIA DE EMPLEADOS==");
        System.out.println("");
        //Se reocgen los datos del director
        System.out.println("=========Director=========");
        System.out.print("Nombre: ");
        nombre=in.nextLine();
        System.out.print("Edad: ");
        edad=in.nextInt();
        in.nextLine();
        System.out.print("Fecha Ingresado (yyyy-mm-dd): ");
        fecha=in.nextLine();
        System.out.print("Salario: ");
        salario=in.nextDouble();
        in.nextLine();
        System.out.print("Departamento: ");
        departamento=in.nextLine();
        System.out.print("Personal: ");
        personal=in.nextInt();
        in.nextLine();
        //Se crea un objeto director mandandando como parametros al contructor todos los datos 
        //antes ingresados
        Director director=new Director(nombre,edad,fecha,salario,personal,departamento);
        System.out.println("");
        
        //Se recogen los datos del operario
        System.out.println("=========Operario=========");
        System.out.print("Nombre: ");
        nombre=in.nextLine();
        System.out.print("Edad: ");
        edad=in.nextInt();
        in.nextLine();
        System.out.print("Fecha Ingresado (yyyy-mm-dd): ");
        fecha=in.nextLine();
        System.out.print("Salario: ");
        salario=in.nextDouble();
        System.out.print("Nivel: ");
        nivel=in.nextInt();
        in.nextLine();
        //Se crea un objeto operario mandandando como parametros al contructor todos los datos 
        //antes ingresados
        Operario operario=new Operario(nombre,edad,fecha,salario,nivel);
        System.out.println("");
        System.out.println("");
        System.out.println("");
        //Se muestran los datos en pantalla
        System.out.println("==DATOS==");
        System.out.println("==OPERARIO==");
        operario.actualizarNivel();
        operario.incentivar();
        operario.mostrar();
        System.out.println("");
        System.out.println("==DIRECTOR==");
        director.incentivar();
        director.mostrar();
    }
}
