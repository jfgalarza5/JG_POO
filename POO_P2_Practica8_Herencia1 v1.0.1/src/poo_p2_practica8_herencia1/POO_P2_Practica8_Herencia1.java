/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package poo_p2_practica8_herencia1;

/**
 *
 * @author johng
 */
public class POO_P2_Practica8_Herencia1 {

    public static void main(String[] args) {
        Vehiculo veh1 = new Vehiculo();
        Vehiculo veh2 =new Vehiculo();
        
        Automovil auto1 = new Automovil();
        Automovil auto2 = new Automovil();
        
        Motocicleta moto1 = new Motocicleta();
        Motocicleta moto2 = new Motocicleta();
        
        veh1.encendido();
        veh2.apagado();
        auto1.encendido();
        auto2.encendido();
        moto1.encendido();
        moto2.apagado();
        
        System.out.println(veh1.estado);
        System.out.println(veh2.estado);
        System.out.println(auto1.estado);
        System.out.println(auto2.estado);
        System.out.println(moto1.estado);
        System.out.println(moto2.estado);
        
    }
    
}
