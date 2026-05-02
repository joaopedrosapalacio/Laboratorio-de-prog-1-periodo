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

        int soma = 0;
        int i = 1;
        while (i <= 5) {
            System.out.println("Digite um numero");
            int numero = scanner.nextInt();
            soma += numero;
            i++;
        }
        System.out.println(soma);
    }
}
