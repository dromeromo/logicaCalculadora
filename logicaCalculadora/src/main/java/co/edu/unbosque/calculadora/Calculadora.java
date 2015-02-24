/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.unbosque.calculadora;

import java.util.Stack;
import co.edu.unbosque.calculadora.Calcular;

/**
 *
 * @author Andres
 */
public class Calculadora {

    public static void main(String[] args) {
        Parser p = new Parser();
        Calcular calcular = new Calcular();
        String expresion = new String();
        double valor = 0;
       expresion = "524/22+16/8";
        String pos = p.parsear(expresion);
        System.out.println(pos+"");
        //String posfijo ="524 22 / 16 8 * + ";
        System.out.println(calcular.evaluar(pos+" "));
        
        
    }
       
         
        /*
        for (int x = 0; x < cal.getPosfijo().length; x++) {
            System.out.println("[" + x + "] " + cal.getPosfijo()[x]);
        }*/

    }


