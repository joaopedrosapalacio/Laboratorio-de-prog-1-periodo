/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.encontrarposicaomaiorvalor;

import java.util.Scanner;

/**
 *
 * @author Joao Pedro Sapalacio
 */
public class EncontrarPosicaoMaiorValor {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int matriz[][] = new int [3][3];
        int i;
        int j;
        int maior;
        int linha = 0;
        int coluna = 0;
        
        System.out.println("Coloque os valores para a matriz");
        for (i = 0; i < matriz.length; i++){
            for (j = 0; j < matriz.length; j++){
                matriz[i][j] = scanner.nextInt();
            }
        }
        maior = matriz[0][0];
        for (i = 0; i < matriz.length; i++){
            for (j = 0; j < matriz.length; j++){
                    if (matriz[i][j] > maior){
                    maior = matriz [i][j];
                    linha = i;
                    coluna = j;
                }
            }
        }
        System.out.print("O maior valor e: " + maior + " esta na linha " + linha + " coluna " + coluna);
    }
}

