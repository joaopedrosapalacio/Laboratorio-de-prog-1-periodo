/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.somaate0;

import java.util.Scanner;

/**
 *
 * @author Joao Pedro
 */
public class SomaAte0 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        int numero = -1;
        int soma= 0;
        
        while (numero != 0) {
            System.out.println("Digite um numero");
            numero = scanner.nextInt();
            soma += numero;
        }
        System.out.println("Fechar programa");
        System.out.println("A soma dos numeros que voce digitou e " + soma);
    }
}
