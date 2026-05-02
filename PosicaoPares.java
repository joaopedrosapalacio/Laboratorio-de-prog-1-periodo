/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.posicaopares;

import java.util.Scanner;

/**
 *
 * @author Aluno
 */
public class PosicaoPares {

    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        int numeros[] = new int[5];
        int i;
        System.out.println("Digite os valores");
        
        for (i = 0; i < numeros.length; i++) {
            numeros[i] = scanner.nextInt();
        }
        System.out.println("Os numeros nas posiçoes pares sao: " + numeros[2] + " " + numeros [4]);
    }
}
