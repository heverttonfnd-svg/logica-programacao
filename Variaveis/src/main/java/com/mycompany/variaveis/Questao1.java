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


public class Questao1 {

    public static void main(String[] args) {
      // criar variavel  
     String nome;   
     
     // chamar o Scanner
        Scanner entradaTexto = new Scanner (System.in);
                
       // solicr os dados para o usuarios);
        System.out.println("digite o nome:");
        nome = entradaTexto.nextLine();
        
        System.out.println("Ola,"+nome+"! seja bem-vindo(a) ao java.");
        
        
    }
    
}
