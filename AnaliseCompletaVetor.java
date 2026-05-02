/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.analisecompletavetor;

import java.util.Scanner;

/**
 *
 * @author Joao Pedro
 */
public class AnaliseCompletaVetor {

    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        int vetor[] = new int [8];
        int i;
        int soma = 0;
        int maior;
        int menor;
        int media;
        int positivo = 0;
        System.out.println("Digite um numero:");
        vetor[0] = scanner.nextInt();

        maior = vetor[0];
        menor = vetor[0];
        soma = vetor[0];

        if (vetor[0] >= 0) {
        positivo++;
        }
        for (i = 1; i < vetor.length; i++){
            System.out.println("Digite os numeros");
            vetor[i] = scanner.nextInt();
            
            soma += vetor[i];
            
            if (vetor[i] > maior) {
                maior = vetor[i];
            } else if (menor < vetor[i]) {
                menor = vetor[i];
            } if (vetor[i] >= 0) {
                positivo++;
            }
        }
        media = soma / 8;
        System.out.println("O maior valor e: " + maior);
        System.out.println("O menor valor e: " + menor);
        System.out.println("A soma de todos os valores e: " + soma);
        System.out.println("A media dos valores e: " + media);
        System.out.println("A quantidade de numeros positivos e: " + positivo);
    }
}
