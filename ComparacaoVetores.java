/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.comparacaovetores;

import java.util.Scanner;

/**
 *
 * @author Joao Pedro
 */
public class ComparacaoVetores {

    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        int vetor[] = new int[5];
        int vetor2[] = new int[5];
        int i;
        int igual = 0;
        
        for (i = 0; i < vetor.length; i++) {
            System.out.println("Digite os numeros para o primeiro vetor");
            vetor[i] = scanner.nextInt();
        } for (i = 0; i < vetor2.length; i++) {
            System.out.println("Digite os numeros para o segundo vetor");
            vetor2[i] = scanner.nextInt();
        } for (i = 0; i < vetor2.length; i++) {
            if (vetor[i] == vetor2[i]) {
                igual++;
            }
        }
        System.out.println("A quantidade de numeros igual sao: " + igual);
    }
}
