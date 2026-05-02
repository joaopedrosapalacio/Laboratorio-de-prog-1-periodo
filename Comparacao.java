/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.comparacao;

import java.util.Scanner;

/**
 *
 * @author Aluno
 */
public class Comparacao {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um numero");
        int num1 = scanner.nextInt();
        
        System.out.println("Digite outro numero");
        int num2 = scanner.nextInt();
        
        if (num1 == num2) {
            System.out.println("Seus dois numero sao iguais");
        } else if (num1 > num2) {
            System.out.println("O numero " + num1 + " e maior que o numero " + num2);
        } else {
            System.out.println("O numero " + num2 + " e maior que o numero " + num1);
        }
    }
}
