package pruebavehiculo;

public class Vehiculo {
    private String numPlaca;
    public String marca;
    public int ruedas;
    private int estado;

    public Vehiculo(String numPlaca, String marca, int ruedas, int estado) {
        this.numPlaca = numPlaca;
        this.marca = marca;
        this.ruedas = ruedas;
        this.estado = estado;
    }

    public String getNumPlaca() {
        return numPlaca;
    }

    public void setNumPlaca(String numPlaca) {
        this.numPlaca = numPlaca;
    }

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }
}
