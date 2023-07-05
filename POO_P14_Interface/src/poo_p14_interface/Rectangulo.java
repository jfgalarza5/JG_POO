package poo_p14_interface;

public class Rectangulo implements Figura, Dibujar{
    double ladoA,ladoB;

    public Rectangulo(double ladoA, double ladoB) {
        this.ladoA = ladoA;
        this.ladoB = ladoB;
    }
    
    @Override
    public double calcularArea() {
        return ladoA*ladoB;
    }

    @Override
    public void dibujar() {
        System.out.println("Va a dibujar");
    }
}
