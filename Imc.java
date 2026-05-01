/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.imc;
import java.util.Scanner;
/**
 *
 * @author Aluno
 */
public class Imc {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite seu imc");
        double imc = scanner.nextDouble();
        if (imc <= 18.5){
            System.out.println("Abaixo do peso");
        } else if (imc <= 24.9){
            System.out.println("Peso normal");
        } else if (imc <= 29.9){
            System.out.println("Sobrepeso");
        } else {
            System.out.println("Obesidade");
        }
    }
}
