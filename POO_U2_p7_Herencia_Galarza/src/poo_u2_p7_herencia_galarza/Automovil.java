package poo_u2_p7_herencia_galarza;

public class Automovil  extends Vehiculo{
    
    boolean parabrisas;
    
    @Override
    public void encendido(){
        encendido=true;
        estado="Vehiculo encendido";
    }
    public void apagado(){
        encendido=false;
        estado="Vehiculo apagado";
    }
}
