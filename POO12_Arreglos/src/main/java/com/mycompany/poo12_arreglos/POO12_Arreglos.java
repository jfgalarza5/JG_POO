package com.mycompany.poo12_arreglos;
import java.util.Scanner;
/**
 *
 * @author johng
 */
public class POO12_Arreglos {
    
    public static void main(String[] args) {
        //Declaracion de variables
        int opc,bandera_num=0,bandera_pal=0;
        //Declaracion de objetos
        Scanner in=new Scanner(System.in);
        Numero numero = new Numero();
        Palabra palabra = new Palabra();
        do{
            //Menu principal
            System.out.println("===MENU===");
            System.out.println("1. Ingresar numeros");
            System.out.println("2. Mostrar los numeros ingresados");
            System.out.println("3. Ingresar palabras");
            System.out.println("4. Mostrar las palabras ingresadas");
            System.out.println("5. Verificar si el quinto numero ingresado es mayor a 10");
            System.out.println("6. Salir");
            opc=in.nextInt();
            switch(opc){
                case 1:
                    numero.ingresoNumero();
                    //Variable bandera para verificar si ya se ingresaron los numeros
                    bandera_num++;
                    break;
                case 2:
                    //condicional que verifica a bandera
                    if (bandera_num!=0){
                        numero.mostrarNumero();
                    }else{
                        System.out.println("Aun no se ingresan numeros");
                    }
                    break;
                case 3:
                    palabra.ingresoPalabra();
                    //Variable bandera para verificar si ya se ingresaron las palabras
                    bandera_pal++;
                    break;
                case 4:
                    //condicional que verifica a bandera
                    if(bandera_pal!=0){
                        palabra.mostrarPalabra();
                    }else{
                        System.out.println("Aun no se ingresan palabras");
                    }
                    break;
                case 5:
                    //condicional que verifica a bandera
                    if(bandera_num!=0){
                        numero.mayorquediez();
                    }else{
                        System.out.println("Aun no se ingresan numeros");
                    }
                    break;
                case 6:
                    break;
            }
        }while(opc!=6);
    }
}
