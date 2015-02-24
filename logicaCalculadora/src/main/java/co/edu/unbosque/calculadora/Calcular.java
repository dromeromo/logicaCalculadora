/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.unbosque.calculadora;

import static java.lang.Integer.parseInt;
import java.util.Stack;

/**
 *
 * @author Andres
 */
public class Calcular {

    private String a;
    private String b;
    private String aux;
    private double numero;
    private double n1;
    private double n2;

    public Calcular() {
        a = "";
        b = "";
        aux = "";
        n1 = 0;
        n2 = 0;
    }

    public String evaluar(String expresion) {
        double  numero = 0;
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
                        numero = (n1+n2); break;
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

}
