/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.notaanalisecompleta;

import java.util.Scanner;

/**
 *
 * @author Joao Pedro
 */
public class NotaAnaliseCompleta {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double vetor[] = new double[6];
        int i;
        double maior;
        double menor;
        double soma = 0;
        double media;
        int aprovado = 0;
        int reprovado = 0;
        System.out.println("Digite um numero:");
        vetor[0] = scanner.nextDouble();

        maior = vetor[0];
        menor = vetor[0];
        soma = vetor[0];
        if (vetor[0] >= 6) {
            aprovado++;
        } else {
            reprovado++;
        }

        System.out.println("Digite os valores para o vetor");
        
        for (i = 1; i < vetor.length; i++) {
            vetor[i] = scanner.nextDouble();
            
            soma += vetor[i];
            
            if (vetor[i] > maior) {
                maior = vetor[i];
            } else if (vetor[i] < menor) {
                menor = vetor[i];
            } if (vetor[i] >= 6) {
                aprovado++;
            } else {
                reprovado++;
            }
        }
        media = soma / 6;
        System.out.println("A media das notas e de: " + media);
        System.out.println("A maior nota e: " + maior);
        System.out.println("A menor nota e: " + menor);
        System.out.println("O numero de notas acima de 6 e: " + aprovado);
        System.out.println("O numero de notas abaixo de 6 e: " + reprovado);
    }
}
