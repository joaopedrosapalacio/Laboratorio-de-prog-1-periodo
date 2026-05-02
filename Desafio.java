/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.desafio;

import java.util.Scanner;

/**
 *
 * @author Joao Pedro
 */
public class Desafio {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int vetor[] = new int[10];
        int i;
        int j;
        int k;
        boolean repetiu = true;
        boolean mostrou = false;
        
        System.out.println("Coloque os valores para o vetor");
        
        for (i = 0; i < vetor.length; i++) {
            vetor[i] = scanner.nextInt();
        }
        for (i = 0; i < vetor.length; i++){
            repetiu = false;
            
            for (j = i + 1; j < vetor.length; j++){
                if (vetor[i] == vetor[j]){
                    repetiu = true;
                }
            }
            mostrou = false;
            for (k = 0; k < i; k++){
                if (vetor[i] == vetor[k]) {
                    mostrou = true;
                }
            }
            System.out.println("Numeros que se repitiram");
            if (repetiu == true && mostrou == false) {
                System.out.println(vetor[i]);
            }
        }
    }
}
