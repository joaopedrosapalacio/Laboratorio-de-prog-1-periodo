/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.contagemfaixa;

import java.util.Scanner;

/**
 *
 * @author Joao Pedro
 */
public class ContagemFaixa {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int vetor[] = new int[10];
        int i;
        int a = 0;
        int b = 0;
        int c = 0;
        int d = 0;
        
        for (i = 0; i < vetor.length; i++){
            System.out.println("Digite os numeros");
            vetor[i] = scanner.nextInt();
            
            if ( vetor[i] <= 25) {
                a++;
            } else if (vetor[i] <= 50) {
                b++;
            } else if (vetor[i] <= 75) {
                c++;
            } else if (vetor[i] <= 100) {
                d++;
            }
        }
        System.out.println("A quantidade de numeros que estao entre 0 a 25 sao: " + a);
        System.out.println("A quantidade de numeros que estao entre 26 a 50 sao: " + b);
        System.out.println("A quantidade de numeros que estao entre 51 a 75 sao: " + c);
        System.out.println("A quantidade de numeros que estao entre 76 a 100 sao: " + d);
    }
}
