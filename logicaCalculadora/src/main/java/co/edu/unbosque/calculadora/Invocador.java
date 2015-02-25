/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.unbosque.calculadora;

import java.util.HashMap;
import java.util.Stack;

/**
 *
 * @author f212
 */
public class Invocador {
    HashMap<String, Comand> comandos;
    
    public Invocador(){
        comandos = new HashMap<>();
        comandos.put("-", new ComandoResta());
        comandos.put("+", new ComadoSuma());
    }
    
    public String evaluar(String expresion) {
        double  numero = 0,n1,n2;
        String aux,a="",b="";
        char array[] = expresion.toCharArray();
        Stack numeros = new Stack();
        Stack operadores = new Stack();
        for (int x = 0; x < array.length; x++) {
            aux = "" + array[x];
            if (!aux.equals(" ")) {
                a = a + "" + aux;
            } else if (a.equals("+") || a.equals("-")
                    || a.equals("*") || a.equals("/")) {
                b = a;
                n2=Double.parseDouble((String) numeros.pop());
                n1 =Double.parseDouble((String) numeros.pop());
                switch (b) {
                    case "+":
                        numero=ejecutar(n1,n2,b); break;
                    case "-":
                        numero = (n1-n2); break;
                    case "*":
                        numero = (n1*n2); break;
                    case "/":
                        numero = (n1/n2); break;
                }
                numeros.push(""+numero);
                a="";
            } else {
                try {
                    Integer.parseInt(a);
                } catch (NumberFormatException e) {
                    throw new NumberFormatException("Número mal digitado");
                }
                numeros.push(""+a);
                a = "";
            }
            
        }aux=(String) numeros.pop();

        return aux;
    }
    
    public double ejecutar(double op1, double op2, String operador){
        Comand cmd = comandos.get(operador);
        return cmd.ejecutar(op1, op2);
    }
    
}
