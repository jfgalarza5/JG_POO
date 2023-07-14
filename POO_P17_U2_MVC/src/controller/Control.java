package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import model.Modelo;
import view.Vista;

public class Control implements ActionListener{
    
    private Vista view;
    private Modelo model;

    public Control(Vista view, Modelo model) {
        this.view = view;
        this.model = model;
        this.view.btnSumar.addActionListener(this);
    }
    
    public void iniciar(){
        view.setTitle("USTED VA A SUMAR POR MEDIO JAVA");
        view.setLocationRelativeTo(null);
        
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        model.setV1(Integer.parseInt(view.txtN1.getText()));
        model.setV2(Integer.parseInt(view.txtN2.getText()));
        model.sumar();
        view.txtResult.setText(String.valueOf(model.getTotal()));
        model.setV3(Integer.parseInt(view.txtN5.getText()));
        model.setV4(Integer.parseInt(view.txtN6.getText()));
        model.restar();
        view.txtResult2.setText(String.valueOf(model.getResta()));
        model.setV5(Integer.parseInt(view.txtN9.getText()));
        model.setV6(Integer.parseInt(view.txtN10.getText()));
        model.multiplicar();
        view.txtResult4.setText(String.valueOf(model.getMultiplicar()));
        model.setV7(Integer.parseInt(view.txtN11.getText()));
        model.setV8(Integer.parseInt(view.txtN12.getText()));
        model.dividir();
        view.txtResult5.setText(String.valueOf(model.getDividir()));
    }
    
}
