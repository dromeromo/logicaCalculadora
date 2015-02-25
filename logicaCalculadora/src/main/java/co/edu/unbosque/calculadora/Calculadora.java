/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.unbosque.calculadora;

import java.util.Stack;
import co.edu.unbosque.calculadora.Calcular;
import co.edu.unbosque.calculadora.Invocador;

/**
 *
 * @author Andres
 */
public class Calculadora {

    public static void main(String[] args) {
        /* ya no es necesario usar la clase evaluar */
        System.out.println("");              
        Invocador i = new Invocador();
        Parser p = new Parser();
        String expresion = "3+2";
        String pos = p.parsear(expresion);
        System.out.println(pos);
        System.out.println(i.evaluar(pos+" "));
        
        
    }
       
         
        /*
        for (int x = 0; x < cal.getPosfijo().length; x++) {
            System.out.println("[" + x + "] " + cal.getPosfijo()[x]);
        }*/

    }


