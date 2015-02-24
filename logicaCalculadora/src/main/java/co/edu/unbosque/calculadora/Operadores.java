/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.unbosque.calculadora;


/**
 *
 * @author Andres
 */
public class Operadores {
    
    private int resultado;

    public Operadores() {
        this.resultado= resultado;
    }
    
    public int suma(int i, int i0) {        
        int resultado = i+i0;
        return resultado;      
}

    public int resta(int i, int i0) {
       
        int resultado=(i-i0);
        return resultado;
    }

    public int multiplicacion(int i, int i0) {
        int resultado =(i*i0);
        return resultado;
    }

    public void  division(int i, int i0) {
        try {
            setResultado((i/i0));
        } catch (ArithmeticException a) {
            System.out.println("no se puede dividir por cero ......");
            
        }         
    }

    public void setResultado(int resultado) {
        this.resultado = resultado;
    }

    public int getResultado() {
        return resultado;
    }
    
    
    
}
