/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej1g1;

import java.util.Scanner;

/**
 *
 * @author casa
 */
public class Ej1G1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
        int n1;
        int n2;
        int suma;
        
        System.out.println("Ingrese 2 numeros para sumar");
         n1 = leer.nextInt();
        n2 = leer.nextInt();
        suma = n1 + n2;
       System.out.println("La suma de los 2 numeros es "+suma); 
    }
    
}
