package poo_p17_u2_mvc;

import controller.Control;
import model.Modelo;
import view.Vista;

public class POO_P17_U2_MVC {

    public static void main(String[] args) {
        Modelo mod = new Modelo();
        Vista vista = new Vista();
        Control cont = new Control(vista, mod);
        
        cont.iniciar();
        
        vista.setVisible(true);
    }
    
}
