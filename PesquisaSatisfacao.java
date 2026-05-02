/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.pesquisasatisfacao;

import java.util.Scanner;

/**
 *
 * @author Aluno
 */
public class PesquisaSatisfacao {

    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        System.out.println("De uma nota para esta pesquisa");
        System.out.println("1-satisfeito");
        System.out.println("2-neutro");
        System.out.println("3-insatisfeito");
        System.out.println("0-encerrar");
        int pesquisa = 0;
        int satisfeito = 0;
        int neutro = 0;
        int insatisfeito = 0;

        do {
            pesquisa = scanner.nextInt();
            
            if (pesquisa == 1){
                satisfeito++;
            } else if (pesquisa == 2){
              neutro++;
            } else if (pesquisa == 3){
              insatisfeito++;
            } else if (pesquisa != 0){
                System.out.println("Encerrar pesquisa");
            }
        } while (pesquisa != 0);
        System.out.println("Satisfeitos: " + satisfeito);
        System.out.println("neutros: " + neutro);
        System.out.println("Insatisfeito: " + insatisfeito);
    }
}
