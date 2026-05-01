/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.pontuacao;
import java.util.Scanner;
/**
 *
 * @author Aluno
 */
public class Pontuacao {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite sua pontuacao da prova");
        int pontuacao = scanner.nextInt();
        if (pontuacao >= 90){
            System.out.println("Excelente");
        } else if (pontuacao >= 70){
            System.out.println("Bom");
        } else if (pontuacao >=50){
            System.out.println("Regular");
        } else{
            System.out.println("Insuficiente");
        }
    }
}
