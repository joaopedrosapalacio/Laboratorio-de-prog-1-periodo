/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.areacirculo;

import java.util.Scanner;

/**
 *
 * @author Aluno
 */
public class AreaCirculo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("De um valor para um raio de um circulo");
        int valor = scanner.nextInt();
        double pi = 3.14;
        double total = pi * valor * valor;
        System.out.println("A area do seu circulo e igual a: " + total);
    }
}
