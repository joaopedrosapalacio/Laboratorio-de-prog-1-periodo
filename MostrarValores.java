/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mostrarvalores;

import java.util.Scanner;

/**
 *
 * @author Joao Pedro
 */
public class MostrarValores {

    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        int numeros[] = new int[5];
        int i;
        System.out.println("Digite os valores para armazenar no vetor");
        
        for (i = 0; i < numeros.length; i++) {
            numeros[i] = scanner.nextInt();
            
        } for (i = 0; i < numeros.length; i++) {
            System.out.println("Seus valores digitados sao: " + numeros[i]);
        }
    }
}
