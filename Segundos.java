/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.segundos;

import java.util.Scanner;

/**
 *
 * @author Aluno
 */
public class Segundos {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("De um valor para segundos");
        int segundos = scanner.nextInt();
        double num = 60;
        double minutos = segundos / num;
        System.out.println("Seu valor em minutos e de: " + minutos);
        
    }
}
