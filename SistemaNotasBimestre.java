/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.sistemanotasbimestre;

import java.util.Scanner;

/**
 *
 * @author Joao Pedro Sapalacio
 */
public class SistemaNotasBimestre {

    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        double matriz[][] = new double[5][4];
        double media[] = new double[5];
        int i;
        int j;
        double soma;
        double somaSala = 0;
        double maiorMedia = 0;
        double menorMedia = 0;
        
        System.out.println("Coloque as notas dos alunos");
        for (i = 0; i < matriz.length; i++){
            soma = 0;
            for (j = 0; j < matriz[i].length; j++){
                matriz[i][j] = scanner.nextDouble();
                soma += matriz[i][j];
            }
            media[i] = soma / 4;
            somaSala += media[i];
            
            if (i == 0){
                maiorMedia = media[i];
                menorMedia = media[i];
            } else {
                if (media[i] > maiorMedia){
                    maiorMedia = media[i];
                } 
                if (media[i] < menorMedia){
                    menorMedia = media[i];
                }
            }
        }
        for (i = 0; i < matriz.length; i++){
            double mediaFinal = media[i];
            
            if (mediaFinal >= 7){
                System.out.println("Aprovado");
            } else if (mediaFinal >= 5){
                System.out.println("Recuperacao");
            } else {
                System.out.println("Reprovado");
            }
        }
        double mediaSala = somaSala / 5;
        System.out.println("A maior media e: " + maiorMedia);
        System.out.println("A menor media e: " + menorMedia);
        System.out.println("A media geral da sala e: " + mediaSala);
    }
}
