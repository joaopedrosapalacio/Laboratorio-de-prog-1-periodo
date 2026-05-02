/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.temperatura;

import java.util.Scanner;

/**
 *
 * @author Aluno
 */
public class Temperatura {

    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        System.out.println("Digite a temperatura em graus celsius");
        double temperatura = scanner.nextDouble();
        
        if (temperatura < 15) {
            System.out.println("Frio");
        } else if (temperatura > 30) {
            System.out.println("Calor");
        } else if (temperatura >= 15) {
            System.out.println("Clima agradavel");
        }
    }
}
