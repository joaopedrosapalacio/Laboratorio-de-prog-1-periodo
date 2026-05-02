/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.controletemperatura;

import java.util.Scanner;

/**
 *
 * @author Aluno
 */
public class ControleTemperatura {

    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        int temperatura = 0;
        int i = 0;
        int maior = 0;
        int menor = 0;
        
        do {
            System.out.println("Digite a temperatura");
            temperatura = scanner.nextInt();
            
            if (temperatura != 999){
                if (i == 0){
                    maior = temperatura;
                    menor = temperatura;
                } else {
                    if (temperatura > maior){
                        maior = temperatura;
                } if (temperatura < menor){
                        menor = temperatura;
                }
            }
            i++;
        }
        } while (temperatura != 999);
        System.out.println("Maior temperatura e: " + maior);
        System.out.println("Menor temperatura e: " + menor);
    }
}
