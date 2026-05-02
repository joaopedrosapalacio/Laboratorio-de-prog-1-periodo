/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.sistemacompras;

import java.util.Scanner;

/**
 *
 * @author Aluno
 */
public class SistemaCompras {

    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        int total = 0;
        int i = 0;
        double valor = 0;
        
        do {
            System.out.println("Digite o valor do produto(para sair digite -1)");
            valor = scanner.nextDouble();
            
            if (valor != -1){
                total += valor;
                i++;
            }
            
        } while(valor != -1);
        System.out.println("Total de compras foi: " + total);
        System.out.println("Quantidade de produtos: " + i);
    }
}
