/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.velocidade;
import java.util.Scanner;
/**
 *
 * @author Aluno
 */
public class Velocidade {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Diga a velocidade do carro");
        int velocidade = scanner.nextInt();
        if (velocidade <= 60){
            System.out.println("Dentro do limite");
        } else if (velocidade <= 80){
            System.out.println("Multa leve");
        } else if (velocidade <= 100){
            System.out.println("Multa grave");
        } else {
            System.out.println("Multa gravissima");
        }
    }
}
