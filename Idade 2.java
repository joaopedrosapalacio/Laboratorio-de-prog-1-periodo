/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.idade;

import java.util.Scanner;

/**
 *
 * @author Aluno
 */
public class Idade {

    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        System.out.println("Digite sua idade");
        int idade = scanner.nextInt();
        
        if (idade >= 60) {
            System.out.println("Idoso");
        } else if (idade >= 18) {
            System.out.println("Adulto");
        } else if (idade >= 13) {
            System.out.println("Adolecente");
        } else if (idade <= 12) {
            System.out.println("Crianca");
        }
            
    }
}
