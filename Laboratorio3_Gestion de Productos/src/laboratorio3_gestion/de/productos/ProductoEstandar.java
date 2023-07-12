package laboratorio3_gestion.de.productos;

//Clase hija de Productos
public class ProductoEstandar extends Productos{
    double seccion;
    
    //Constructor de la clase hija que hereda del constructor de la clase padre productos
    //que pasa los parametros seccion,nombre,precio
    public ProductoEstandar(double seccion, String nombre, double precio) {
        super(nombre, precio);
        this.seccion = seccion;
    }
    
    //Sobreescritura del metodo obtenerPrecio que modifica
    //con un descuento del 10% si las unidades son mayores o iguales a 5
    @Override
    public double obtenerPrecioPedido(int unidades){
        double total = precio*unidades;
        if (unidades>=5){
            return total-total*10/100;
        }else{
            return total;
        }
    }
}
