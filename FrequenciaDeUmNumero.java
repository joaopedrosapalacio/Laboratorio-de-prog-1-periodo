/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.frequenciadeumnumero;

import java.util.Scanner;

/**
 *
 * @author Joao Pedro
 */
public class FrequenciaDeUmNumero {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int vetor[] = new int[8];
        int i;
        int contador = 0;
        System.out.println("Digite os valores");
        
        for (i = 0; i < vetor.length; i++) {
            vetor[i] = scanner.nextInt();
        }
        System.out.println("Digite um valor");
        int valor = scanner.nextInt();
       
        for (i = 0; i < vetor.length; i++) {
            if (vetor[i] == valor) {
                contador++;
            }
        }
        System.out.println("A quantidade que este valor aparece no vetor e: " + contador);
    }
}
