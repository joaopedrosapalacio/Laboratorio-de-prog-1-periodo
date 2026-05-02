/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mediasimples;

import java.util.Scanner;

/**
 *
 * @author Joao Pedro
 */
public class MediaSimples {

    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        double soma = 0;
        int i = 1;
        while (i <= 4) {
            System.out.println("Digite um numero");
            double numero = scanner.nextDouble();
            soma += numero;
            i++;
        }
        soma = soma / 4;
        System.out.println(soma);
    }
}
