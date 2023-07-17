package laboratorio3_gestion.de.productos;

//Clase hija de Productos
public class ProductoOfertado extends Productos{
    int dias;
    
    //Constructor de la clase hija que hereda del constructor de la clase padre productos
    //que pasa los parametros dias,nombre,precio
    public ProductoOfertado(int dias, String nombre, double precio) {
        super(nombre, precio);
        this.dias = dias;
    }
 
    //Sobreescritura del metodo obtenerPrecio que modifica
    //con un descuento del 20% si los dias son iguales a 1
    //con 15% si los dias son 2 o 3
    //con 10% si los dias son mayores a 3
    @Override
    public double obtenerPrecioPedido(int unidades){
        double total = precio*unidades;
        if(dias==1){
            total=total-(total*20/100);
        }else{
            if(dias==2 || dias==3){
                total=total-total*15/100;
            }else{
                if(dias>3){
                    total=total-total*10/100;
                }
            }
        }
        return total;
    }
}
