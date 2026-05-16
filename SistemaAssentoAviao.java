/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.sistemaassentoaviao;

import java.util.Scanner;

/**
 *
 * @author Joao Pedro Sapalacio
 */
public class SistemaAssentoAviao {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int matriz [][] = new int [4][4];
        int i;
        int j;
        int livres = 0;
        int ocupados = 0;
        
        System.out.println("Coloque 1 para assentos ocupados e 0 para livres");
        
        for (i = 0; i < matriz.length; i++){
            for (j = 0; j < matriz.length; j++){
                matriz[i][j] = scanner.nextInt();
                if (matriz[i][j] != 1 && matriz[i][j] != 0){
                    System.out.println("Numero nao identificado. Coloque 0 ou 1");
                }
                if (matriz[i][j] == 0){
                    livres++;
                } else if (matriz[i][j] == 1){
                    ocupados++;
                }
            }
        }
        double percentual = (ocupados * 100) / 16;
        if (percentual > 70){
            System.out.println("Voo lotado");
        }
        System.out.println("Quantidade de assentos livres e: " + livres);
        System.out.println("Quantidade de assentos ocupados e: " + ocupados);
        System.out.println("O percentual de assentos ocupados e: " + percentual);
    }
}
