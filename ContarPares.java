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
        Scanner scanner = new Scanner (System.in);
        String pares = "";
        int i = 1;
        
        while (i <= 5) {
            System.out.println("Digite 5 numeros");
            int numero = scanner.nextInt();
        if (numero % 2 ==0) {
            pares += numero + " ";
        }
        i++;
    }
        System.out.println(pares);
    }
}
