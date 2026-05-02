/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.classificacao;

import java.util.Scanner;

/**
 *
 * @author Aluno
 */
public class Classificacao {

    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        System.out.println("Digite um numero inteiro");
        int numero = scanner.nextInt();
        
        if (numero > 0) {
            System.out.println("Numero positivo");
        } else if (numero < 0) {
            System.out.println("Numero negativo");
        } else {
            System.out.println("Seu numero e 0");
        }
    }
}
