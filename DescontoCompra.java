/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.descontocompra;

import java.util.Scanner;

/**
 *
 * @author Aluno
 */
public class DescontoCompra {

    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        double desconto = 10;
        
        System.out.println("Me informe o valor da sua compra");
        double compra = scanner.nextDouble();
        
        if (compra > 200) {
            double calculo = compra * (desconto / 100);
            double valorFinal = compra - calculo;
            System.out.println("Voce ganhou um desconto de 10% seu valor final e: " + valorFinal);
        } else {
            System.out.println("Voce nao obteve o desconto. Seu preco final e de: " + compra);
        }
    }
}
