package pruebavehiculo;

public class Auto extends Vehiculo{
    public boolean parabrisasOnOff;
    public int multa;

    public Auto(boolean parabrisasOnOff, int multa, String numPlaca, String marca, int ruedas, int estado) {
        super(numPlaca, marca, ruedas, estado);
        this.parabrisasOnOff = parabrisasOnOff;
        this.multa = multa;
    }
    
    public void OnOffParabrisas(){
        if(this.parabrisasOnOff){
            this.parabrisasOnOff=false;
            System.out.println("Se apago el parabrisas");
        }else{
            this.parabrisasOnOff=true;
            System.out.println("Se prendio el parabrisas");
        }
    }
    
    public void addmultas(){
        this.multa++;
    }
}