/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.energia;

import java.util.Scanner;

/**
 *
 * @author Aluno
 */
public class Energia {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("De a potencia de seu aparelho em Watts");
        int potencia = scanner.nextInt();
        System.out.println("Quanto tempo voce usou esse aparelho? ");
        int tempo = scanner.nextInt();
        double num = 1000;
        double kwh = (potencia * tempo) / num;
        System.out.println("Seu consumo e de: " + kwh);
    }
}
