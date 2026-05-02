/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.maiorvalor;

import java.util.Scanner;

/**
 *
 * @author Joao Pedro
 */
public class MaiorValor {

    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        int numeros[] = new int[5];
        int i;
        int maior;
        System.out.println("Digite os valores");
        
        for (i = 0; i < numeros.length; i++) {
            numeros[i] = scanner.nextInt();
        }
        maior = numeros[0];
        
        for (i = 1; i < numeros.length; i++) {
            if (numeros[i] > maior) {
                maior = numeros[i];
            }
        }
        System.out.println("O maior numero e " + maior);
    }
}
