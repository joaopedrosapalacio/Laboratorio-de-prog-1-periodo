/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.somapositivo;

import java.util.Scanner;

/**
 *
 * @author Joao Pedro
 */
public class SomaPositivo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        String positivo = "";
        int i = 1;
        int soma = 0;
        
        while (i <= 6) {
            System.out.println("Digite 5 numeros");
            int numero = scanner.nextInt();
        if (numero >=0) {
            positivo += numero + " ";
            soma += numero;
        }
        i++;
    }
        System.out.println(soma);
    }
}
