/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.areatrapezio;

import java.util.Scanner;

/**
 *
 * @author Aluno
 */
public class AreaTrapezio {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("valor da base maior");
        int baseMaior = scanner.nextInt();
        System.out.println("Valor da base menor");
        int baseMenor = scanner.nextInt();
        System.out.println("Valor da altura");
        int altura = scanner.nextInt();
        double num = 2;
        double area = (baseMaior + baseMenor) * altura / num;
        System.out.println("A area do seu trapezio e de: " + area);
        
    }
}
