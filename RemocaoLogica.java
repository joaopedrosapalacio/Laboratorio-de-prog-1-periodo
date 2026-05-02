/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.remocaologica;

import java.util.Scanner;

/**
 *
 * @author Joao Pedro
 */
public class RemocaoLogica {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int vetor[] = new int[6];
        int novo[] = new int[6];
        int i;
        int remover;
        int j = 0;
        boolean encontrou = false;
        
        for (i = 0; i < vetor.length; i++) {
            System.out.println("Digite os valores para o vetor");
            vetor[i] = scanner.nextInt();
        }
        System.out.println("Escolha um numero para ser removido");
        remover = scanner.nextInt();
        for (i = 0; i < vetor.length; i++) {
            if (vetor[i] == remover){
                encontrou = true;
            }
        }
        if (encontrou == false){
            System.out.println("Esse numero nao esta no vetor, digite um numero que esta no vetor");
        } else {
            
        }
            for (i = 0; i < vetor.length; i++) {
            if (remover != vetor[i]) {
                novo[j] = vetor[i];
                j++;
            }
        }
        System.out.println("Vetor sem o numero:");
        for (i = 0; i < j; i++) {
            System.out.print(novo[i] + " ");
        }
    }
}
