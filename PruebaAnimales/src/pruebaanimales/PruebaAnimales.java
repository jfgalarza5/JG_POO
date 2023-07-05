package pruebaanimales;

public class PruebaAnimales {

    public static void main(String[] args) {
        Animal animal = new Animal("Conejo", 10, "Vegetales");
        Gato gato = new Gato(false, "Gato Egipcio", 15, "Pescado");
        Caballo caballo = new Caballo(true, "Raza Pura", 20, "Hierva");
        
        System.out.println("===ANIMAL==");
        animal.especie();
        animal.aniosdevida();
        animal.comida();
        System.out.println("==GATO==");
        gato.maulla();
        gato.especie();
        gato.comida();
        gato.aniosdevida();
        if(gato.maulla){
            System.out.println("El gato maulla");
        }else{
            System.out.println("El gato no maulla");
        }
        System.out.println("==CABALLO==");
        caballo.especie();
        caballo.aniosdevida();
        caballo.comida();
        if(caballo.relincha){
            System.out.println("El caballo relincha");
        }else{
            System.out.println("El caballo no relincha");
        }
    }
    
}
