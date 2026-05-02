/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.invertervalores;

import java.util.Scanner;

/**
 *
 * @author Aluno
 */
public class InverterValores {

    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        int numeros[] = new int[5];
        int i;
        System.out.println("Digite os numeros");
        
        for (i = 0; i < numeros.length; i++) {
            numeros[i] = scanner.nextInt();
        } for (i = numeros.length - 1; i >= 0; i--) {
            System.out.println("Os numeros na ordem inversa sao: " + numeros[i]);
        }
    }
}
