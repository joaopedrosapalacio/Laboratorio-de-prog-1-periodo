/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.sistemanota;

import java.util.Scanner;

/**
 *
 * @author Aluno
 */
public class SistemaNota {

    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        System.out.println("digite sua primeira nota");
        double nota1 = scanner.nextDouble();
        
        System.out.println("digite sua segunda nota");
        double nota2 = scanner.nextDouble();
        
        System.out.println("digite sua terceira nota");
        double nota3 = scanner.nextDouble();
        
        double media = (nota1 + nota2 + nota3) / 3;
        
        if (media >= 7) {
            System.out.println("Aprovado");
        } else if (media >= 5) {
            System.out.println("Recuperacao");
        } else {
            System.out.println("Recuperacao");
        }
    }
}
