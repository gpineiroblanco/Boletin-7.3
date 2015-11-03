/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin7.pkg3;

import javax.swing.JOptionPane;

/**
 *
 * @author Toshiba
 */
public class Condicional {
    
    private double numero1;
    
    public Condicional(){
        
    }
    public Condicional(double num1){
        numero1=num1;
    }
    public double getNumero(){
        String respuesta = JOptionPane.showInputDialog("Introduce Número: ");
        double valor = Double.parseDouble(respuesta);
        return valor;
    }
    public void comparar(double n1){
        numero1=n1;

        if(n1>0){
            JOptionPane.showMessageDialog(null,"+");
        }else if(n1==0){
            JOptionPane.showMessageDialog(null,"0" );
        }else{
            JOptionPane.showMessageDialog(null,"-");
        }
    }
}
