/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.triangulo;

import java.util.Scanner;

/**
 *
 * @author Aluno
 */
public class Triangulo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        System.out.println("Me informe um valor para seu triangulo");
        int num1 = scanner.nextInt();
        
        System.out.println("Me informe um outro valor para seu triangulo");
        int num2 = scanner.nextInt();

        System.out.println("Me informe mais um valor para seu triangulo");
        int num3 = scanner.nextInt();
        
        if (num1 == num2) {
            if (num2 == num3) {
                System.out.println("Seu triangulo e equilatero");
            } else if (num1 == num2) {
                System.out.println("Seu triangulo e isosceles");
            } else if (num2 == num3) {
                System.out.println("Seu triangulo e isosceles");
            } else if (num1 != num2) {
                if (num2 != num3){
                System.out.println("Seu triangulo e escaleno");    
                }
            }
        }        
    }
}
