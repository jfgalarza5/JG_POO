/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo_p2_practica8_herencia1;

/**
 *
 * @author johng
 */
public class Motocicleta extends Vehiculo{
    
    @Override
        public void encendido(){
            encendido=true;
            estado="Motocicleta encendido";
        }
    @Override
        public void apagado(){
            encendido=false;
            estado="Motocicleta apagada";
        }
}
