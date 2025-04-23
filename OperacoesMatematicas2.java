/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.operacoesmatematicas;

/**
 *
 * @author FATEC ZONA LESTE
 */
public class OperacoesMatematicas {

    public static void main(String[] args) {
        // TODO code application logic here
    double num1 = 10.5;
    double num2 = 5.2;
    
    double soma = num1 = num2;
    double subtracao = num1 - num2;
    double multiplicacao = num1 * num2;
    double divisao = num2 != 0 ? num1 / num2 : Double.NaN; // Evita divisão por resto
    double resto = num1 % num2;
    
    
    System.out.println("Resultados das operações:");
    System.out.println("Soma: " + soma);
    System.out.println("Subtração: + subtracao");
    System.out.println("Multiplicação: " + multiplicacao); 
    System.out.println("Divisão: " + (num2 != 0 ? divisao :
        "Indefinida (divisão por zero)"));
    System.out.println("resto da divisão: " + resto);
}
}
    

