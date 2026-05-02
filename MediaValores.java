/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mediavalores;

import java.util.Scanner;

/**
 *
 * @author Joao Pedro
 */
public class MediaValores {

    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        int numeros[] = new int[5];
        int i;
        double media = 0;
        int soma = 0;
        
        System.out.println("Digite os valores");
        
        for (i = 0; i < numeros.length; i++) {
            numeros[i] = scanner.nextInt();
            soma += numeros[i];
        }
        media = soma / 5;
        System.out.println("A media dos valores sao: " + media);
    }
}
