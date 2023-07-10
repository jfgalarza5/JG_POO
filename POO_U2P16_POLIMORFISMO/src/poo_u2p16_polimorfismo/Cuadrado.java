package poo_u2p16_polimorfismo;

public class Cuadrado extends Figura{
    private double lado;

    public Cuadrado(double lado , String color) {
        super(color);
        this.lado = lado;
    }
    
    @Override
    public double superficie() {
        return lado*lado;
    }
}
