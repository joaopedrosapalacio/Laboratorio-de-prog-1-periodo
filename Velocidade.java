/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.velocidade;

import java.util.Scanner;

/**
 *
 * @author Aluno
 */
public class Velocidade {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Qual foi a distancia percorrida em km? ");
        int distancia = scanner.nextInt();
        System.out.println("Quanto tempo foi gasto em horas? ");
        int tempo = scanner.nextInt();
        int soma = distancia / tempo;
        System.out.println("Sua velocidade media e de: " + soma);
        
    }
}
