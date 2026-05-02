/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.repetirmensagem;

import java.util.Scanner;

/**
 *
 * @author Joao Pedro
 */
public class RepetirMensagem {

    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        System.out.println("Digite um numero");
        int numero = scanner.nextInt();
        
        while (numero >= 1) {
            System.out.println("Ola");
            numero--;
        }
    }
}
