/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.verificacaomultiplos;

import java.util.Scanner;

/**
 *
 * @author Aluno
 */
public class VerificacaoMultiplos {

    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        System.out.println("Me informe um numero inteiro");
        int numero = scanner.nextInt();
        
        if (numero % 7 == 0) {
            System.out.println("Seu numero e multiplo de 7");
        } else {
            System.out.println("Seu numero nao e multiplo de 7");
        }
    }
}
