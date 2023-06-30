/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistema.bancario;

import java.util.Scanner;

/**
 *
 * @author johng
 */
public class Menu {
    int opc;
    String nombre,cedula;
    double dinero, limitante;
    Scanner in = new Scanner(System.in);
    Cuenta cuenta;
    C_Limitada cuentalimitada;
    
    public void menu(){
        do{
            System.out.println("===MENU BANCARIO===");
            System.out.println("1. Crear cuenta");
            System.out.println("2. Cuenta normal");
            System.out.println("3. Cuenta limitada");
            System.out.println("4. Mostrar cuentas");
            System.out.println("5. Salir");
            opc=in.nextInt();
            in.nextLine();
            switch(opc){
                case 1:
                    crearCuenta();
                    break;
                case 2:
                    cuentaNormal();
                    break;
                case 3:
                    cuentaLimitada();
                    break;
                case 4:
                    mostrarCuentas();
                    break;
            }
        }while(opc!=5);
    }
    
    public void crearCuenta(){
        System.out.println("===CUENTA===");
        System.out.println("1. Cuenta normal");
        System.out.println("2. Cuenta limitada");
        opc=in.nextInt();
        in.nextLine();
        switch(opc){
            case 1:
                System.out.println("Ingrese el nombre el del propietario: ");
                nombre=in.nextLine();              
                System.out.println("Ingrese la cedula");
                cedula=in.nextLine();
                System.out.println("Ingrese el monto inicial");
                dinero=in.nextDouble();
                cuenta = new Cuenta(dinero, nombre);
                cuenta = new Cuenta(cedula);
                break;
            case 2:
                System.out.println("Ingrese el nombre el del propietario: ");
                nombre=in.nextLine();              
                System.out.println("Ingrese la cedula");
                cedula=in.nextLine();
                System.out.println("Ingrese el monto inicial");
                dinero=in.nextDouble();
                System.out.println("Ingrese el limitante");
                limitante=in.nextDouble();
                cuentalimitada = new C_Limitada(limitante ,dinero, nombre, cedula);
                break;         
        }

    }
    
    public void cuentaNormal(){
        System.out.println("==CUENTA NORMAL==");
        System.out.println("1. Ingresar monto");
        System.out.println("2. Retirar monto");
        System.out.println("3. Saldo actual");
        opc=in.nextInt();
        in.nextLine();
        switch(opc){
            case 1:
                System.out.println("Ingrese el monto a agregar");
                dinero=in.nextDouble();
                cuenta.ingreso(dinero);               
                break;
            case 2:
                System.out.println("Ingrese el monto a retirar");
                dinero=in.nextDouble();
                cuenta.salida(dinero);
                break;
            case 3:
                System.out.println("El saldo actual es: "+cuenta.saldo()+"$");
                break;
        }

    }
    
    public void cuentaLimitada(){
        System.out.println("==CUENTA LIMITADA==");
        System.out.println("1. Ingresar monto");
        System.out.println("2. Retirar monto");
        System.out.println("3. Saldo actual");
        opc=in.nextInt();
        in.nextLine();
        switch(opc){
            case 1:
                System.out.println("Ingrese el monto a agregar");
                dinero=in.nextDouble();
                cuentalimitada.ingreso(dinero);               
                break;
            case 2:
                System.out.println("Ingrese el monto a retirar");
                dinero=in.nextDouble();
                cuentalimitada.salida(dinero);
                break;
            case 3:
                System.out.println("El saldo actual es: "+cuentalimitada.saldo()+"$");
                break;
        }       
    }
    
    public void mostrarCuentas(){
        System.out.println("===CUENTA NORMAL===");
        System.out.println("Propietario: "+cuenta.nombreProp);
        System.out.println("Cedula: "+cuenta.cedula);
        System.out.println("Saldo: "+cuenta.dinero);
        System.out.println(" ");
        System.out.println("===CUENTA LIMITADA===");
        System.out.println("Propietario: "+cuentalimitada.nombreProp);
        System.out.println("Cedula: "+cuentalimitada.cedula);
        System.out.println("Limitante: "+cuentalimitada.limitante);
        System.out.println("Saldo: "+cuentalimitada.dinero);
        
    }
}
