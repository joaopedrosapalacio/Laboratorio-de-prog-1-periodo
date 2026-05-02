/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.numeropositivoobrigatorio;

import java.util.Scanner;

/**
 *
 * @author Joao Pedro
 */
public class NumeroPositivoObrigatorio {

    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        int numero = -1;
        
        while (numero < 0) {
            System.out.println("Digite um numero");
            numero = scanner.nextInt();
        }
        System.out.println("Fechar programa");
    }
}
