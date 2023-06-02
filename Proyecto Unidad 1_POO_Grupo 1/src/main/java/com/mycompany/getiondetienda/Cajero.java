package com.mycompany.getiondetienda;

/**
 *
 * @author johng
 */
import java.util.Scanner;
import java.util.ArrayList;

public class Cajero {
    // Declaración de objetos
    Scanner in = new Scanner(System.in);
    Administrador admin;
    Menu menu;

    // Declaración de variables y arrays públicos
    Double precioNeto;
    int opcCajero, numProducto, indice, ct, metodoPago;
    String nombreCajero, idCajero, nombreProducto, nombreCliente;
    Double precioProducto;
    ArrayList<String> productos = new ArrayList<>();
    ArrayList<Integer> cantidad = new ArrayList<Integer>();

    // Declaración de variables privadas
    private String idCliente;

    // Constructor que permite el uso de arrays entre clases
    public Cajero(Administrador admin) {
        this.admin = admin;
    }

    // Registro de cajero
    public void ingreso_cajero() {
        menu = new Menu();
        menu.clean();
        if (nombreCajero == null) {
            System.out.println("=========Registro de cajero==========");
            System.out.println();
            System.out.println("Ingresa tu Nombre:");
            nombreCajero = in.nextLine();
            System.out.println("Ingresa tu id: ");
            idCajero = in.nextLine();
            System.out.println(" ");
        }
        System.out.println("Bienvenido!! Cajero " + idCajero + " " + nombreCajero);
        menu.esperar(2);
        menu.clean();
    }

    // Menú de cajero
    public void menu_cajero() {
        do {
            menu.clean();
            System.out.println("=========MENU DE CAJERO==========");
            System.out.println("1. Consultar precios");
            System.out.println("2. Crear nueva factura");
            System.out.println("3: Salir");
            opcCajero = in.nextInt();
            // Consumir el salto de línea para evitar errores
            in.nextLine();
            // Borra la pantalla
            menu.clean();

            // Switch de con las opciones respectivas de cajero
            switch (opcCajero) {
                case 1:
                    consultarPrecios();
                    break;
                case 2:
                    crearNuevaFactura();
                    break;
                case 3:
                    break;
                default:
                    System.out.println("Opcion no valida.");
                    menu.esperar(1);
            }
        } while (opcCajero != 3);
    }

    //Metodo que consulta precios
    private void consultarPrecios() {
        System.out.println("==========Consultar precios===========");
        System.out.println("Ingrese el nombre del producto: ");
        nombreProducto = in.nextLine();
        indice = admin.productos.indexOf(nombreProducto);
        if (indice != -1) {
            System.out.println("Producto encontrado: " + admin.productos.get(indice));
            System.out.println("Precio del producto: $" + admin.precios.get(indice));
        } else {
            System.out.println("El producto ingresado no existe");
        }
        menu.esperar(3);
    }
    //Metodo para ingresar los datos de una factura
    private void crearNuevaFactura() {
        ct++;
        precioNeto = 0.0;
        numProducto = 0;
        do {
            System.out.println("=========Crear nueva factura==========");
            System.out.println("Ingrese los productos (Cuando termine escriba salir): ");
            System.out.println("                           Subtotal: " + precioNeto + "$");
            if (numProducto > 0) {
                for (String e : productos) {
                    indice = admin.productos.indexOf(e);
                    System.out.println(e + "      cant: " + cantidad.get(indice));
                }
            }
            nombreProducto = in.nextLine();
            indice = admin.productos.indexOf(nombreProducto);
            System.out.println(" ");
            if (indice != -1) {
                productos.add(nombreProducto);
                System.out.println("Cantidad de " + nombreProducto + " :");
                numProducto = in.nextInt();
                in.nextLine();
                cantidad.add(numProducto);
                precioNeto += Math.round(admin.precios.get(indice) * numProducto*100.0)/100.0;
            } else {
                if (!nombreProducto.equals("salir")) {
                    System.out.println("Producto no encontrado");
                }
            }
            menu.esperar(2);
            menu.clean();
        } while (!nombreProducto.equals("salir"));
        System.out.println("=========Crear nueva factura==========");
        System.out.println("Nombre del cliente o Consumidor final: ");
        nombreCliente = in.nextLine();
        if (!nombreCliente.equals("Consumidor final")) {
            admin.cliente.add(nombreCliente);
            System.out.println("Ingrese la cedula del cliente: ");
            idCliente = in.nextLine();
            admin.setCedula(idCliente);
        }
        menu.esperar(1);
        menu.clean();
        factura();
        pago();
        System.out.println(" ");
        System.out.println("Presione enter para continuar");
        in.nextLine();
        productos.clear();
    }

    //Metodo que genera una factura
    private void factura() {
        float iva = Math.round(precioNeto*12/100);
        System.out.println("_______________________________________________");
        System.out.println("FACTURA N°" + ct);
        System.out.println("_______________________________________________");
        System.out.println("Cliente: " + nombreCliente);
        System.out.println(" ");
        System.out.println("Descripcion:");
        for (String e : productos) {
            indice = admin.productos.indexOf(e);
            System.out.println(
                    e + "     Cant: " + cantidad.get(indice) + "    Precio: " + admin.precios.get(indice) * numProducto);
        }
        System.out.println("_______________________________________________");
        System.out.println("                                Subtotal: " + precioNeto + "$");
        System.out.println("                                Iva 12%:  " + iva + "$");
        System.out.println("_______________________________________________");
        System.out.println("TOTAL:                                    " + (precioNeto + iva)+"$");
    }

    //Solicita el ingreso del metodo de pago
    private void pago() {
        int opc;
        System.out.println(" ");
        System.out.println("________________________________________________");
        System.out.println(" ");
        System.out.println("Ingrese metodo de pago: ");
        System.out.println("1. Efectivo");
        System.out.println("2. Tarjeta");
        opc = in.nextInt();
        switch (opc) {
            case 1:
                System.out.println("Precio a pagar: " + (precioNeto + precioNeto * 12 / 100));
                System.out.println("Presione enter");
                in.nextLine();
                in.nextLine();
                break;
            case 2:
                System.out.println("Deslice la tarjeta en el lector");
                System.out.println("Presione enter");
                in.nextLine();
                in.nextLine();
                System.out.println("Ingrese el pin de seguridad");
                in.nextLine();
                break;
            default:
                System.out.println("Opcion no valida");
        }
        System.out.println("Pago realizado con exito");
    }
}
