package poo_u2p16_polimorfismo;
import java.util.Scanner;

public class POO_U2P16_POLIMORFISMO {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double lado,lado1;
        String color;
        System.out.println("==MENU==");
        System.out.println("1. Cuadrado");
        System.out.println("2. Circulo");
        System.out.println("3. Triangulo");
        int opc=in.nextInt();
        in.nextLine();
        switch(opc){
            case 1:
                System.out.println("Ingrese lado");
                lado=in.nextDouble();
                in.nextLine();
                System.out.println("Ingrese color");
                color=in.nextLine();
                mostrarDatosFiguras("Cuadrado", new Cuadrado(lado,color));
                break;
            case 2:
                System.out.println("Ingrese radio");
                lado=in.nextDouble();
                in.nextLine();
                System.out.println("Ingrese color");
                color=in.nextLine();
                mostrarDatosFiguras("Circulo", new Cuadrado(lado,color));                
                break;
            case 3:
                System.out.println("Ingrese la base");
                lado=in.nextDouble();
                System.out.println("Ingrese la altura");
                lado1=in.nextDouble();
                in.nextLine();
                System.out.println("Ingrese color");
                color=in.nextLine();   
                mostrarDatosFiguras("Triangulo",new Triangulo(lado,lado1,color));
                break;
        }  
    }
    //Aplicando polimorfismo
    //la gran ventaja del polimorfismo es la reutilizacion de codigo
    //al forzar a todas la clases a tener el mismo formato
    //esta expresión vale para cualquier subclase de figura
    //cuyos objetos vengan aqui coom parametros
    private static void mostrarDatosFiguras(String nombre, Figura f){
        System.out.println(nombre);
        System.out.println("Color "+f.getColor());
        System.out.println("Supericie "+f.superficie());
        System.out.println("");
    }
}
