/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.condicional;

import java.util.Scanner;

/**
 *
 * @author HeverttonSilva
 */
public class DesafioSwitchCase {
    public static void main(String[] args) {
        
        // Variaveis
        int numeroP, quantidade;
        double valorTotal;
        
         Scanner entradaNumero = new Scanner(System.in);

        System.out.println("Bem vindo! Escolha seu pedido");
        System.out.println("1 - hamburguer R$ 15,00\n2 - pizza R$ 25,00\n3 - cachorro-quente R$ 12,00\n4 - refrigerante R$ 6,00\n5 - suco R$ 8,00 ");
      numeroP = entradaNumero.nextInt();
        System.out.println("qual a quantidade desejada?");     
      quantidade = entradaNumero.nextInt();
      
      switch(numeroP){
          case 1:
          valorTotal = 15*quantidade;
              System.out.println("produto escolhido: hamburguer\nquantidade: "+quantidade+"\nPreco unitario:R$ 15,00\nValor Total "+valorTotal);
              break;
       
      }
        
        
        
        
        
        
        
        
        
        
        
        
    }
 
        

        
    }
    
    
    
    
    
    
    
    
    
    
    

