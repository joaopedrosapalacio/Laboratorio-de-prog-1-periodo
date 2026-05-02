/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.contarnumerosdigitados;

import java.util.Scanner;

/**
 *
 * @author Joao Pedro
 */
public class ContarNumerosDigitados {

    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        int numero = -1;
        int i = 0;
        
        while (numero != 0) {
            System.out.println("Digite um numero");
            numero = scanner.nextInt();
            
            if (numero != 0) {
                i++;
            }
            }
        System.out.println("Fechar programa");
        System.out.println("O tanto de numeros que foram digitados e " + i);
    }
}
