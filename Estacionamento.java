/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.estacionamento;
import java.util.Scanner;
/**
 *
 * @author Aluno
 */
public class Estacionamento {

    public static void main(String[] args) {
        Scanner scanner  = new Scanner(System.in);
        System.out.println("Digite o tempo de permanencia no estacionamento");
        int tempo = scanner.nextInt();
        if (tempo <= 1){
        System.out.println("R$ 5");
    } else if (tempo <= 3){
        System.out.println("R$ 10");
    } else if (tempo <= 6){
        System.out.println("R$ 15");
    } else{
        System.out.println("R$ 20");
    }
    }
}
