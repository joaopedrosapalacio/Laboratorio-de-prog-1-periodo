/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.minutosestudos;

import java.util.Scanner;

/**
 *
 * @author Aluno
 */
public class MinutosEstudos {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Quantas horas voce estudou no dia? ");
        int horas = scanner.nextInt();
        double num = 60;
        double minutos = horas * num;
        System.out.println("Seu tempo de estudos em minutos e de: " + minutos);
    }
}
