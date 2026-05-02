/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mediavalidacaoreal;

import java.util.Scanner;

/**
 *
 * @author Joao Pedro
 */
public class MediaValidacaoReal {

    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        double numero = 0;
        int i = 0;
        double soma = 0;
        
        do {
            System.out.println("Digite uma nota");
            numero = scanner.nextInt();
            
            if (numero == -1){
                System.out.println("Saindo do programa");
            } else if (numero >= 0 && numero <= 10){
                soma += numero;
                i++;
            } else {
                System.out.println("Nota invalida, digite uma nota entre 0 e 10");
            }
        } while (numero != -1);
        double media = soma / i;
        System.out.println("Quantidade de notas validas " + i);
        System.out.println("A media das notas sao: " + media);
    }
}
