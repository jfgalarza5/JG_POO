
package pruebavehiculo;

public class PruebaVehiculo {

    public static void main(String[] args) {
        Vehiculo vehiculo = new Vehiculo("10525", "Chevrolet", 4, 2);
        Auto auto = new Auto(false, 0, "10250", "Mercedes", 4, 3);
        Camion camion =  new Camion(10.0, true, "10254", "Fuso", 12, 3);
        
        System.out.println("Marca: "+vehiculo.marca);
        System.out.println("Numero de placa: "+vehiculo.getNumPlaca());
        System.out.println("Ruedas: "+vehiculo.ruedas);
        System.out.println("");
        System.out.println("Marca: "+auto.marca);
        System.out.println("Numero de placa: "+auto.getNumPlaca());
        System.out.println("Multas: "+auto.multa);
        System.out.println("Ruedas: "+auto.ruedas);
        System.out.println("");
        System.out.println("Marca: "+camion.marca);
        System.out.println("Carga: "+camion.carga);
        System.out.println("Numero de placa: "+camion.getNumPlaca());
    }
}
