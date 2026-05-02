/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.notavalida;

import java.util.Scanner;

/**
 *
 * @author Joao Pedro
 */
public class NotaValida {

    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        int nota = -1;
        
        while (nota < 0 || nota > 10) {
            System.out.println("Digite uma nota");
            nota = scanner.nextInt();
        }
        System.out.println("Fechar programa");
    }
}
