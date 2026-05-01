/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.idade;
import java.util.Scanner;
/**
 *
 * @author Aluno
 */
public class Idade {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Qual e a sua idade?");
        int idade = scanner.nextInt();
        if (idade <= 2){
            System.out.println("Bebe");
        } else if (idade <= 12){
            System.out.println("Criança");
        } else if (idade <= 17){
            System.out.println("Adolecente");
        } else if (idade <= 59){
            System.out.println("Adulto");
        } else {
            System.out.println("Idoso");
        }
    }
}
