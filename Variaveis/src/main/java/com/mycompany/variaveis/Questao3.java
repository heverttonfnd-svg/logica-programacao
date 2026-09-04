/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.variaveis;

import java.util.Scanner;

/**
 *
 * @author HeverttonSilva
 */
public class Questao3 {
    public static void main(String[] args) {
        
        double valor1;
        double valor2;
         Scanner entradadeNumero = new Scanner (System.in);
         
         System.out.println("digite o 1valor");
         valor1 = entradadeNumero.nextDouble();
        
         System.out.println("digite o 2valor");
         valor2 = entradadeNumero.nextDouble();
         
         double media =(valor1+valor2)/2;
         System.out.println("a medida e :"+media);
         
         
    }
}
