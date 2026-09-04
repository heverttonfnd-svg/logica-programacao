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
public class Questao2 {
  
    public static void main(String[] args) {
        // criar variavel  
     int idade;  
     
     // chamar o Scanner
        Scanner entradadeNumero = new Scanner(System.in);
        
     // solicitar os dados para o usuarios);
       System.out.println("digite a sua idade:");
      idade = entradadeNumero.nextInt();
     
      
        System.out.println("sua idade e "+idade);
      
      
      
    }
}
