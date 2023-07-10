package poo_u2p16_polimorfismo;

public class Triangulo extends Figura{
    private double base;
    private double altura;

    public Triangulo(double base, double altura, String color) {
        super(color);
        this.base = base;
        this.altura = altura;
    }
    
    @Override
    public double superficie() {
        return (base*altura)/2;
    }
}