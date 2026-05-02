/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.media;

import java.util.Scanner;

/**
 *
 * @author Aluno
 */
public class Media {

    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        System.out.println("Digite sua primeira nota");
        double nota1 = scanner.nextDouble();
        System.out.println("Digite sua segunda nota");
        double nota2 = scanner.nextDouble();
        
        double media = (nota1 + nota2) / 2;
        
        if (media >= 7) {
            System.out.println("Aprovado");
        } else {
            System.out.println("Reprovado");
        }
    }
}
