/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.valorabsoluto;

import java.util.Scanner;

/**
 *
 * @author Aluno
 */
public class ValorAbsoluto {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite um numero inteiro");
        int numero = scanner.nextInt();
        
        if (numero < 0) {
            int valor = Math.abs(numero);
            System.out.println("Seu valor absoluto e igual a " + valor);
        } else {
            System.out.println("Seu numero ja esta em valor absoluto");
        }
    }
}
