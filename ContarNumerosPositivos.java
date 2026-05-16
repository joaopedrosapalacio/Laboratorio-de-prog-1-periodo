/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.contarnumerospositivos;

import java.util.Scanner;

/**
 *
 * @author Joao Pedro Sapalacio
 */
public class ContarNumerosPositivos {

    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        int matriz [][] = new int [3][3];
        int i;
        int j;
        int positivos = 0;
        
        System.out.println("coloque os valores para a matriz");
        for (i = 0; i < matriz.length; i++){
            for (j = 0; j < matriz.length; j ++){
                matriz[i][j] = scanner.nextInt();
                if (matriz[i][j] >= 0){
                    positivos++;
                }
            }
        }
        System.out.println("O total de positivos e: " + positivos);
    }
}
