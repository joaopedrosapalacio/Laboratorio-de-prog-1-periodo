/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.somacadacoluna;

import java.util.Scanner;

/**
 *
 * @author Joao Pedro Sapalacio
 */
public class SomaCadaColuna {

    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        int matriz [][] = new int [3][3];
        int i;
        int j;
        int soma;
        
        System.out.println("coloque os valores para a matriz");
        for (j = 0; j < matriz.length; j++){
            soma = 0;
            for (i = 0; i < matriz.length; i ++){
                matriz[i][j] = scanner.nextInt();
                soma += matriz[j][i];
            }
        System.out.println("A soma dos valores e: " + soma);
        }
    }
}