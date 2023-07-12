package laboratorio3_gestion.de.productos;

import java.util.ArrayList;
import java.util.Scanner;

//Clase menu que muestra recopila los datos del pedido
public class Menu {
    //Definicion de atributos y objetos
    Scanner in = new Scanner(System.in);
    String nombreProducto;
    double precio;
    double seccion, total=0;
    //Arreglo que almacenara los objetos instanciados de las dos clases respectivas
    ArrayList<ProductoEstandar> estandar = new ArrayList<>();
    ArrayList<ProductoOfertado> ofertado = new ArrayList<>();
    
    //Metodo que muestra el menu
    public void menu(){
        //Pedidos del producto estandar
        System.out.println("==PEDIDOS==");
        System.out.println("==Pedidos del producto estandar==");
        System.out.println("Con 10% de descuento");
        for(int i=0;i<2;i++){
            System.out.println("PRODUCTO "+(i+1));
            System.out.println("Ingrese el nombre del producto");
            nombreProducto=in.nextLine();
            System.out.println("Ingrese el precio del producto");
            precio=in.nextDouble();
            in.nextLine();
            System.out.println("Ingrese el numero de la seccion del producto");
            seccion=in.nextDouble();
            in.nextLine();
            //Se guarda el objeto instanciado dentro del arreglo
            estandar.add(new ProductoEstandar(seccion,nombreProducto,precio));
        }
        //Pedidos del producto ofertado
        System.out.println("==Pedidos del producto ofertado==");
        System.out.println("Los pedidos le quedan 2 dias de oferta, 15% de descuento");
        for(int i=0;i<3;i++){
            System.out.println("PRODUCTO "+(i+1));
            System.out.println("Ingrese el nombre del producto");
            nombreProducto=in.nextLine();
            System.out.println("Ingrese el precio del producto");
            precio=in.nextDouble();
            in.nextLine();
            //Se guarda el objeto instanciado dentro del arreglo
            ofertado.add(new ProductoOfertado(2,nombreProducto,precio));
        }
        
        //For Each que sumaran todos los precios con su respectivo descuento de los pedidos
        for(ProductoEstandar e:estandar){
            total+=e.obtenerPrecioPedido(5);
        }
        for(ProductoOfertado e:ofertado){
            total+=e.obtenerPrecioPedido(5);
        }
        //Se muestra el precio total del pedido
        System.out.println("El precio total es: "+total);
        
    }
}
