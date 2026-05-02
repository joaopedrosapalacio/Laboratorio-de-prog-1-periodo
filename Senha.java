/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.senha;

import java.util.Scanner;

/**
 *
 * @author Joao Pedro
 */
public class Senha {

    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        int numero = -1;
        
        while (numero != 1234) {
            System.out.println("Digite a senha correta");
            numero = scanner.nextInt();
        }
        System.out.println("Senha correta");
    }
}