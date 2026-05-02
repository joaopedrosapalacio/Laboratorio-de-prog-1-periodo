/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.maiortresnumeros;

import java.util.Scanner;

/**
 *
 * @author Aluno
 */
public class MaiorTresNumeros {

    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
         
        System.out.println("Digite um numero");
        int num1 = scanner.nextInt();
        
        System.out.println("Digite outro numero");
        int num2 = scanner.nextInt();
        
        System.out.println("Digite outro numero");
        int num3 = scanner.nextInt();
        
        int maior = num1;
        
        if (num2 > maior) {
            maior = num2;
        } else if (num3 > maior) {
            maior = num3;
        }
        System.out.println("Seu numero maior e " + maior);
    }
}
