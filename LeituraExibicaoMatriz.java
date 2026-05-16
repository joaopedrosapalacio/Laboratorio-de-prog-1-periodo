/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.leituraexibicaomatriz;

import java.util.Scanner;

/**
 *
 * @author Joao Pedro Sapalacio
 */
public class LeituraExibicaoMatriz {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int matriz[][] = new int [2][2];
        int i;
        int j;
        
        System.out.println("Coloque os valores para a matriz");
        for (i = 0; i < matriz.length; i++){
            for (j = 0; j < matriz.length; j++){
                matriz[i][j] = scanner.nextInt();
            }
        }
        for (i = 0; i < matriz.length; i++){
            for (j = 0; j < matriz.length; j++){
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }
}
