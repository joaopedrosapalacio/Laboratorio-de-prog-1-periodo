/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.anobissexto;

import java.util.Scanner;

/**
 *
 * @author Aluno
 */
public class AnoBissexto {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um ano");
        int ano = scanner.nextInt();
        
        if (ano % 4 == 0) {
            System.out.println("Seu ano e bissexto");
        } else {
            System.out.println("Seu ano nao e bissexto");
        }
    }
}
