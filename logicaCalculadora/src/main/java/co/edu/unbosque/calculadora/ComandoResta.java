/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.unbosque.calculadora;

import co.edu.unbosque.calculadora.Comand;

/**
 *
 * @author f212
 */
public class ComandoResta implements Comand {

    public ComandoResta() {
    }

    @Override
    public double ejecutar(double op1, double op2) {
        
        return op1 - op2;
    }
    
}
