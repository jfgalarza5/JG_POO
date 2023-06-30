/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistema.bancario;

/**
 *
 * @author johng
 */
public class C_Limitada extends Cuenta{
    double limitante;
  
    public C_Limitada(double limitante, double dinero, String nombreProp, String cedula) {
        super(dinero, nombreProp);
        this.cedula = cedula;
        this.limitante=limitante;
    }
    //SOBREESCRITURA
    @Override
    public void ingreso(double monto){
        if(limitante>=monto){
            dinero+=monto;
        }else{
            System.out.println("Excede el limite");
        }
    }
    @Override
    public void salida(double monto){
        if(limitante>=monto){
            dinero-=monto;
        }else{
            System.out.println("Excede el limite");
        }
    }
}
