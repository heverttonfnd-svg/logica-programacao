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
public class CalculosBasicos {
    
    public static void main(String[] args) {
        // TRABALHAR COM CALCULO DE SOMA
        int numero1 , numero2;
        double resutadoSoma, resutadoSubtracao, 
                resutadoMutiplicacao, resutadoDivisao;
        
        Scanner entradaNumero = new Scanner(System.in);
        
        
        System.out.println("Digite um valor inteiro:");
        numero1 = entradaNumero.nextInt();
        
        System.out.println("Digite outro valor inteiro:");
        numero2 =entradaNumero.nextInt();
        
        // soma
        resutadoSoma = numero1 + numero2 ;
        
        System.out.println(" A soma dos numeros e:"+resutadoSoma);
        
        // SUBTRACAO
        resutadoSubtracao = numero1 - numero2;
        
        System.out.println("A subitracao dos numero e:"+resutadoSubtracao);
        
        // MULTIPLICACAO
        resutadoMutiplicacao = numero1 * numero2;
        
        System.out.println("A mutiplicacao dos numero e:"+resutadoMutiplicacao);
        
        
        
        
        
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
}
