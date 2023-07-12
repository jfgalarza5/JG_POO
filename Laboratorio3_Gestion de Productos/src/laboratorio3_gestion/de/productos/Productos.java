package laboratorio3_gestion.de.productos;

//Clase padre productos
public class Productos {
    //Atributos
    String nombre;
    double precio;
    
    //Constructor de la clase padre que utiliza los parametros nombre y precio
    public Productos(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }
    
    //Metodo que retorna el precio total
    public double obtenerPrecioPedido(int unidades){
        return unidades*precio;
    }
}
