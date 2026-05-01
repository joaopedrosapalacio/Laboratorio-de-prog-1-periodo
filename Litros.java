/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.litros;

import java.util.Scanner;

/**
 *
 * @author Aluno
 */
public class Litros {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("De um valor em litros ");
        int litros = scanner.nextInt();
        double num =1000;
        double mililitros = litros * num;
        System.out.println("Seu valor em mililitros e de: " + mililitros);
    }
}
