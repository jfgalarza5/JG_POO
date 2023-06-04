/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package notas;

import java.util.ArrayList;

/**
 *
 * @author johng
 */
public class GestionNotas {
    ArrayList<Double> notas;
    
    public GestionNotas(){
        notas=new ArrayList<>();
        
    }
    public void guardarNota(double n){
        notas.add(n);
    }
    public double media(){
        double media=0;
        for(double d:notas){
            media+=d;
        }
        return media/notas.size();
    }
    
    public int aprovados(){
        int ap=0;
        for(double d:notas){
            if (d>=14){
                ap++;
            }
        }
        return ap;
    }
}
