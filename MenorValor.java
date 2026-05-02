/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.menorvalor;

import java.util.Scanner;

/**
 *
 * @author Joao Pedro
 */
public class MenorValor {

    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        int numeros[] = new int[5];
        int i;
        int menor;
        System.out.println("Digite os valores");
        
        for (i = 0; i < numeros.length; i++) {
            numeros[i] = scanner.nextInt();
        }
        menor = numeros[0];
        
        for (i = 1; i < numeros.length; i++) {
            if (numeros[i] < menor) {
                menor = numeros[i];
            }
        }
        System.out.println("O menor numero e " + menor);
    }
}
