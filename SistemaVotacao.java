/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.sistemavotacao;

import java.util.Scanner;

/**
 *
 * @author Aluno
 */
public class SistemaVotacao {

    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        System.out.println("Opcao de voto:");
        System.out.println("1-candidato A");
        System.out.println("2-candidato B");
        System.out.println("3-branco");
        System.out.println("0-encerrar");
        int voto = 0;
        int a = 0;
        int b = 0;
        int branco = 0;
        
        do {
            voto = scanner.nextInt();
            
            if (voto == 1){
                a++;
            } else if (voto == 2){
                b++;
            } else if (voto == 3){
                branco++;
            } else if (voto != 0){
                System.out.println("Votos encerrados");
            }
        } while (voto != 0);
        int total = a + b + branco;
        System.out.println("Votos para o candidato A: " + a);
        System.out.println("Votos para o candidato B: " + b);
        System.out.println("Votos brancos: " + branco);
        System.out.println("Total de votos: " + total);
    }
}
