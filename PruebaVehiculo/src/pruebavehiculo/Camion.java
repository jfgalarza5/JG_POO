package pruebavehiculo;

public class Camion extends Vehiculo{
    public double carga;
    public boolean parabrisas;

    public Camion(double carga, boolean parabrisas, String numPlaca, String marca, int ruedas, int estado) {
        super(numPlaca, marca, ruedas, estado);
        this.carga = carga;
        this.parabrisas = parabrisas;
    }
    
    public void carga(double peso){
        carga+=peso;
    }
    
    public void parabrisas(){
        if(parabrisas){
            parabrisas=false;
        }else{
            parabrisas=true;
        }
    }
}
