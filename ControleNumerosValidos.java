/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.controlenumerosvalidos;

import java.util.Scanner;

/**
 *
 * @author Joao Pedro
 */
public class ControleNumerosValidos {

    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        int numero;
        
        do {
            System.out.println("Digite um numero");
            System.out.println("Digite -999 para sair");
            numero = scanner.nextInt();
            
            if (numero == -999) {
                System.out.println("Saindo do programa");
            } else if (numero >= 0) {
                
            } else if (numero < 0) {
                System.out.println("Numero invalido, digite um numero positivo");
            } 
        } while (numero != -999);
    }
}
