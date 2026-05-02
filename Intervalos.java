/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.intervalos;

import java.util.Scanner;

/**
 *
 * @author Aluno
 */
public class Intervalos {

    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        System.out.println("Digite um numero");
        int numero = scanner.nextInt();
        
        if (numero > 20){
            System.out.println("Seu numero e maior que 20");
        } else if (numero > 10) {
            System.out.println("Seu numero esta entre 11 e 20");
        }  else if (numero >= 0) {
            System.out.println("Seu numero esta entre 0 e 10");
        }
    }
}
