package com.mycompany.getiondetienda;

/**
 *
 * @author johng
 */
import java.util.Scanner;

import java.util.ArrayList;

public class Administrador {
    //Declaracion de variables publicas
    String nombreProducto, usuario;
    int opc, indice;
    Float precioProducto;
    //Declaracion de arrays y objetos
    Scanner in = new Scanner(System.in);
    Menu menu;
    ArrayList<String> productos = new ArrayList<String>();
    ArrayList<Float> precios = new ArrayList<Float>();
    ArrayList<String> cliente = new ArrayList<String>();
    //Declaracion de variables y objetos privados
    private ArrayList<String> cedula = new ArrayList<>();
    private String contrasenia;
    //Metodo getter de encapsulamiento
    public ArrayList<String> getCedula() {
        return cedula;
    }
    //Metodo setter de encpasulamiento
    public void setCedula(String cedula) {
        this.cedula.add(cedula);
    }

    //Menu de administrador
    public void menuAdministrador() {
        menu=new Menu();
        menu.clean();
        //Verifica si haz entrado por primera vez y de ser asi pide que generes user y pasword
        if (usuario == null || contrasenia == null) {
            System.out.println("=======ACCESO DE ADMINISTRADOR=======");
            System.out.println("Ingrese su nombre de usuario:");
            usuario = in.nextLine();
            System.out.println("Ingrese su contraseña:");
            contrasenia = in.nextLine();
            System.out.println("Inicio de sesión exitoso.");
            System.out.println();
        } else {
            System.out.println("=======ACCESO DE ADMINISTRADOR=======");
            System.out.println("Ingrese su nombre de usuario:");
            String nombreUsuario = in.nextLine();
            System.out.println("Ingrese su contraseña:");
            String password = in.nextLine();

        if (!nombreUsuario.equals(usuario) || !password.equals(contrasenia)) {
            System.out.println("Nombre de usuario o contraseña incorrectos. Por favor ingrese nuevamente los datos .");
            menu.esperar(2);
            menu.clean();
            return;
        }
    }
        //Menu del administrador
        do {
            menu.clean();
            System.out.println("=========MENU DE ADMINISTRADOR==========");
            System.out.println("1. Agregar producto");
            System.out.println("2. Buscar producto");
            System.out.println("3. Lista de productos");
            System.out.println("4. Eliminar producto");
            System.out.println("5. Modificar producto");
            System.out.println("6. Lista de Clientes");
            System.err.println("7. Salir");
            opc = in.nextInt();
            in.nextLine(); // Limpiar el búfer de entrada
            menu.clean();
            //Metodo switch con la llamada a cada funcion
            switch (opc) {
                case 1:
                    agregarProducto();
                    break;
                case 2:
                    buscarProducto();
                    break;
                case 3:
                    mostrarProductos();
                    break;
                case 4:
                    eliminarProducto();
                    break;
                case 5:
                    modificarProducto();
                    break;
                case 6:
                    listaClientes();
                    break;
                case 7:
                    break;
                default:
                    System.out.println("Opcion no valida.");
            }
            if (opc!=7){
                menu.esperar(2);
            }
            menu.clean();
        } while (opc != 7);
    }
    //Metodo que agrega un producto al array
    private void agregarProducto() {
        System.out.println("=========Agregar Producto==========");
        System.out.println("Ingrese el nombre del producto:");
        nombreProducto = in.nextLine();
        System.out.println("Ingrese el precio del producto:");
        precioProducto = in.nextFloat();
        in.nextLine(); // Limpiar el búfer de entrada
        productos.add(nombreProducto);
        precios.add(precioProducto);
        System.out.println("Producto agregado exitosamente: " + nombreProducto);
    }
    //Metodo que busca un producto por su nombre
    private void buscarProducto() {
        System.out.println("=========Buscar Producto==========");
        System.out.println("Ingrese el nombre del producto a buscar:");
        nombreProducto = in.nextLine();
        indice = productos.indexOf(nombreProducto);

        if (indice != -1) {
            System.out.println("Producto encontrado: " + productos.get(indice));
            System.out.println("Precio del producto: $" + precios.get(indice));
        } else {
            System.out.println("El producto ingresado no existe");
        }
    }
    //Metodo que elimina un producto 
    private void eliminarProducto() {
        System.out.println("=========Eliminar producto==========");
        System.out.println("Ingrese el nombre del producto a eliminar:");
        nombreProducto = in.nextLine();
        indice = productos.indexOf(nombreProducto);
        if(indice!=-1){
            System.out.println("Producto eliminado exitosamente: " + productos.remove(indice));
            System.out.println("Precio del producto eliminado: $" +  precios.remove(indice));
        
        } else {
            System.out.println("El número de producto ingresado no es válido.");
        }
    }
    //Metodo que muestra la lista de productos
    public void mostrarProductos() {
        System.out.println("=========Lista de productos==========");
        for (String e : productos) {
            indice=productos.indexOf(e);
            System.out.println(e+"         Precio: "+precios.get(indice)+"$");
        }
        System.out.println("Presiona enter");
        in.nextLine();
    }
    //Metodo que modifica el precio de un producto
    private void modificarProducto(){
        System.out.println("=========Modificar precio==========");
        System.out.println("Ingrese el nombre del producto:");
        nombreProducto=in.nextLine();
        indice=productos.indexOf(nombreProducto);
        if(indice!=-1){
            System.out.println("Precio actual: "+precios.get(indice)+"$");
            System.out.println("Ingrese el nuevo precio: ");
            precioProducto=in.nextFloat();
            precios.add(indice,precioProducto);
            System.out.println("Precio actualizado");
        }else{
            System.out.println("No se ha ingresado ese producto");
        }
    }
    //Metodo que enlista los clientes ingresados
    private void listaClientes(){
        System.out.println("=========Lista de clientes==========");
        if (cliente.size()!=0){
            for(String e:cliente){
                indice=cliente.indexOf(e);
                System.out.println(e+"      cedula: "+cedula.get(indice));
            }
        }else{
            System.out.println("Realice una venta para añadir clientes");
        }
    }
}