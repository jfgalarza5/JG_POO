package pruebaanimales;

public class Animal {
    String especie;
    int aniosdevida;
    String comida;

    public Animal(String especie, int aniosdevida, String comida) {
        this.especie = especie;
        this.aniosdevida = aniosdevida;
        this.comida = comida;
    }
    
    public void especie(){
        System.out.println("El nombre de la especie es: "+especie);
    }
    
    public void aniosdevida(){
        System.out.println("Los años de vida son: "+aniosdevida);
    }
    
    public void comida(){
        System.out.println("El animal se alimenta de: "+comida);
    }
}
