/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.somacadalinha;

import java.util.Scanner;

/**
 *
 * @author Joao Pedro Sapalacio
 */
public class SomaCadaLinha {

    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        int matriz [][] = new int [3][3];
        int i;
        int j;
        int soma;
        
        System.out.println("coloque os valores para a matriz");
        for (i = 0; i < matriz.length; i++){
            soma = 0;
            for (j = 0; j < matriz.length; j ++){
                matriz[i][j] = scanner.nextInt();
                soma += matriz[i][j];
            }
        System.out.println("A soma da " + i + " e: " + soma);
        }
    }
}