/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.caixaeletronico;

import java.util.Scanner;

/**
 *
 * @author Joao Pedro
 */
public class CaixaEletronico {

    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        System.out.println("Menu do caixa");
        System.out.println("1-Depositar");
        System.out.println("2-Sacar");
        System.out.println("3-Ver saldo");
        System.out.println("0-Sair");
        int opcao;
        
        do {
            System.out.println("Qual opcao voce vai escolher?");
            opcao = scanner.nextInt();
            
            if (opcao == 1) {
                System.out.println("Voce escolheu depositar");
            } else if (opcao == 2) {
                System.out.println("Voce escolheu sacar");
            } else if (opcao == 3) {
                System.out.println("Voce escolheu ver salda");
            } else if (opcao == 0) {
                System.out.println("Saindo do programa");
            } else if (opcao > 3) {
                System.out.println("Digite um numero que esta no menu");
            } else if (opcao < 0) {
                System.out.println("Digite um numero que esta no menu");
            }
        } while (opcao != 0);
    }
}
