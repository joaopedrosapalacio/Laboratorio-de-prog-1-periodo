/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.salario;

import java.util.Scanner;

/**
 *
 * @author Aluno
 */
public class Salario {

    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        double bonus;
        System.out.println("Me informe seu salario");
        int salario = scanner.nextInt();
        
        if (salario <= 2000) {
            bonus = salario * 1.05;
            System.out.println("Seu novo salario e: " + bonus);
        } else if (salario > 2000) {
            bonus = salario * 1.10;            
            System.out.println("Seu novo salario e: " + bonus);            
        } else if (salario > 5000) {
            bonus = salario * 1.15;
            System.out.println("Seu novo salario e: " + bonus);            
        }
    }
}
