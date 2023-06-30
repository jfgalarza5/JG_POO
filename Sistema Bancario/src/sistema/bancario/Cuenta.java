/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistema.bancario;

/**
 *
 * @author johng
 */
public class Cuenta {
    double dinero;
    String nombreProp;
    String cedula;
    //SOBRECARGA DE CONSTRUCTORES
    public Cuenta(double dinero, String nombreProp){
        this.dinero=dinero;
        this.nombreProp=nombreProp;
    }
    public Cuenta(String cedula){
        this.cedula=cedula;
    }
    //METODOS
    public void ingreso(double monto){
        dinero+=monto;
    }
    
    public void salida(double monto){
        dinero-=monto;
    }
    
    public double saldo(){
        return dinero;
    }
}
