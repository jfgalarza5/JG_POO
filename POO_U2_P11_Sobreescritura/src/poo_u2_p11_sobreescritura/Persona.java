package poo_u2_p11_sobreescritura;
import animal.Animal;

public class Persona extends Animal{
    @Override
    public void comer(){
        System.out.println("SOY UN HUMANO Y MI IQ ES DE 150");
    }
}