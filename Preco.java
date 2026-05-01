/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.preco;

import java.util.Scanner;

/**
 *
 * @author Aluno
 */
public class Preco {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("De um valor de um produto");
        int valor = scanner.nextInt();
        double num = 0.15;
        double acrescimo = valor * num;
        double precoFinal = valor + acrescimo;
        System.out.println("Seus preco final e de: " + precoFinal);
    }
}
