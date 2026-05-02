/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.contarpositivos;

import java.util.Scanner;

/**
 *
 * @author Joao Pedro
 */
public class ContarPositivos {

    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        int numeros[] = new int[5];
        int i;
        System.out.println("Digite os numeros");
        
        for (i = 0; i < numeros.length; i++) {
            numeros[i] = scanner.nextInt();
        } for (i = 0; i < numeros.length; i++) {
        if (numeros[i] >= 0) {
            System.out.println("Os numeros positivos sao: " + numeros[i]);
        }
        }
    }
}
