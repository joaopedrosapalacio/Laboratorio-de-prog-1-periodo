/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.vetorinvertido;

import java.util.Scanner;

/**
 *
 * @author Joao Pedro
 */
public class VetorInvertido {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int vetor[] = new int[7];
        int i;
        
        for (i = 0; i < vetor.length; i++){
            System.out.println("Digite os numeros");
            vetor[i] = scanner.nextInt();
        } for (i = 0; i < vetor.length; i++){
            System.out.println("Vetor na ordem normal" + vetor[i]);
        }  for (i = vetor.length - 1; i >= 0; i--) {
            System.out.println("Vetor na ordem invertida: " + vetor[i]);
        }
    }
}
