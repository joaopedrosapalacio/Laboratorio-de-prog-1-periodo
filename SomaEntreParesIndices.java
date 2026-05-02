/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.somaentreparesindices;

import java.util.Scanner;

/**
 *
 * @author Joao Pedro
 */
public class SomaEntreParesIndices {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int vetor[] = new int[6];
        int i;
        int somaPares = 0;
        int somaImpares = 0;
        
        for (i = 0; i < vetor.length; i++) {
            System.out.println("Digite os valore para o vetor");
            vetor[i] = scanner.nextInt();
            
            if (vetor[i] % 2 == 0) {
                somaPares += vetor[i];
            } else {
                somaImpares += vetor[i];
            }
        }
        System.out.println("A soma dos pares e igual a: " + somaPares);
        System.out.println("A soma dos impares e igual a: " + somaImpares);
    }
}
