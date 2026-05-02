/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.contarpositivo;

import java.util.Scanner;

/**
 *
 * @author Joao Pedro
 */
public class ContarPositivo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        String positivo = "";
        int i = 1;
        
        while (i <= 5) {
            System.out.println("Digite 5 numeros");
            int numero = scanner.nextInt();
        if (numero >=0) {
            positivo += numero + " ";
        }
        i++;
    }
        System.out.println(positivo);
    }
}
