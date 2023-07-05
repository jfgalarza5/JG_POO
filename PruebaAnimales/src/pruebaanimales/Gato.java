package pruebaanimales;

public class Gato extends Animal{
    boolean maulla;

    public Gato(boolean maulla, String especie, int aniosdevida, String comida) {
        super(especie, aniosdevida, comida);
        this.maulla = maulla;
    }
    
    public void maulla(){
        if(maulla){
            maulla=false;
        }else{
            maulla=true;
        }
    }
    
    @Override
    public void especie(){
        System.out.println("El nombre de la especie del gato es: "+especie);
    }
}
