/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.jogoadivinhacao;

import java.util.Scanner;

/**
 *
 * @author Joao Pedro
 */
public class JogoAdivinhacao {

    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        int num = 7;
        int tentativa;
        
        do {
            System.out.println("Adivinhe qual e o numero");
            tentativa = scanner.nextInt();
            
            if (num != tentativa){
                System.out.println("Tente novamente");
            } else {
                System.out.println("Acertou");
            }
        } while (num != tentativa);
    }
}
