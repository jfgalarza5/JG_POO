/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo_u2_p7_herencia_galarza;

/**
 *
 * @author johng
 */
public class Motocicleta extends Vehiculo{
    boolean patada;
    @Override 
    public void encendido(){
        encendido=true;
        estado="Vehiculo encendido";
    }
    public void apagado(){
        encendido=false;
        estado="Vehiculo apagado";
    }
}
