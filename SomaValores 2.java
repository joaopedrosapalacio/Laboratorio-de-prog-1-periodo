/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.somavalores;

import java.util.Scanner;

/**
 *
 * @author Joao Pedro
 */
public class SomaValores {

    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        int numeros[] = new int[5];
        int i;
        int soma = 0;
        System.out.println("Digite os valores para a soma");
        
        for (i = 0; i < numeros.length; i++) {
            numeros[i] = scanner.nextInt();
            soma += numeros[i];
        }
        System.out.println("A soma dos valores sao: " + soma);
    }
}
