    package Modelo;

import java.util.Scanner;

public class Administrador extends Sistema{
    
    //Declaracion de variables
    String usuario;
    int opc;
    //Declaracion de arrays y objetos
    Scanner in = new Scanner(System.in);
    Menu menu;
    //Declaracion de variables y objetos privados
    private String contrasenia;
    
    //Constructores con sobrecarga
    public Administrador(String nombreProducto, Float precioProducto, int indice) {
        super(nombreProducto, precioProducto, indice);
    }
    public Administrador(){
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
            System.out.println("7. Salir");
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
    
    //Sobreescritura 
    @Override
    public void agregarProducto() {
        System.out.println("=========Agregar Producto==========");
        System.out.println("Ingrese el nombre del producto:");
        nombreProducto = in.nextLine();
        System.out.println("Ingrese el precio del producto:");
        precioProducto = in.nextFloat();
        in.nextLine(); // Limpiar el búfer de entrada
        productos.add(nombreProducto);
        precios.add(precioProducto);
        System.out.println("El producto "+nombreProducto+" se agrego exitosamente");
    }
}