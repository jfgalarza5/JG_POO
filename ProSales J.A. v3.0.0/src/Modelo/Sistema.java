package Modelo;

import java.util.ArrayList;
import java.util.Scanner;

public class Sistema {
    String nombreProducto;
    Float precioProducto;
    int indice;
    //Declaracion de arrays y objetos
    Scanner in = new Scanner(System.in);
    
    ArrayList<String> productos = new ArrayList<String>();
    ArrayList<Float> precios = new ArrayList<Float>();
    ArrayList<String> cliente = new ArrayList<String>();
    private ArrayList<String> cedula = new ArrayList<>();
    
    //Constructores con sobrecarga
    public Sistema(String nombreProducto, Float precioProducto, int indice) {
        this.nombreProducto = nombreProducto;
        this.precioProducto = precioProducto;
        this.indice = indice;
    }
    public Sistema(){
    }
    
    //Metodo getter de encapsulamiento
    public ArrayList<String> getCedula() {
        return cedula;
    }
    //Metodo setter de encpasulamiento
    public void setCedula(String cedula) {
        this.cedula.add(cedula);
    }
    
    //Metodo que agrega un producto al array
    public void agregarProducto() {
        System.out.println("=========Agregar Producto==========");
        System.out.println("Ingrese el nombre del producto:");
        nombreProducto = in.nextLine();
        System.out.println("Ingrese el precio del producto:");
        precioProducto = in.nextFloat();
        in.nextLine(); // Limpiar el búfer de entrada
        productos.add(nombreProducto);
        precios.add(precioProducto);
    }
    
    //Metodo que busca un producto por su nombre
    public void buscarProducto() {
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
    public void eliminarProducto() {
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
    public void modificarProducto(){
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
        }
    }
    
    //Metodo que enlista los clientes ingresados
    public void listaClientes(){
        System.out.println("=========Lista de clientes==========");
        if (!cliente.equals(null)){
            for(String e:cliente){
                indice=cliente.indexOf(e);
                System.out.println(e+"      cedula: "+cedula.get(indice));
            }
        }else{
            System.out.println("Realice una venta para añadir clientes");
        }
    }
}
