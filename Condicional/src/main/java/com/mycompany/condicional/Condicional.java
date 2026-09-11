/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.condicional;

import java.util.Scanner;

/**
 *
 * @author HeverttonSilva
 */
public class Condicional {

    public static void main(String[] args) {
        /*Condicional e o codigo utilizado para
          avaliar dados, e se for falso realiza outra acao.
        SE - IF
        SENAO -ELSE

        TABELA LOGICA: 
        > MAIOR QUE      
        < MENOR QUE
        >= MAIOR OU IGUAL 
        <= MENOR OU IGUAL
        == IGUAL
        =! DIFERENTE
        */
        
        
        
        
        int idade;
        
        // variaveis de entrada de dados
        Scanner entradaNumero = new Scanner(System.in);
        
        //solicstacao para o usuario
        System.out.println("digite a sua idsde:");
        idade = entradaNumero.nextInt();
        
        //analise da idade
        if(idade>=18){
            System.out.println("voce e maior de idade");
        }else{
            System.out.println("voce e menor de idade");
        }// fim do else
   
    }
}
