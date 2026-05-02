/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.leitornumero;

import java.util.Scanner;

/**
 *
 * @author Joao Pedro
 */
public class LeitorNumero {

    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        System.out.println("digite 5 numeros");
        int numeros = scanner.nextInt();
        
        int i = 1;
        
        while (i <= 5) {
            int digito = numeros % 10;
            System.out.println(digito);
            numeros = numeros / 10;
            i++;
        }
    }
}
