/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.atividadelabprogramacao;

import java.util.Scanner;

/**
 *
 * @author Aluno
 */
public class AtividadeLabProgramacao {

    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        System.out.println("De um valor para um lado de um quadrado");
        int valor = scanner.nextInt();
        double num = 4;
        double total = valor * num;
        System.out.println("O perimetro total do seu quadrado e de: " + total);
    }
}
