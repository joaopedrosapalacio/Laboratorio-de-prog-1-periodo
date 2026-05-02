/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.buscarvetor;

import java.util.Scanner;

/**
 *
 * @author Joao Pedro
 */
public class BuscarVetor {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int vetor [] = new int[6];
        int i;
        int busca;
        boolean encontrou = false;
        
        for (i = 0; i < vetor.length; i++) {
            System.out.println("Digite os numeros");
            vetor[i] = scanner.nextInt();
        }
        System.out.println("Qual numero deseja procurar?");
        busca = scanner.nextInt();
        
        for (i = 0; i < vetor.length; i++) {
            if (busca == vetor[i]){
                encontrou = true;
                System.out.println("Numero encontrado");
                System.out.println("Esta na posicao de numero: " + i);
            } else {
                encontrou = false;
                System.out.println("Esse numero nao existe");
            }
        }
    }
}
