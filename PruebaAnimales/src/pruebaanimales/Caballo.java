package pruebaanimales;

public class Caballo extends Animal{
    boolean relincha;

    public Caballo(boolean relincha, String especie, int aniosdevida, String comida) {
        super(especie, aniosdevida, comida);
        this.relincha = relincha;
    }
    
    @Override
    public void especie(){
        System.out.println("El nombre de la especie del caballo es: "+especie);
    }
}
