/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.sistemademonitoramentoservidores;

import java.util.Scanner;

/**
 *
 * @author Joao Pedro Sapalacio
 */
public class SistemaDeMonitoramentoServidores {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int vetor[] = new int[7];
        int i;
        int media;
        int soma = 0;
        int maior = 0;
        int menor = 0;
        int contador = 0;
        int posicaoMaior = 0;
        
        System.out.println("Coloque o valor da CPU");
        
        for (i = 0; i < vetor.length; i++){
            vetor[i] = scanner.nextInt();
            soma += vetor[i];
            
            if (i == 0){
                maior = vetor[i];
                menor = vetor[i];
                posicaoMaior = i;
            } else {
                
                if (vetor[i] > maior){
                    maior = vetor[i];
                    posicaoMaior = i;
                } if (vetor[i] < menor){
                menor = vetor[i];
                }
            }
            if (vetor[i] > 80){
                contador++;
            }
        }
        media = soma / 7;
        System.out.println("O maior uso de CPU e: " + maior + " E sua posicao e: " + posicaoMaior);
        System.out.println("O menor uso de CPU e: " + menor);
        System.out.println("A media de uso dos CPUs e: " + media);
        System.out.println("A quantidade de CPUs que ficaram a cima de 80% e: " + contador);
    }
}
