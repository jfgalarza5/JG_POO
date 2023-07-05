package poo_u2_p10_sobrecarga;

public class POO_U2_P10_Sobrecarga {

    public static void main(String[] args) {
        Persona persona1 = new Persona("Javier", 42);
        persona1.jugar();
        Persona persona2 = new Persona(124578521);
        persona2.jugar("Futbol");
        
        
    }
    
}
