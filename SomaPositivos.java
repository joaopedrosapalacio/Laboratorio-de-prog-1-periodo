/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.somapositivos;

import java.util.Scanner;

/**
 *
 * @author Aluno
 */
public class SomaPositivos {

    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        int numeros[] = new int[5];
        int i;
        int soma = 0;
        System.out.println("Digite os numeros");
        
        for (i = 0; i < numeros.length; i++) {
            numeros[i] = scanner.nextInt();
            if (numeros[i] >= 0) {
                soma += numeros[i];
            }
        }
        System.out.println("A soma dos valores positivos sao: " + soma);
    }
}
