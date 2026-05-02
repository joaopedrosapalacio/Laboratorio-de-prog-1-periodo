/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.controlealunos;

import java.util.Scanner;

/**
 *
 * @author Aluno
 */
public class ControleAlunos {

    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        double nota;
        int soma = 0;
        double maior = -1;
        int i = 0;
        
        do {
            System.out.println("Digite as notas(digite -1 para sair)");
            nota = scanner.nextDouble();
            
            if (nota != -1){
                soma += nota;
                i++;
            if (nota > maior){
                maior = nota;
            }
            }
        } while (nota != -1);
        double media = (soma / i);
        System.out.println("A media das notas sao: " + media);
        System.out.println("Maior nota: " + maior);
    }
}
