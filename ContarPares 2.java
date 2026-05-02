/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.contarpares;

import java.util.Scanner;

/**
 *
 * @author Joao Pedro
 */
public class ContarPares {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numeros[] = new int[5];
        int i;
        System.out.println("Digite os numeros");
        
        for (i = 0; i < numeros.length; i++) {
            numeros[i] = scanner.nextInt();
            
        } for (i = 0; i < numeros.length; i++) {
            if (numeros[i] % 2 == 0) {
                System.out.println("Os numeros pares sao: " + numeros[i]);
            }
        }
    }
}
