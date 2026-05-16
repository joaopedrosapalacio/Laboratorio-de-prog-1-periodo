/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.sistemaestoqueinteligente;

import java.util.Scanner;

/**
 *
 * @author Joao Pedro Sapalacio
 */
public class SistemaEstoqueInteligente {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int vetor[] = new int [7];
        int i;
        int soma = 0;
        int maior = vetor[0];
        int abaixo = 0;
        
        System.out.println("Coloque a quantidade de produtos que voce vendeu");
        
        for (i = 0; i < vetor.length; i++){
            vetor[i] = scanner.nextInt();
            soma += vetor[i];
            
            if (vetor[i] > maior){
                maior = vetor[i];
            }
            if (vetor[i] < 50){
                System.out.println("baixo desempenho");
            }
        }
        int media = soma / 7;
        for (i = 0; i < vetor.length; i++){
            if (vetor[i] < media){
                abaixo++;
            }
        }
        System.out.println("O total de vendas foram: " + soma);
        System.out.println("A media das vendas e: " + media);
        System.out.println("O dia com maior venda e: " + maior);
        System.out.println("Os dias que ficaram abaixo da media e: " + abaixo);
    }
}
