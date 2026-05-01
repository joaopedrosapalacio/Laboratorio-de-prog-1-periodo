/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.centimetros;

import java.util.Scanner;

/**
 *
 * @author Aluno
 */
public class Centimetros {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("De uma distancia em km");
        int distancia = scanner.nextInt();
        double centimetros = 100000;
        double total = distancia * centimetros;
        System.out.println("Sua distancia em centimetros e igual a: " + total);
    }
}
