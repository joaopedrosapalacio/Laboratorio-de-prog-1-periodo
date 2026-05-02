/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.controleacesso;

import java.util.Scanner;

/**
 *
 * @author Aluno
 */
public class ControleAcesso {

    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        int senha = 2026;
        int i = 0;
        int tentativa = 0;
        
        do {
            System.out.println("Digite a senha para acessar");
            tentativa = scanner.nextInt();
            if (tentativa != senha){
                System.out.println("Senha incorreta, tente novamente");
                i++;
            }
        } while (tentativa != senha);
        System.out.println("Acesso liberado");
    }
}
