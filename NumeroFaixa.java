/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.numerofaixa;

import java.util.Scanner;

/**
 *
 * @author Aluno
 */
public class NumeroFaixa {

    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        System.out.println("Informe um numero");
        int numero = scanner.nextInt();
        
        if (numero >= 20) {
            if (numero <= 50){
            System.out.println("Seu numero esta na linha");                
            } else {
            System.out.println("Seu numero nao esta dentro da faixa");
        }
        } else {
            System.out.println("Seu numero nao esta dentro da faixa");
        }
        
    }
}
