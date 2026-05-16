/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.sistemacorrecaoprova;

import java.util.Scanner;

/**
 *
 * @author Joao Pedro Sapalacio
 */
public class SistemaCorrecaoProva {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double vetor[] = new double [5];
        int i;
        double maior = 0;
        double menor = 0;
        int aprovados = 0;
        int reprovados = 0;
        int recuperacao = 0;
        int soma = 0;
        
        System.out.println("Coloque as notas dos alunos");
        
        for (i = 0; i < vetor.length; i++){
            vetor[i] = scanner.nextInt();
            soma += vetor[i];
            
            if (i == 0){
                maior = vetor[i];
                menor = vetor[i];
            } else {
                if (vetor[i] > maior){
                    maior = vetor[i];
                } else if (vetor[i] < menor){
                    menor = vetor[i];
                }
                if (vetor[i] >= 7){
                    aprovados++;
                } else if (vetor[i] >= 5){
                    recuperacao++;
                } else {
                    reprovados++;
                }
            }
        }
        double media = soma / 5;
        System.out.println("A maior nota e: " + maior);
        System.out.println("A menor nota e: " + menor);
        System.out.println("Os alunos aprovados sao: " + aprovados);
        System.out.println("Os alunos que ficaram de recuperacao foram: " + recuperacao);
        System.out.println("Os alunos que reprovaram sao: " + reprovados);
    }
}
